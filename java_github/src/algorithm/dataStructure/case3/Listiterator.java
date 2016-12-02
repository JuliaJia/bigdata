package algorithm.dataStructure.case3;

import java.util.Iterator;

public interface Listiterator extends Iterator {
	public void add(Object object);
	public boolean hasnext();
	public boolean hasprevious();
	public Object next();
	public int nextindex();
	public Object previous();
	public int previousindex();
	public void remove();
	public void set(Object object);
}
