package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class DaysToMakeNBoqueu {
    public int minDays(int[] bloomDay, int m, int k) {
        int i = 1;
        int j = (int)1e9 ;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;

            boolean isPossible = isPossible(bloomDay, k, mid, m);
            if(isPossible){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] bloomDay, int k, int day, int boque){
        int i = 0;
        int flowerCount = 0;
        while(i<bloomDay.length){
            if(bloomDay[i] > day){
                i++;
                flowerCount = 0;
            }else if(bloomDay[i] <= day){
                flowerCount++;
                i++;
            }

            if(flowerCount==k){
                boque--;
                flowerCount = 0;
            }
        }
        System.out.println(day+" "+boque);
        return boque<=0;
    }
}