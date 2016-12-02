package j2se.core.thread.Basic;


public class SecondThread implements Runnable{
	private int i;
	public void run(){
		for( ; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				SecondThread secondThread = new SecondThread();
				new Thread(secondThread, "New 1").start();
				new Thread(secondThread, "New 2").start();
			}
		}

	}

}
