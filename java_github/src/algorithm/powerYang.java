package algorithm;

public class powerYang {

	public static void main(String[] args) {
		System.out.println(powerLove(-1,3));

	}
	
	private static int powerLove(int X,int N){
		if(N == 0){
			return 1;
		}
		if(N == 1){
			return X;
		}
		if(N % 2 == 0){
			return powerLove(X * X, N / 2);
		}else{
			return powerLove(X * X, N / 2) * X;
		}
	}

}