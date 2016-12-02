package algorithm;

public class ON3 {

	public static void main(String[] args) {
		int[] A = {-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33};
		System.out.println(On3(A));
		

	}
	
	private static int On3(int[] numbers){
		int maxSum;
		int thisSum;
		int i,k,j;
		maxSum = 0;
		for(i = 0; i < numbers.length; i++){
			for(j = i; j < numbers.length; j++){
				thisSum = 0;
				for(k = i; k <= j;k++){
					thisSum += numbers[k];
				}
				if(thisSum > maxSum){
					maxSum = thisSum;
				}
			}
		}
		return maxSum;
	}

}
