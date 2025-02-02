package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class MedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.length;
        int n= nums2.length;
        int i = 0;
        int j = m;

        while(i<=j){
            int mid1 = i + (j-i)/2;
            int mid2 = (m+n)/2 - mid1;


            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1 < m){
                r1 = nums1[mid1];
            }
            if(mid2 < n){
                r2 = nums2[mid2];
            }
            if(mid1-1>=0){
                l1 = nums1[mid1-1];
            }
            if(mid2-1>=0){
                l2 = nums2[mid2-1];
            }

            if(l1<=r2 && l2<=r1){
               if((m+n)%2==0){
                return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
               }else{
                return Math.min(r1, r2);
               }
            }else if(l1>r2){
                j = mid1 - 1;
            }else{
                i =mid1 + 1;
            }
        }
        return -1;
    }
}