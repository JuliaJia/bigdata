package algorithm.dataStructure.linkedList;



import java.util.ArrayList;
import java.util.Collection;
import java.util.IllegalFormatCodePointException;
import java.util.Iterator;
import java.util.List;

public class linkedList {
	



	public static void main(String[] args) {
		/*Collection<int[]> collection = new ArrayList<int[]>();
		int[] testlist = {1};
		collection.add(testlist);
		//print(collection);
		List<Integer> testlst = new ArrayList<Integer>();
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		testlst.add(1);
		sum(testlst);*/
		Linked list = new Linked();
		list.addFirstNode(1);
		list.addFirstNode(2);
		list.addFirstNode(3);
		list.displayAllNodes();
		list.deleteFirstNode();
		list.displayAllNodes();
	

	}
	
	private static void print(Collection<int[]> collection){
		Iterator<int[]> itr = collection.iterator();
		while(itr.hasNext()){
			int[] item = itr.next();
			System.out.println(item);
		}
	}
	
	private static void sum(List<Integer> lst){
		int total = 0;
		for(int i = 0; i < lst.size();i++){
			total += lst.get(i);
		}
		System.out.println(total);
	}

}




