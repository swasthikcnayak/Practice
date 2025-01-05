/**
 * Strategy design pattern is used when we have several ways to implement the same functionality using different algorithms.
 * Different strategies are used to implement the same functionality.
 * At run time strategry can be changes & configured.
 */

 interface SortingStrategy{
     void sort(int[] arr);
 }

 class BubbleSort implements SortingStrategy{       
    public void sort(int[] arr){
        System.out.println("Bubble Sort");
    }
}

class insertionSort implements SortingStrategy{       
    public void sort(int[] arr){
        System.out.println("Insertion Sort");
    }
}


class MergeSort implements SortingStrategy{       
    public void sort(int[] arr){
        System.out.println("Merge Sort");
    }
}   

// At run time can change the strategy and use the new strategy to sort the integer array
class IntegerSorter{
    SortingStrategy strategy;

    IntegerSorter( SortingStrategy strategy){
        this.strategy=strategy;
    }

    void setStrategy(SortingStrategy strategy){
        this.strategy=strategy;
    }

    public void sort(int[] arr){
        strategy.sort(arr);
    }
}