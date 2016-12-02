package algorithm.dataStructure.linkedList;

public class Linked {

		public Node first;
		public Linked(){
			this.first = null;
		}
		
		public void addFirstNode(int data){
			Node node = new Node(data);
			node.next = first;
			first = node;
			//System.out.println(data);
		}
		
		public void displayAllNodes(){
			Node current = first;
			while(current != null){
				current.display();
				current = current.next;
			}
			System.out.println();
		}
		
		public Node deleteFirstNode(){
			Node firstNode = first;
			first = firstNode.next;
			return firstNode;
		}

}
