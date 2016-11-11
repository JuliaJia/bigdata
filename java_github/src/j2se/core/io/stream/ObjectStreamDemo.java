package j2se.core.io.stream;

import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 对象序列化说明范例
 */

public class ObjectStreamDemo {
	private static final String FILENAME = "F:/study/code/bigdata_github/java_github/txt/data.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Human[] humans = {
				new Human("one",32,true),
				new Human("two",33,true)
		};
		writeToFile(humans);
		humans = readFromFile();
		System.out.println(Arrays.toString(humans));

	}
	private static Human[] readFromFile() throws IOException, ClassNotFoundException{
		File file = new File(FILENAME);
		ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		List<Human> list = new ArrayList<Human>();
		try{
			while(true){
				Human human = (Human) input.readObject();
				list.add(human);
			}
			
		}catch(EOFException e){
			
		}
		input.close();
		return list.toArray(new Human[0]);   //一定要记住这种方法！将数据转换成指定类型，这里是转换成Human对象数组的类型！
	}
	
	private static void writeToFile(Human[] humans) throws IOException{
		File file = new File(FILENAME);
		ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		for(Human h : humans){
			output.writeObject(h);
		}
		output.flush();
		output.close();
	}

}


class Human implements Serializable{    //Human类使用Serializable接口！
	private static final long serialVersionUID = -5448627462478900075L;
	String name;
	Integer age;
	Boolean sex;
	public Human(){}
	public Human(String name,Integer age,Boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	@Override
	public String toString(){
		return "Human [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
}