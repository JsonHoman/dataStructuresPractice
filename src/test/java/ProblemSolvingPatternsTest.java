import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ProblemSolvingPatternsTest {
    @Test
    @DisplayName("Should return true if digits in int appear in both params.")
    public void sameFrequencyTest() {
        // when
        boolean result1 = ProblemSolvingPatterns.sameFrequency(182, 281);
        boolean result2 = ProblemSolvingPatterns.sameFrequency(34, 14);
        boolean result3 = ProblemSolvingPatterns.sameFrequency(3589578, 5879385);
        boolean result4 = ProblemSolvingPatterns.sameFrequency(22, 222);
        boolean result5 = ProblemSolvingPatterns.sameFrequency(-5, 222);
        boolean result6 = ProblemSolvingPatterns.sameFrequency(-5, -4);

        // then
        assertAll("",
                () -> assertThat(result1).isTrue(),
                () -> assertThat(result2).isFalse(),
                () -> assertThat(result3).isTrue(),
                () -> assertThat(result4).isFalse(),
                () -> assertThat(result5).isFalse(),
                () -> assertThat(result6).isFalse()
        );
    }

    @Test
    @DisplayName("Should return true if 2 ints equal the target avg.")
    public void averagePairTest() {
        // when
        int[] array1 = {1,2,3};
        boolean result1 = ProblemSolvingPatterns.averagePair(array1, 2.5d);

        int[] array2 = {1,3,3,5,6,7,10,12,19};
        boolean result2 = ProblemSolvingPatterns.averagePair(array2, 8d);

        int[] array3 = {-1,0,3,4,5,6};
        boolean result3 = ProblemSolvingPatterns.averagePair(array3, 4.1d);

        int[] array4 = {};
        boolean result4 = ProblemSolvingPatterns.averagePair(array4, 4d);

        int[] array5 = {-1,0,3,4,5,6,7};
        boolean result5 = ProblemSolvingPatterns.averagePair(array5, 4.124d);

        // then
        assertAll("",
                () -> assertThat(result1).isTrue(),
                () -> assertThat(result2).isTrue(),
                () -> assertThat(result3).isFalse(),
                () -> assertThat(result4).isFalse(),
                () -> assertThat(result5).isFalse()
        );
    }

    @Test
    @DisplayName("Should return true if 2 ints equal the target avg.")
    public void areThereDuplicatesTest() {
        // when
        boolean result1 = ProblemSolvingPatterns.areThereDuplicates(1, 2, 3);
        boolean result2 = ProblemSolvingPatterns.areThereDuplicates(1, 2, 2);
        boolean result3 = ProblemSolvingPatterns.areThereDuplicates(-1, 2, 3);
        boolean result4 = ProblemSolvingPatterns.areThereDuplicates(-1, 2, 3, -1);
        boolean result5 = ProblemSolvingPatterns.areThereDuplicates(1, 2, 3, 4, 5, 6);

        // then
        assertAll("",
                () -> assertThat(result1).isFalse(),
                () -> assertThat(result2).isTrue(),
                () -> assertThat(result3).isFalse(),
                () -> assertThat(result4).isTrue(),
                () -> assertThat(result5).isFalse()
        );
    }

    @Test
    @DisplayName("Should return max sum of the # of consecutive integers provided, " +
            "found in the array provided.")
    public void maxSubarraySumTest() throws CustomExceptions.IncorrectLengthException {
        // when
        int[] array1 = {100,200,300,400};
        int result1 = ProblemSolvingPatterns.maxSubarraySum(array1, 2);

        int[] array2 = {1,4,2,10,23,3,1,0,20};
        int result2 = ProblemSolvingPatterns.maxSubarraySum(array2, 4);

        int[] array3 = {-3,4,0,-2,6,-1};
        int result3 = ProblemSolvingPatterns.maxSubarraySum(array3, 2);

        int[] array4 = {3,-2,7,-4,1,-1,4,-2,1};
        int result4 = ProblemSolvingPatterns.maxSubarraySum(array4, 2);

//        int[] array6 = {};
//        int result6 = ProblemSolvingPatterns.maxSubarraySum(array6, 3);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(700),
                () -> assertThat(result2).isEqualTo(39),
                () -> assertThat(result3).isEqualTo(5),
                () -> assertThat(result4).isEqualTo(5),
                () -> assertThatThrownBy(() -> {
                        int[] array5 = {2,3};
                        ProblemSolvingPatterns.maxSubarraySum(array5, 3);
                    }).isInstanceOf(CustomExceptions.IncorrectLengthException.class)
                        .hasMessageContaining("3 bigger than array param size 2")
//                () -> assertThat(result6).isEqualTo(-1)
        );
    }

    @Test
    @DisplayName("Should return the min sub-array length that will add up to the sum provided.")
    public void minSubArrayLenTest() {
        // given
        int[] array1 = {2,3,1,2,4,3};
        int[] array2 = {2,1,6,5,4};
        int[] array3 = {3,1,7,11,2,9,8,21,62,33,19};
        int[] array4 = {1,4,16,22,5,7,8,9,10};
        int[] array5 = {1,4,16,22,5,7,8,9,10};
        int[] array6 = {4,3,3,8,1,2,3};
        int[] array7 = {1,4,16,22,5,7,8,9,10};

        // when
        int result1 = ProblemSolvingPatterns.minSubArrayLen(array1, 7);
        int result2 = ProblemSolvingPatterns.minSubArrayLen(array2, 9);
        int result3 = ProblemSolvingPatterns.minSubArrayLen(array3, 52);
        int result4 = ProblemSolvingPatterns.minSubArrayLen(array4, 39);
        int result5 = ProblemSolvingPatterns.minSubArrayLen(array5, 55);
        int result6 = ProblemSolvingPatterns.minSubArrayLen(array6, 11);
        int result7 = ProblemSolvingPatterns.minSubArrayLen(array7, 95);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(2),
                () -> assertThat(result2).isEqualTo(2),
                () -> assertThat(result3).isEqualTo(1),
                () -> assertThat(result4).isEqualTo(3),
                () -> assertThat(result5).isEqualTo(5),
                () -> assertThat(result6).isEqualTo(2),
                () -> assertThat(result7).isEqualTo(0)
        );
    }
}
