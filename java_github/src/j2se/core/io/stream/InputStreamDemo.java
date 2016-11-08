package j2se.core.io.stream;
/*
 * 使用字节流读取文本内容，完成编码转换的范例
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InputStreamDemo {



	public static void main(String[] args) throws IOException {
		String path = "F:/study/code/bigdata_github/java_github/txt/";
		String filename = "utf8.txt";
		//right(path, filename, "GBK");
		//error(path, filename);
		test(path, filename, "UTF-8");

	}
	private static void test(String path,String filename,String charset) throws IOException{
		File file = new File(path + filename);
		FileInputStream input = new FileInputStream(file);
		//int len = -1;
		//byte[] bytes = new byte[1024];
		byte[] bytes = new byte[(int) file.length()];
		int count = 0;
		int len = input.read(bytes);
		//while((len = input.read(bytes,0,bytes.length)) != -1){
		String str = new String(bytes,charset);
		System.out.print(str);
		input.close();

		//}
	}
	private static void error(String path,String filename) throws IOException{
		File file = new File(path + filename);
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
		int i;
		while((i = input.read()) != -1){
			System.out.print((char)i);
		}
		input.close();
	}
	
	private static void right(String path,String filename,String charset) throws IOException{
		File file = new File(path + filename);
		InputStreamReader input = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)),charset);
		char[] array = new char[50];
		int i;
		while((i = input.read(array)) != -1){
			for(int j = 0;j < i;j++){
				System.out.print(array[j]);
			}
		}
		input.close();
		
	}

}
