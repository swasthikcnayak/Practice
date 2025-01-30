package Practice.dsa.striver.arrays;

public class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t = nums1.length-1;
        m-=1;
        n-=1;
        while(m>=0 && n>=0){
            if(nums1[m] > nums2[n]){
                nums1[t] = nums1[m];
                m--;t--;
            }else{
                nums1[t] = nums2[n];
                t--;n--;
            }
        }
        while(n>=0){
            nums1[t] = nums2[n];
            t--;n--;
        }
    }
}
