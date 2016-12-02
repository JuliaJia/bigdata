package job.job02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;
import org.xml.sax.SAXException;





public class StudentDomParser {
	public static List<Student> parser(String filename) throws SAXException, IOException, ParserConfigurationException{
		List<Student> students = new ArrayList<Student>();
		DocumentBuilderFactory documentBuilderFactory = null;
		DocumentBuilder documentBuilder = null;
		Document document = null;
		
		documentBuilderFactory = DocumentBuilderFactory.newInstance();
		documentBuilder = documentBuilderFactory.newDocumentBuilder();
		document = documentBuilder.parse(new File(filename));
		
		Element element = document.getDocumentElement();
		NodeList studentList = element.getElementsByTagName("student");

		
		
		for(int i = 0; i < studentList.getLength(); i++){
			Student student = new Student();
			Node node = studentList.item(i);
			NodeList studentNodes = node.getChildNodes();
			

			
			for(int j = 0; j < studentNodes.getLength(); j++){
				Node studentNode = studentNodes.item(j);
				
				if(studentNode.getNodeName().equals("name")){
					student.setName(studentNode.getTextContent());
				}else if(studentNode.getNodeName().equals("age")){
					student.setAge(Integer.parseInt(studentNode.getTextContent()));
				}else if(studentNode.getNodeName().equals("score")){
					student.setScore(Integer.parseInt(studentNode.getTextContent()));
				}
			}
			students.add(student);
		}
		return students;
		
	}

}