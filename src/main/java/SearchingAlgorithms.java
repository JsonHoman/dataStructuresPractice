public class SearchingAlgorithms {
    private SearchingAlgorithms() {}

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        // (1, 2, 3, 4, 5, 6) 5
        //  S     M        E
        // (1, 2, 3, 4, 5, 6) 5
        //        S  M     E
        // (1, 2, 3, 4, 5, 6) 5
        //           S  M  E

        while (start <= end) {
            int middle = (start + end) / 2;

            if (array[middle] != target) {
                if (target < array[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                return middle;
            }
        }
        return -1;
    }
}
