import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ProblemSolvingPatterns extends Udemy {
    public static boolean sameFrequency(int int1, int int2) {
        ArrayList<Integer> int1List = intToList(int1);
        ArrayList<Integer> int2List = intToList(int2);

        // this inference in logic based on types is why Java is so secure yet so hard to read
        if (int1List.size() != int2List.size() || int2List.size() == 0) {
            return false;
        }

        HashMap<Integer, Integer> int1Map = listToMap(int1List);
        HashMap<Integer, Integer> int2Map = listToMap(int2List);

        if (int1Map.size() == 0) {
            return false;
        }

        for (int key: int1Map.keySet()) {
            if (int2Map.get(key) == null) {
                return false;
            }
            if (!int2Map.get(key).equals(int1Map.get(key))) {
                return false;
            }
        }

        return true;
    }

    public static boolean averagePair(int[] sortedIntegers, double targetAverage) {
        int pointerLower = 0;
        int pointerHigher = sortedIntegers.length - 1;

        while (pointerLower < pointerHigher) {
            double average = (sortedIntegers[pointerLower] + sortedIntegers[pointerHigher]) / 2f;

            if (average == targetAverage) {
                return true;
            } else if (average < targetAverage) {
                pointerLower++;
            } else {
                pointerHigher--;
            }
        }

        return false;
    }

    public static boolean areThereDuplicates(int ... integers) {
        HashSet<Integer> set = new HashSet<>();

        for (int integer: integers) {
            set.add(integer);
        }

        return set.size() != integers.length;
    }

    public static int maxSubarraySum(int[] integers, int integer) throws CustomExceptions.IncorrectLengthException, CustomExceptions.IncorrectLengthException {
        if (integer > integers.length) {
            throw new CustomExceptions.IncorrectLengthException(String.format("%s bigger than array param size %s", integer, integers.length));
        }

        int maxSum = 0;
        for (int i = 0; i < integer; i++) {
            maxSum += integers[i];
        }

        int tempSum = maxSum;
        for (int i = integer; i < integers.length; i++) {
            tempSum += integers[i] - integers[i-integer];
            maxSum = Math.max(tempSum, maxSum);
        }

        return maxSum;
    }

    /**
     *
     * @param integers
     * @param sum
     * @return
     */
    public static int minSubArrayLen(int[] integers, int sum) {
        int result = 0;

//        2,3,1,2,4,3 sum 7 -> 2
        // 2+3, temp sum, compare, minus index 0, add index + 1

        for (int windowLength = 1; windowLength <= integers.length; windowLength++) {
            int start = 0;
            while ((windowLength - start) < integers.length) {
                int tempSum = 0;
                while (start < (start + windowLength)) {
                    // this will happen for as many times as window
                    tempSum += integers[start];
                    start++;
                }

                if (tempSum >= sum) {
                    return windowLength;
                }
            }
        }



        return result;
    }


}
