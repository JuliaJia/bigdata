package algorithm.dataStructure.stack1;

import java.util.Objects;

public class ListStack {
	
	public int count;
	
	public ListStack(){
		count = 0;
	}
	

	public easyStack initStack(int length){
		easyStack stack = new easyStack(length);
		return stack;
	}
	
	
	public easyStack listPush(easyStack stack, int element){
		if(stack.objects()[0] == null){
			Object[] list = stack.objects();
			for(int i = list.length - 1; i > 0; i--){
				if(stack.bottom() == 0){
					list[i] = element;
					stack.setBottom(list.length - 1);
					stack.setTop(stack.bottom());
					break;
				}else if(list[i - 1] == null && list[i] != null){
					list[i - 1] = element;
					if(stack.top() != 0){
						//System.out.println(stack.top());
						stack.setTop(stack.top() - 1);
						stack.setObjects(list);
					}else{
						stack.setObjects(list);
					}
					break;
				}
			}
			
			return stack;
		}else{
			System.out.println("Stack is Full!");
			return stack;
		}
	}
	
	public easyStack listPop(easyStack stack){
		//System.out.println(stack.top());
		 if(stack.top() != 0){
			 Object[] list = stack.objects();
			 for(int i = list.length ; i > 0; i--){
				 if(list[i - 1] == null && list[i] != null){
					 list[i] = null;
					 
					 stack.setTop(stack.top() + 1);
					 break;
				 }
				 
			 }
			 if(stack.top() + 1 <= stack.bottom()){
				 //stack.setTop(stack.top() + 1);
				 stack.setObjects(list);

			 }else if(stack.top() == stack.bottom()){
				 stack.setObjects(list);
			 }else{
				 stack.setTop(0);

				 stack.setObjects(list);
			 }
			 return stack;
		 }else{
			 System.out.println("Stack is Null!!!!");
			 return stack;
		 }

		 
	}
	
	public Object getTopElement(easyStack stack){
		int index = stack.top();
		Object topElement = stack.objects()[index];
		return topElement;
	}
	
	public easyStack clearStack(easyStack stack){
		Object[] list = stack.objects();
		for(int i = 0; i < list.length; i++){
			list[i] = null;
		}
		
		stack.setObjects(list);
		stack.setBottom(0);
		stack.setTop(0);
		return stack;
	}
	
	public int stackCount(easyStack stack){
		int count = 0;
		Object[] list = stack.objects();
		for(int i = 0;i < list.length;i++){
			if(list[i] != null){
				count++;
			}
		}
		return count;
	}

}