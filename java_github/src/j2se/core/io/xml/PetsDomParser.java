package j2se.core.io.xml;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NameNotFoundException;
//以下的包别导错了！
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class PetsDomParser {
	public static List<Dog> parse(String filename) throws ParserConfigurationException, SAXException, IOException{
		List<Dog> dogs = new ArrayList<Dog>();
		//以下是约定俗成的步骤，记住即可！
		DocumentBuilderFactory documentBuilderFactory = null;
		DocumentBuilder docBuilder = null;
		Document doc = null;
		
		documentBuilderFactory = DocumentBuilderFactory.newInstance();
		docBuilder = documentBuilderFactory.newDocumentBuilder();
		doc = docBuilder.parse(new File(filename));
		
		Element root = doc.getDocumentElement();   //得到root_node！
		
		NodeList doglist = root.getElementsByTagName("dog");

		
		for(int i = 0; i < doglist.getLength(); i++){
			Dog dog = new Dog();
			Node node = doglist.item(i);
			node.getAttributes().item(0);   //dog只有一个属性，所以item(0)即可
			dog.setID(Integer.parseInt(node.getAttributes().getNamedItem("id").getTextContent()));
			NodeList childNodes = node.getChildNodes();
			
			for(int j = 0; j < childNodes.getLength(); j++){
				//Master master = new Master();
				Node childNode = childNodes.item(j);
				

				if(childNode.getNodeName().equals("name")){
					dog.setDogName(childNode.getTextContent());
				}else if (childNode.getNodeName().equals("health")){
					dog.setHealth(Integer.parseInt(childNode.getTextContent()));
				}else if(childNode.getNodeName().equals("love")){
					dog.setLove(Integer.parseInt(childNode.getTextContent()));
				}else if(childNode.getNodeName().equals("strain")){
					dog.setStrain(childNode.getTextContent());
				}else if(childNode.getNodeName().equals("master")){
					NodeList masterNodes = childNode.getChildNodes();
					for(int k = 0; k < masterNodes.getLength(); k++){
						Node masterNode = masterNodes.item(k);
						if(masterNode.getNodeName().equals("name")){
							dog.setMasterName(masterNode.getTextContent());
						}else if(masterNode.getNodeName().equals("phone")){
							dog.setMasterPhone(Integer.parseInt(masterNode.getTextContent()));
						}
						
					}
					/*if(childNode.getNodeName().equals("name")){
						dog.setMaster(childNode.getTextContent());
					}*/
				}
				}
			dogs.add(dog);
		}
		
		return dogs;
		
	}

}
