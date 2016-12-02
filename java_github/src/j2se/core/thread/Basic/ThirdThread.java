package j2se.core.thread.Basic;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class ThirdThread {

	public static void main(String[] args) {
		ThirdThread thirdThread = new ThirdThread();
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
			int i = 0;
			for( ; i < 100; i++){
				System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ" + i);
			}
			
			return i;
		});
		for(int i = 0; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ" + i);
			if(i == 20){
				new Thread(task , "�з���ֵ���߳�1").start();
			}
		}
		try {
			System.out.println("���̵߳ķ���ֵ: " + task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

	}

}
