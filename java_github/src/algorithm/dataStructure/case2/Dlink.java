package algorithm.dataStructure.case2;



public class Dlink {
	
	public Node head;
	public Node tail;
	
	public int count;
	
	public Dlink() {
		count = 0;
		head = null;
		tail = null;
	}
	
	public void josephusRing(int number,int kill,int begin){
		createJosephus(number);
		//displayAll();
		showWinner(begin, kill);
	}
	
	private void createJosephus(int number){
		head = new Node(1);
		Node node = head;
		head.setBefour(null);
		head.setNext(null);
		for(int i = 2; i <= number; i++){
			Node data = new Node(i);
			node.setNext(data);
			data.setBefour(node);
			node = data;
		}
		node.setNext(head);
		head.setBefour(node);
		
		
	}
	
	private void showWinner(int begin,int kill){
		Node data = head;
		for(int i = 1 ; i < begin; i++){
			data = data.next();
		}
		
		while(data.next() != data){
			for(int j = 0; j < kill - 1; j++){
				data = data.next();
			}
			data.befour().setNext(data.next());
			data.next().setBefour(data.befour());
			data = data.next();
		}
		
		System.out.println("Winner is " + data.id());

	}
	
	private void displayAll(){
		Node curr = head;
		while(curr != null){
			curr.display();
			curr = curr.next();
		}
		
	}
	
}
