package j2se.core.io.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		String path = "F:/study/code/bigdata_github/java_github/txt/";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你想要写入的文件名：");
		String filename = path + scanner.nextLine();
		File file = new File(filename);
		Writer writer = new FileWriter(file);
		System.out.println("请输入你想要写入的内容：");
		while(true){
			String content = scanner.nextLine();
			if(content.length() == 0){
				break;
			}
			writer.write(content);
			writer.write("\r\n");
		}
		writer.flush();
		writer.close();

	}

}
