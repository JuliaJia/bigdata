package algorithm.dataStructure.linkedList;

public class Node {
		protected Node next;
		protected int data;
		public Node(int data){
			this.data = data;
		}
		
		public void display(){
			System.out.println(data + " ");
		}
		
}
