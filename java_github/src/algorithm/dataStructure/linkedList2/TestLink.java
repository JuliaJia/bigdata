package algorithm.dataStructure.linkedList2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//����������һ��link��
public class TestLink {

	public static void main(String[] args) {
		link link1 = new link();
		//link nextval = link1.next();
		//link link2 = new link(2,nextval);
		//link nextval2 = link2.next();
		link1.append(3);
		link1.append(2);
		link1.append(1);
		link1.displayAllNodes();

	}

}


/*abstract class llink implements List{
	private link head;
	private link tail;
	private link curr;
	llink(int sz){
		setup();
	}
	llink(){
		setup();
		
	}
	private void setup(){
		tail = head = curr = new link(null);
	}
	
	
}*/