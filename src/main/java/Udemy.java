import java.util.ArrayList;
import java.util.HashMap;

public class Udemy {
    static ArrayList<Integer> intToList(int number) {
        ArrayList<Integer> intList = new ArrayList<>();
        while (number > 0) {
            intList.add(number % 10);
            number /= 10;
        }

        return intList;
    }

    static HashMap<Integer, Integer> listToMap(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number: list) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            }
            map.put(number, map.get(number) + 1);
        }

        return map;
    }
}
