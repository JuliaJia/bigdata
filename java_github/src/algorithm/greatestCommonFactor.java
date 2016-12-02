package algorithm;

public class greatestCommonFactor {

	public static void main(String[] args) {
		System.out.println(greatestCF(50,15));

	}
	private static int greatestCF(int M,int N){
		int rem;
		while(N > 0){
			rem = M % N;
			System.out.println(rem);
			M = N;
			N = rem;
		}
		return M;
	}

}
