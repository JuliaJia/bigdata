package algorithm.dataStructure.stack2;



public class case1 {

	public static void main(String[] args) {
		Linked stack = new Linked();
		tenToTwo(100, 2, stack);

	}
	
	public static void tenToTwo(int data,int value,Linked stack){
		while(true){
			if(data / value == 1){
				stack.stackPush(data % value);
				stack.stackPush(1);
				break;
			}else{
				stack.stackPush(data % value);
				data = data / value;	
			}
		}
		stack.displayAllNodes();
	}

}
