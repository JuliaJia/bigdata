package algorithm.dataStructure.doubleLinkedList1;



public class TestDLinkedList {
	


	public static void main(String[] args) {
		Dlink testList = new Dlink();
		testList.addBefour(1);
		testList.addBefour(2);
		testList.addBefour(3);
		testList.addBefour(4);
		testList.addBefour(5);
		testList.addBefour(6);
		testList.addBefour(6);
		testList.addBefour(6);
		testList.addBefour(6);

		testList.addAfter(1);
		testList.addAfter(2);
		testList.addAfter(3);
		testList.addAfter(4);
		testList.addAfter(5);
		testList.addAfter(6);
		testList.addAfter(6);
		testList.addAfter(6);
		
		//testList.displayAll();
		//System.out.println("====================");
		
		//System.out.println(testList.count);
		//for(int i = 0; i < testList.count;i++){
			//testList.delNode(6);
		//}
		
		//testList.delNode(6);
		//System.out.println(testList.count);
		
		for(int i = 0; i < testList.count; i++){
			testList.delNode(6);
		}
		
		
		
		testList.displayAll();


	}
	
	

	

	
	


}
