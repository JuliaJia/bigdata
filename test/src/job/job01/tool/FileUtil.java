package job.job01.tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtil {
	private File file;
	private FileReader fr;
	private BufferedReader in;
	
	private FileWriter fw;
	private PrintWriter out;
	
	public FileUtil(String filename) throws IOException{
		try{
			file = new File(filename);
			in = new BufferedReader(new FileReader(file));
			out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public String readLine(){
		if (in != null){
			try {
				return in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void writeLine(String str){
		if (out != null){
			out.println(str);
			System.out.println(str);
		}
	}
	
	public void close() throws IOException{
		if(in != null){
			in.close();
		}
		if(out != null){
			out.close();
		}
	}
	

}