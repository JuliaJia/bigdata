package algorithm.dataStructure.case3;

import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;



public class TestListIterator {

	public static void main(String[] args) {
		String[] words = new String[]{"Apple","Earth","Mars","Pluto"};
		List list = Arrays.asList(words);
		System.out.println(list);
		printforward(list);

	}
	
	private static void printforward(List list){
		ListIterator listiterator = list.listIterator(list.size());

		
		while(listiterator.hasPrevious()){
			System.out.println(listiterator.previous());
		}
	}

}
