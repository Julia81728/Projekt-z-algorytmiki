public class BinarySearch {
    public int binarySearch(int text[], int x) {
        int left = 0, right = text.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (text[middle] == x)
                return middle;

            if (text[middle] < x)
                left = middle + 1;

            else
                right = middle - 1;
        }
        return -1;

    }
}
