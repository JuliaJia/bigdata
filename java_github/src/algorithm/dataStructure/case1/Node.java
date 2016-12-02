package algorithm.dataStructure.case1;

public class Node {
	
	private Node next;   //尾指针域
	
	private int n;   //指数
	private int a;    //项数
	
	
	//构造方法及重写
	
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
	
	//指针域获取＆设置方法
	
	public Node next(){
		return next;
		
	}
	
	public Node setNext(Node nextval){
		
		return next = nextval;
		
	}
	
	//数据域获取&设置方法
	
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
