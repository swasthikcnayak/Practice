package Practice.dsa.striver.binarysearch.bsOnAnswer;

public class SquareRootOfNumber {
    public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		int i = 1;
		int j = (int)N/2;

		while(i<=j){
			int mid = i + (j-i)/2;
			long sqr = mid*mid;
			if(N==sqr){
				return mid;
			}else if(N > sqr){
				i = mid + 1;
			}else{
				j = mid - 1;
			}
		}
		return j;
	}
}