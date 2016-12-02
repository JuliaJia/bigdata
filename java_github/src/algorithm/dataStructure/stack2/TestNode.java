package algorithm.dataStructure.stack2;

public class TestNode {

	public static void main(String[] args) {
		Node node = new Node();
		Linked stack = new Linked();
		stack.stackPush(1);
		stack.stackPush(2);
		stack.stackPush(3);
		stack.stackPush(4);
		
		stack.stackPop(node);
		stack.stackPop(node);
		stack.stackTop(node);



		
		stack.displayAllNodes();
		System.out.println(stack.length());
		
		stack.clearStack(node);
		stack.displayAllNodes();
	}

}