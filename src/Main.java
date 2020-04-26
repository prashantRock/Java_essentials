import sort.MergeSort;
import sort.QuickSort;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");
        // Quick Sort
        int [] list1  ={10, 80, 30, 90, 40, 50, 70};

        int start = 0;
        int end = list1.length - 1;
        QuickSort.sort(list1, start, end);
        System.out.println("Quick Sort : "+list1);


        int [] list2  ={10, 80, 30, 90, 40, 50, 70};
        end = list2.length - 1;
        MergeSort.sort(list2, start, end);
        System.out.println("Merge Sort : "+list2);



        Java8.lambdaMethod();
    }




}
