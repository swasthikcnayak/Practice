package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class CocoBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        while(i<=j){
            int mid = i + (j-i)/2;

            boolean isPossible = isPossible(piles, mid, h);
            if(isPossible){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] arr,int maxValue, int maxHours){
        int hours = 0;
        for(int val: arr){
            hours = hours + val/maxValue;
            if(val%maxValue != 0){
                hours++;
            }
        }
        return hours<=maxHours;
    }
}