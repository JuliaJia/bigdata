package j2se.core.io.xml.test;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import j2se.core.io.xml.bean.Dog;
import j2se.core.io.xml.handler.PetEnumState;
import j2se.core.io.xml.handler.PetParser;

public class TestSaxParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		SAXParser parser = parserFactory.newSAXParser();
		PetParser petHandler = new PetParser();
		parser.parse("f:/study/code/bigdata_github/java_github/xml/pet1.xml", petHandler);
		
		List<Dog> dogs = petHandler.getDogs();
		for(Dog dog : dogs){
			System.out.println(dog);
		}
		
		
		

	}

}
