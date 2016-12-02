package algorithm;

public class Onlgn {

	public static void main(String[] args) {
		int[] A = {-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33};
		System.out.println(onlgn(A,0,A.length - 1));

	}
	
	private static int onlgn(int[] numbers,int left,int right){
		int maxSum = 0;
		int maxLeftSum,maxRightSum,count,i,maxRightBoderSum,maxLeftBoderSum,leftBorderSum,rightBorderSum;
		if(left == right){
			if(numbers[left] > 0){
				return numbers[left];
			}else{
				return 0;
			}
		}
		count = (left + right)/2;
		maxLeftSum = onlgn(numbers, left, count);
		maxRightSum = onlgn(numbers, count + 1, right);
		maxSum = maxLeftSum>maxRightSum?maxLeftSum:maxRightSum;
		
		maxLeftBoderSum = 0;
		maxRightBoderSum = 0;
		leftBorderSum = 0;
		rightBorderSum = 0;
		
		for(i = count; i >= left; i--){
			leftBorderSum += numbers[i];
			if(leftBorderSum > maxLeftBoderSum){
				maxLeftBoderSum = leftBorderSum;
			}
		}
		
		for(i = count + 1; i <= right; i++){
			rightBorderSum += numbers[i];
			if(rightBorderSum > maxRightBoderSum){
				maxRightBoderSum = rightBorderSum;
			}
		}
		
		
		maxSum = maxSum>(maxLeftBoderSum + maxRightBoderSum)?maxSum:(maxLeftBoderSum + maxRightBoderSum);
		return maxSum;
		
	}

}
