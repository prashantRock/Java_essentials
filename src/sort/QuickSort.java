package sort;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sukeshgupta on 24/04/20.
 */
public class QuickSort {


    public static void sort(int [] list, int start, int end){


        if(start < end) {
            int piPoint = quickSort(list, start, end);

            sort(list, start, piPoint-1);
            sort(list, piPoint + 1, end);
        }
    }

    public static int quickSort(int [] list, int start, int end){

        int pivotPt = list[end];
        int i=start -1;
        int temp = 0;
        for (int k = start;k< end;k++){
            if(list[k] < pivotPt){
                ++i;
                temp = list[k];
                list[k] = list[i];
                list[i] = temp;
            }
        }
        temp = list[i+1];
        list[i+1] = list[end];
        list[end] = temp;



        return i+1;
    }


}
