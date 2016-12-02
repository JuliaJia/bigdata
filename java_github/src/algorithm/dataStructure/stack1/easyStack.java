package algorithm.dataStructure.stack1;

public class easyStack {
	private Object[] objects;
	private int top;
	private int bottom;
	
	public easyStack(int length){
		objects = new Object[length];
		top = 0;
		bottom = 0;
	}
	
	public int top(){
		return top;
	}
	
	public int setTop(int new_top){
		return top = new_top;
	}
	
	public int bottom(){
		return bottom;
	}
	
	public int setBottom(int new_bottom){
		return bottom = new_bottom;
	}
	
	public Object[] objects(){
		return objects;
	}
	
	
	public Object[] setObjects(Object[] new_objects){
		return objects = new_objects;
	}
	

	
	
}
