package j2se.core.io.xml.handler;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.naming.Context;
import javax.print.attribute.standard.DialogTypeSelection;
import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import j2se.core.io.xml.bean.Dog;

public class PetParser extends DefaultHandler {
	private Dog dog = null;
	private List<Dog> dogs = null;
	private PetEnumState state = PetEnumState.none;
	private PetCategoryElemState parentState = PetCategoryElemState.none;
	
	
	public List<Dog> getDogs(){
		return this.dogs;
	}
	@Override
	public void startDocument() throws SAXException {
		dogs = new ArrayList<Dog>();
		
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("dog")){
			dog = new Dog();
			dog.setID(Integer.parseInt(attributes.getValue("id")));
			parentState = PetCategoryElemState.dog;
			return;
		}else if (qName.equals("name")){
			state = PetEnumState.name;
			return;
		}else if(qName.equals("health")){
			state = PetEnumState.health;
			return;
		}else if(qName.equals("love")){
			state = PetEnumState.love;
			return;
		}else if(qName.equals("strain")){
			state = PetEnumState.strain;
			return;
		}else if(qName.equals("mastername")){
			state = PetEnumState.mastername;
			return;
		}else if(qName.equals("masterphone")){
			state = PetEnumState.masterphone;
			return;
		}
		if(qName.equals("penguin")){
			parentState = PetCategoryElemState.penguin;
			return;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contact = new String(ch, start, length);
		if(state == PetEnumState.none){
			return;
		}
		if(parentState == PetCategoryElemState.none){
			return;
		}
		switch(state){
		case name:
			if(parentState == PetCategoryElemState.dog){
			dog.setDogName(contact);
			state = PetEnumState.none;
			}
			break;
		case health:
			if(parentState == PetCategoryElemState.dog){
			dog.setHealth(Integer.parseInt(contact));
			state = PetEnumState.none;
			}
			break;
		case love:
			if(parentState == PetCategoryElemState.dog){
			dog.setLove(Integer.parseInt(contact));
			state = PetEnumState.none;
			}
			break;
		case strain:
			if(parentState == PetCategoryElemState.dog){
			dog.setStrain(contact);
			state = PetEnumState.none;
			}
			break;
		case mastername:
			if(parentState == PetCategoryElemState.dog){
			dog.setMasterName(contact);
			state = PetEnumState.none;
			}
			break;
		case masterphone:
			if(parentState == PetCategoryElemState.dog){
			dog.setMasterPhone(Integer.parseInt(contact));
			state = PetEnumState.none;
			}
			break;
		default:
			break;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("dog")){
			dogs.add(dog);
			parentState = PetCategoryElemState.dog;
			dog = null;
			//dog = null;
		}
		if(qName.equals("penguin")){
			parentState = PetCategoryElemState.none;
		}
	}

}
