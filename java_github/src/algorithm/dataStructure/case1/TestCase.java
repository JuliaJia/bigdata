package algorithm.dataStructure.case1;

public class TestCase {

	public static void main(String[] args) {
		Dlink curr = new Dlink();
		Dlink curr2 = new Dlink();
		int count = 0;
		int A1,A2;
		int B1,B2;

		curr.addBefore(4,3);
		curr.addBefore(3,2);
		curr.addBefore(2,1);
		curr.addBefore(1,0);
		
		
		
		
		curr2.addBefore(4,3);
		curr2.addBefore(3,5);
		
		
		Node node = curr.head;
		Node node2 = curr2.head;
		
		//Object a = curr.findN(3);

		
		
		/*System.out.println(curr.count);
		System.out.println(curr.head);
		System.out.println(curr2);*/
		
		
		Dlink curr3 = new Dlink();
		
		if(curr.count > curr2.count){
			count = curr.count;
		}else{
			count = curr2.count;
		}

		for(int i = 0;i < count ; i++){
			if(curr != null && curr2 != null && curr.head != null && curr2.head != null){

				if(curr2.findN(node.n()) != null && curr.findN(node2.n()) != null){
					A1 = node.a();
					B1 = (int)curr2.findN(node.n());
					A2 = node2.a();
					B2 = (int)curr.findN(node2.n());
					if(node.n() != node2.n()){
						//System.out.println(1 + node.n() + " " + A1 + " " + B1);
						//System.out.println(2 + node.n() + " " + A2 + " " + B2);
						curr3.addBefore(node.n(),A1 + B1 );
						curr3.addBefore(node2.n(),A2 + B2 );
					}else{
						curr3.addBefore(node.n(),A1 + B1 );
						//System.out.println(3 + node.n() + " " + A1 + " " + B1);
					}
					node = node.next();
					node2 = node2.next();
				}else if(curr2.findN(node.n()) == null){
					A1 = node.a();
					curr3.addBefore(node.n(), A1);
					//System.out.println(4 + node.n() + " " + A1);
					node = node.next();
				}else if(curr.findN(node2.n()) == null){
					A2 = node2.a();
					curr3.addBefore(node2.n(), A2);
					//System.out.println(5 + node2.n() + " " + A2);
					node2 = node2.next();
				}

			}
		}
		curr3.displayAll();
		System.out.println("===============");
		curr2.displayAll();
		System.out.println("===============");
		curr.displayAll();
	}
	
	


}