package j2se.core.io.stream;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class ReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		String path1 = "F:/study/code/bigdata_github/java_github/src/j2se/core/io/file/";
		String filename1 = "RandomAccessFileDemo.java";
		String path2 = "F:/study/code/bigdata_github/java_github/txt/";
		String filename2 = "readwrite.txt";
		char[] buff = new char[10000000];
		//ArrayList buff2;
		buff = readDemo(path1, filename1);
		//readLineDemo(path1, filename1);
		/*for(int i = 0; i < buff.length;i++){
			System.out.print(buff[i]);
		}*/
		writeDemo(path2, filename2, buff);

	}
	private static char[] readDemo(String path,String filename) throws IOException{
		File file = new File(path + filename);
		//Reader raf = new BufferedReader(new FileReader(file));
		Reader raf = new FileReader(file);
		int len = -1;
		char[] buff = new char[100000000];
		while((len = raf.read(buff,0,buff.length)) != -1){
			len = raf.read(buff);
		}
		raf.close();
		return buff;
		
	}
	/*private static ArrayList readLineDemo(String path,String filename) throws IOException{
		File file = new File(path + filename);
		LineNumberReader reader = new LineNumberReader(new FileReader(file));
		ArrayList<String> stringList = new ArrayList<String>();
		String s;
		while((s = reader.readLine()) != null){
			stringList.add(s);
		//	System.out.println(s);
		}
		System.out.println(stringList);
		
	}*/
	
	private static void writeDemo(String path,String filename,char[] content) throws IOException{
		File file = new File(path + filename);
		//Writer write = new BufferedWriter(new FileWriter(file));
		Writer write = new FileWriter(file);
		for (int i = 0;i < content.length;i++){
			write.write(content[i]);
			if(content[i] == 0){
				break;
			}
		}
		//write.write(content);
		write.flush();
		write.close();
	}

}
