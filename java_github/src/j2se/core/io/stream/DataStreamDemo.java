package j2se.core.io.stream;

import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.acl.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class DataStreamDemo {
	
	private static final String FILENAME = "F:/study/code/bigdata_github/java_github/txt/data.txt";

	public static void main(String[] args) throws IOException {
		Person[] persons={
			new Person("one",32,true),
			new Person("two",33,true)
		};
		writeToFile(persons);

		persons = readFromFile();
		System.out.println(Arrays.toString(persons));
		System.out.println(persons);
	}
	
	private static Person[] readFromFile() throws IOException{
		File file = new File(FILENAME);
		DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));  //按照数据类型来读取数据
		List<Person> list = new ArrayList<Person>();
		try{
			while(true){
				Person person = new Person();
				person.name = input.readUTF();
				person.age = input.readInt();
				person.sex = input.readBoolean();
				list.add(person);
			}
		}catch (EOFException e){
			
		}
		
		input.close();
		
		return list.toArray(new Person[0]);
	}
	
	private static void writeToFile(Person[] persons) throws IOException{
		File file = new File(FILENAME);
		DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		for(Person p : persons){
			output.writeUTF(p.name);
			output.writeInt(p.age);
			output.writeBoolean(p.sex);
			
		}
		output.flush();
		output.close();
	}

}

class Person{
	String name;
	Integer age;
	Boolean sex;
	public Person(){}
	public Person(String name,int age,Boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString(){
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
}
