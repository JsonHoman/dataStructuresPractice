import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class SearchingAlgorithmsTest {

    @Test
    @DisplayName("Should return index of first occurrence")
    public void binarySearchTest() {
        // given
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3,4,5};
        int[] array4 = {1,2,3,4,5};
        int[] array5 = {5,6,10,13,14,18,30,34,35,37,40,44,64,79,84,86,95,96,98,99};
        int[] array6 = {5,6,10,13,14,18,30,34,35,37,40,44,64,79,84,86,95,96,98,99};
        int[] array7 = {5,6,10,13,14,18,30,34,35,37,40,44,64,79,84,86,95,96,98,99};

        // when
        int result1 = SearchingAlgorithms.binarySearch(array1, 2);
        int result2 = SearchingAlgorithms.binarySearch(array2, 3);
        int result3 = SearchingAlgorithms.binarySearch(array3, 5);
        int result4 = SearchingAlgorithms.binarySearch(array4, 6);
        int result5 = SearchingAlgorithms.binarySearch(array5, 10);
        int result6 = SearchingAlgorithms.binarySearch(array6, 95);
        int result7 = SearchingAlgorithms.binarySearch(array7, 100);

        // then
        assertAll("",
                () -> assertThat(result1).isEqualTo(1),
                () -> assertThat(result2).isEqualTo(2),
                () -> assertThat(result3).isEqualTo(4),
                () -> assertThat(result4).isEqualTo(-1),
                () -> assertThat(result5).isEqualTo(2),
                () -> assertThat(result6).isEqualTo(16),
                () -> assertThat(result7).isEqualTo(-1)
        );
    }
}