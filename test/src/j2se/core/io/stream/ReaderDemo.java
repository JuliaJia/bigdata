package j2se.core.io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;

/*
 * Reader入门使用范例
 */

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		String path = "F:/study/code/bigdata_github/java_github/src/j2se/core/io/file/RandomAccessFileDemo.java";
		File file = new File(path);
		try {
			Reader reader = new FileReader(file);
			int i = reader.read();
			System.out.println(i + " " + (char)i);
			//int len = 01;
			char[] array = new char[200];
			while(true){
				i = reader.read(array);   //将reader中的字符的ascii码输入到array数组中，由array数组自动转换成字符！
				//System.out.println(array);
				if (i == -1){  //如果已经到达流的末尾，read方法会返回-1这个值
					break;   //当遇到i == -1的时候就中断循环！
				}
				for(int j = 0; j < i; j++){
					System.out.print(array[j]);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
