package algorithm.dataStructure.case1;

public class Node {
	
	private Node next;   //βָ����
	
	private int n;   //ָ��
	private int a;    //����
	
	
	//���췽������д
	
	Node(){
		this.next = null;
		this.n = 0;
		this.a = 0;
	}
	
	Node(Node next,int n,int a){
		this.next = next;
		this.n = n;
		this.a = a;
		
	}
	
	Node(int n,int a){
		this.n = n;
		this.a = a;
		
	}
	
	//ָ�����ȡ�����÷���
	
	public Node next(){
		return next;
		
	}
	
	public Node setNext(Node nextval){
		
		return next = nextval;
		
	}
	
	//�������ȡ&���÷���
	
	public int n(){
		return n;
	}
	
	public int setN(int it){
		return n = it;
	}
	
	public int a(){
		return a;
	}

	public int setA(int it){
		return a = it;
	}
	
	
	public void display(){
		System.out.println(a + " " +  n);
	}
}