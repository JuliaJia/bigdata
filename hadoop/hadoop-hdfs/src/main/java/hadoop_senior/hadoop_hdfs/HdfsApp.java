package hadoop_senior.hadoop_hdfs;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HdfsApp {
	public static void main(String[] args) throws IOException {
		System.setProperty("hadoop.home.dir", "F:\\study\\code\\hadoop-2.5.0\\hadoop-2.5.0");
		FileSystem fileSystem = getFileSystem();
		
		//String filename = "/usr/juliajia/mapreduce/wordcount/input/wc.input";
		//readHdfsFile(filename,fileSystem);
		String putPath = "/usr/juliajia/mapreduce/wordcount/input/put_wc.iput";
		Path writePath = new Path(putPath);
		
		FSDataOutputStream outputStream = fileSystem.create(writePath);
		
		FileInputStream inputStream = new FileInputStream(new File("F:\\study\\code\\bigdata_github\\hadoop\\hadoop-hdfs\\src\\main\\resources\\test_upload"));
		
		
		try {
			IOUtils.copyBytes(inputStream, outputStream, 4096, false);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			IOUtils.closeStream(inputStream);
			IOUtils.closeStream(outputStream);
		}
		
	}
	
	public static FileSystem getFileSystem() throws IOException{
		Configuration configuration = new Configuration();
		
		FileSystem fileSystem = FileSystem.get(configuration);
		return fileSystem;
	}
	
	public static void readHdfsFile(String filename,FileSystem fileSystem) throws IOException{
		Path readPath = new Path(filename);
		
		FSDataInputStream inputStream = fileSystem.open(readPath);
		
		try {
			IOUtils.copyBytes(inputStream, System.out, 4096, false);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			IOUtils.closeStream(inputStream);
		}
		
	}

}
