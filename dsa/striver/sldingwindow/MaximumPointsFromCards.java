package Practice.dsa.striver.sldingwindow;

public class MaximumPointsFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i=0;i<Math.min(cardPoints.length,k);i++){
            sum+=cardPoints[i];
        }
        int max = sum;
        int j = cardPoints.length - 1;
        for(int i=k-1;i>=0;i--){
            sum-=cardPoints[i];
            sum+=cardPoints[j];
            j--;
            max = Math.max(sum, max);
        }
        return max;
    }
}