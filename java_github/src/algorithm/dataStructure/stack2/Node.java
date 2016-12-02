package algorithm.dataStructure.stack2;



public class Node {
	private Node next;
	private Node top;

	private Object data;
	
	public Node(){
		next = null;
		top = null;
		data = null;
	}
	
	
	public Node(Object it){
		data = it;
	}
	
	public Node top(){
		return top;
	}
	
	public Node setTop(Node new_top){
		return top = new_top;
	}
	
	public Node next(){
		return next;
		
	}
	
	public Node setNext(Node new_next){
		return next = new_next;
	}
	
	public Object data(){
		return data;
	}
	
	public Object setData(Object new_data){
		return data = new_data;
	}
	
	public void display(){
		System.out.println(data + " ");
	}

}
