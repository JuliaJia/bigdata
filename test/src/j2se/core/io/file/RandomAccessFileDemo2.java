package j2se.core.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			randomWrite("F:/study/code/bigdata_github/java_github/txt/test2.txt");
			randomRead("F:/study/code/bigdata_github/java_github/txt/test2.txt",0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private static void randomRead(String path, int point) throws IOException{
		try {
			RandomAccessFile raf = new RandomAccessFile(path,"r");
			System.out.println("初始位置是：" + raf.getFilePointer());
			raf.skipBytes(point);
			byte[] buff = new byte[1024];
			int hasRead = 0;
			while((hasRead = raf.read(buff)) > 0){
				System.out.println(new String(buff,0,hasRead));
			}
				
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void randomWrite(String path) throws IOException{
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(path, "rw");
			raf.skipBytes((int)raf.length());
			raf.write(("\r这是追加的第三行\r\n").getBytes());
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
