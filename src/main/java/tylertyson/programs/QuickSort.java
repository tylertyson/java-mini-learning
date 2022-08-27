package tylertyson.programs;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        qs(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void qs(T[] arr, int min, int max) {
        int i, j;
        T pivot;

        i = min;
        j = max;
        pivot = arr[(min + max) / 2];

        do {

            while ((arr[i].compareTo(pivot) < 0) && (i < max)) {
                i++;
            }
            while ((arr[j].compareTo(pivot) > 0) && (j > min)) {
                j--;
            }

            if (i <= j) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (min < j) qs(arr, min, j);
        if (i < max) qs(arr, i, max);
    }
}




