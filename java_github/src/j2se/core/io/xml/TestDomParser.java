package j2se.core.io.xml;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TestDomParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String fileName = "f:/study/code/bigdata_github/java_github/xml/pet1.xml";
		List<Dog> dogs = PetsDomParser.parse(fileName);
		for(Dog dog : dogs){
			System.out.println(dog);
		}

	}

}
