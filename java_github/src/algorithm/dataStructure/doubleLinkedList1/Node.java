package algorithm.dataStructure.doubleLinkedList1;

public class Node {
	
	//������ͷָ����βָ������
	protected Node next;
	protected int data;
	protected Node befour;
	
	//Node���췽��
	public Node(){
		
	}
	
	public Node(Node n,Node b,int d){
		next = n;
		data = d;
		befour = b;
	}
	
	public Node(Node n,Node b) {
		next = n;
		befour = b;
	}
	
	
	//βָ�������������
	public Node next(){   //βָ����ֵ�Ļ�ȡ
		return next;
	}
	
	public Node setNext(Node nextval){  //βָ����ֵ������
		return next = nextval;
		
	}
	
	//ͷָ�������������
	public Node befour(){
		
		return befour;
	}
	
	public Node setBefour(Node befourval){
		return befour = befourval;
	}
	
	//���������������
	
	public int data(){
		return data;
	}
	
	public int setData(int it){
		return data = it;
	}
	
	public void display(){
		System.out.println(data + " ");
	}
	

}