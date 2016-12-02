package algorithm;

public class recursion {

	public static void main(String[] args) {
		System.out.println(recusion_func(4));

	}
	
	public static int recusion_func(int i){
		if(i == 0){
			return i;
		}else{
			return 2 * recusion_func(i - 1) + i * i;
		}
		
	}

}
