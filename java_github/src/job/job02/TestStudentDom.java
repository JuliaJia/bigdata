package job.job02;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TestStudentDom {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		String filename = "f:/study/code/bigdata_github/java_github/xml/Students.xml";
		List<Student> students = StudentDomParser.parser(filename);
		for(Student student : students){
			System.out.println(student);
		}

	}

}
