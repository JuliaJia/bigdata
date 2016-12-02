package algorithm.dataStructure.stack1;



public class TestStack {

	public static void main(String[] args) {
		ListStack node = new ListStack();
		easyStack stack = node.initStack(10);
		
		stack = node.listPush(stack, 1);
		stack = node.listPush(stack, 10);
		stack = node.listPush(stack, 11);
		stack = node.listPush(stack, 12);
		System.out.println(node.stackCount(stack));
		stack = node.clearStack(stack);
		System.out.println(node.stackCount(stack));

	}

}