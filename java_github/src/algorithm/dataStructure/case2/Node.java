package algorithm.dataStructure.case2;

public class Node {
	//÷∏’Î”Ú
	private Node befour;
	private Node next;
	

	private int id;

	
	Node(){
		befour = null;
		next = null;
	}
	
	Node(int ID){
		id = ID;
		next = null;
	}
	
	public Node next(){
		return next;
	}
	
	public Node setNext(Node nextval){
		return next = nextval;
	}
	
	public Node befour(){
		return befour;
	}
	
	public Node setBefour(Node befourval){
		return befour = befourval;
	}
	
	
	
	public int id(){
		return id;
	}
	
	public int setID(int ID){
		return id = ID;
	}

	public void display(){
		System.out.println(id + " ");
	}
}
