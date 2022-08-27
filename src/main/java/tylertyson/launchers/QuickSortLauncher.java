package tylertyson.launchers;

import static tylertyson.programs.QuickSort.quickSort;

public class QuickSortLauncher {
    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }

        System.out.println("Original array");
        for (Integer integer : a) System.out.print(integer);

        System.out.println();

        System.out.println("Sorted array");
        quickSort(a);
        for (Integer integer : a) System.out.print(integer);
    }
}
