package algorithm.dataStructure.doubleLinkedList1;

import java.awt.HeadlessException;

public class Dlink {
	public Node head;
	public Node tail;
	public int count;
	public Dlink(Node head,Node tail,int count){
		head = null;
		tail = null;
		count = 0;
	}
	
	public Dlink(){
		head = null;
		tail = null;
		count = 0;
	}
	
	public void addBefour(int it){
		Node newNode = new Node(null,null,it);
		if(head == null && tail == null){
			head = newNode;
			head.setBefour(null);
			tail = newNode;
			tail.setNext(null);
		}else{
			head.setBefour(newNode);
			newNode.setNext(head);
			head = newNode;
			head.setBefour(null);
			
			
		}
		count++;
	}
	
	public void addAfter(int it){
		Node newNode = new Node(null,null,it);
		if(head == null && tail == null){
			tail = newNode;
			tail.setNext(null);
			head = newNode;
			head.setBefour(null);
		}else{
			tail.setNext(newNode);
			newNode.setBefour(tail);
			tail = newNode;
			tail.setNext(null);
		}
		count++;
	}
	
	
	public Node findNode(int it){
		Node curr = head;
		//System.out.println(head);
		if(head != null){
			while(curr != null){
				if(curr.data() == it){
					return curr;
				}
				curr = curr.next();
				
			}
		}
		return null;
	}
	
	public void delNode(int it){
		Node temp = findNode(it);
		//System.out.println(temp);

		if(temp != null){
			if(temp.next() == null){
				tail = temp.befour();
				tail.setNext(null);

				
			}else if(temp.befour() == null){
				head = temp.next();
				head.setBefour(null);
				System.out.println(temp);
				/*System.out.println(temp);
				System.out.println(temp.next());
				System.out.println(temp.befour());*/
			}else{
				temp.befour().setNext(temp.next());
				temp.next().setBefour(temp.befour());

			}
		}
		
		count--;
		
		
		
	}
	
	public void displayAll(){
		Node curr = head;
		while(curr != null){
			curr.display();
			curr = curr.next();
		}
		
	}
	

}
