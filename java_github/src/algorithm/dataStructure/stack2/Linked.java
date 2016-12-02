package algorithm.dataStructure.stack2;



public class Linked {
	
	public Node head;

	public int count;
	
	public Linked(){
		head = null;

		count = 0;
	}
	
	public Node stackPop(Node stack){
		stack = head;
		head = stack.next();
		count--;
		return stack;
	}
	
	public void stackPush(Object data){
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		count++;
	}
	
	public int length(){
		return count;
	}
	
	public void stackTop(Node stack){
		stack = head;
		System.out.println(stack.data());
	}
	
	public void displayAllNodes(){
		Node current = head;
		while(current != null){
			current.display();
			current = current.next();
			
		}
		//System.out.println();
	}
	
	
	public Node clearStack(Node stack){
		stack = head;
		while(stack != null){
			stack.setData(null);
			stack = stack.next();
			count--;
			
		}
		
		return stack;
	}

}
