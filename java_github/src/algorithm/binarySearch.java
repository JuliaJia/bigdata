package algorithm;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class binarySearch {

	public static void main(String[] args) {
		int[] A = {-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33,-2,-3,4,5,6,7,-19,20,45,-10,11,-23,58,-14,78,-90,100,-89,-37,21,90,-88,67,54,-33};
		numberIndex(A, -8);

	}
	private static void numberIndex(int[] numbers,int X){
		int left,mid,right,index;
		int string = -1;
		left = 0;
		right = numbers.length - 1;
		index = -1;
		while(left <= right){
			mid = (left + right)/2;
			if(numbers[mid] < X){
				left = mid + 1;
			}else if(numbers[mid] > X){
				right = mid - 1;
			}else{
				index = mid;
				//System.out.println(index);
				break;
			}
		}
		//System.out.println(index);
		if(index != -1){
			System.out.println(index);
		}else{
			System.out.println("This Number is not in the list!!!");
		}
		
	}

}