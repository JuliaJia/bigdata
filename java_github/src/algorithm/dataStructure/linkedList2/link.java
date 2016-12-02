package algorithm.dataStructure.linkedList2;
//�����ȶ���link�࣡����

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.w3c.dom.stylesheets.LinkStyle;

import algorithm.dataStructure.linkedList.Node;

public class link {
	//����������ʼ����Ҫ�õ��ı�����
	private link next;
	private int data;
	private link first;
	private link tail;
	
	//����link�Ĺ��캯��
	link(int it,link nextval){
		data = it;
		next = nextval;
	}
	
	//link���캯������
	link(link nextval){
		next = nextval;
	}
	
	link() {
		//data = it;
		//this.data = data;
		this.first = null;
		//this.tail = new link(data);
		this.tail = new link(null);
	}
	
	
	
	//����next����
	public link next(){
		return next;
	}
	
	//����setnext����
	public link setnext(link nextval){
		next = nextval;
		return next;
	}
	
	public int data(){
		return data;
	}
	
	public int setdata(int it){
		data = it;
		return data;
	}
	
	link freel = null;
	
	public link get(link nextval){
		if(freel == null){
			return new link(nextval);
		}
		link temp = freel;
		freel = freel.next();
		temp.setnext(nextval);
		return temp;
	}
	
	
	public void append(int it){
		link next = new link(it,null);
		//System.out.println(next);
		first = next;
		tail.setnext(next);
		tail = tail.next;
		//System.out.println(tail);
	}
	
	public void display(){
		System.out.println(data + " ");
	}
	public void displayAllNodes(){
		link current = first;
		while(current != null){
			System.out.println(first);
			current.display();
			current = current.next;
		}
		System.out.println();
	}
	

}



