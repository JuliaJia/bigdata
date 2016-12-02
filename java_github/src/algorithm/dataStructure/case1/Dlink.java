package algorithm.dataStructure.case1;



public class Dlink {
	public Node head;  //Õ∑÷∏’Î
	public int count;
	
	Dlink(){
		this.head = null;
	}
	
	Dlink(Node head){
		this.head = head;	
	}

	
	
	public void addBefore(int n,int a){
		Node curr = new Node(n,a);
		curr.setNext(head);
		head = curr;
		count++;
	}
	
	
	public Object findN(int n){
		Node curr = head;
		if(head != null){
			while(curr != null){
				if(curr.n() == n){
					return curr.a();
				}else{
					curr = curr.next();
				}
			}
		}
		return null;
	}
	public String addPolynominalOne(Dlink A,Dlink B){
		
		
		return "polynominalOne";
	}
	
	
	public void displayAll(){
		Node curr = head;
		if(head != null){
			while(curr != null){
				curr.display();
				curr = curr.next();
			}
		}
		
	}
	

}
