package j2se.core.io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Love {
	private static final String FILEPATH = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		String filename_in = "/assert/���Ĺ���.mp3";
		String filename_out = "/assert/���Ĵ���.mp3";
		loveContinue(FILEPATH, filename_in, FILEPATH, filename_out);

	}
	
	private static void loveContinue(String path_in,String filename_in,String path_out,String filename_out) throws IOException{
		File file_in = new File(path_in + filename_in);
		File file_out = new File(path_out + filename_out);
		if(!file_out.getParentFile().exists()){
			file_out.getParentFile().mkdirs();
		}
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(file_in));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file_out));
		byte[] bytes = new byte[4096];
		int len = -1;
		while((len = input.read(bytes,0,bytes.length)) != -1){
			System.out.println("�����ڴ�����...");
			output.write(bytes,0,len);
		}
		System.out.println("�����ݽ�����");
		input.close();
		output.flush();
		output.close();
		
	}

}