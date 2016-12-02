package algorithm;

import javax.security.auth.kerberos.KerberosKey;

public class TimeCount {
	private static int init = 1;
	public static int timeCount(int i){
		if(i > 1){
			
			timeCount(i/2);
			init++;
			
		}
		
		//System.out.println(i / 2);
		return init;
	}




	public static void main(String[] args) {
		Integer count;
		count = timeCount(20);
		System.out.println(count);




	}
	









		
		
	

	
}
