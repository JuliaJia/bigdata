package algorithm;

public class PrintNum {

	public static void main(String[] args) {
		PrintDigit(45678);

	}
	
	
	public static void PrintOut(int i){
		System.out.println(i);
	}
	
	public static void PrintDigit(int i){
		if(i >= 10){
			PrintDigit(i / 10);
		}
		PrintOut(i % 10);
		
		
	}

}
