package Practice.dsa.striver.arrays;

public class secondLargestInArray {
    
    public int secondLargestElement(int[] arr){
        int largestIdx = 0;
        int secondLIdx = 0;

        for(int i=1; i<arr.length; i++){    
            if(arr[i] > arr[largestIdx]){
                secondLIdx = largestIdx;
                largestIdx = i;
            }else if(arr[i] > arr[secondLIdx] && arr[i] != arr[largestIdx]){
                secondLIdx = i;
            }
        }
        return secondLIdx;
    }
}
