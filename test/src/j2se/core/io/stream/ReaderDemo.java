package j2se.core.io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;

/*
 * Reader����ʹ�÷���
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
				i = reader.read(array);   //��reader�е��ַ���ascii�����뵽array�����У���array�����Զ�ת�����ַ���
				//System.out.println(array);
				if (i == -1){  //����Ѿ���������ĩβ��read�����᷵��-1���ֵ
					break;   //������i == -1��ʱ����ж�ѭ����
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
