package hadoop_senior.hadoop_hdfs;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HdfsApp {
	public static void main(String[] args) throws IOException {
		System.setProperty("hadoop.home.dir", "F:\\study\\code\\hadoop-2.5.0\\hadoop-2.5.0");
		FileSystem fileSystem = getFileSystem();
		
		String filename = "/usr/juliajia/mapreduce/wordcount/input/wc.input";
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
	
	public static FileSystem getFileSystem() throws IOException{
		Configuration configuration = new Configuration();
		
		FileSystem fileSystem = FileSystem.get(configuration);
		return fileSystem;
	}

}