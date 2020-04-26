package sort;

/**
 * Created by sukeshgupta on 26/04/20.
 */
public class MergeSort {


    public  static  void sort(int[] array, int l, int r) {
        if (l<r){
            int mid = (l + r) / 2;
            sort(array, l, mid);
            sort(array, mid + 1, r);
            sortArray(array, l, mid, r);
        }

    }


    public static  void sortArray(int[] array, int l, int mid, int r) {


        int[] array1 = new int[mid - l+1];
        int[] array2 = new int[r - mid];
        int a = 0;
        int b = 0;
        for (int i = l; i <= mid; i++) {
            array1[a] = array[i];
            ++a;
        }

        for (int j = mid + 1; j <= r; j++) {
            array2[b] = array[j];
            ++b;
        }

        a = 0;
        b = 0;
        int k = l;
        while (a < array1.length && b < array2.length) {

            if (array1[a] < array2[b]) {
                array[k] = array1[a];
                ++a;
            } else {
                array[k] = array2[b];
                ++b;
            }
            ++k;
        }

        while (a < array1.length) {

            array[k] = array1[a];
            ++a;
            ++k;
        }

        while (b < array2.length) {

            array[k] = array2[b];
            ++b;
            ++k;
        }

    }

}
