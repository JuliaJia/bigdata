package algorithm.dataStructure.case4;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackCase1 {


	public static void main(String[] args) {
		
		Character[] operatorList = {'+','-','*','/','(',')','%'};
		Stack<Character> operator = new Stack<Character>();
		String inorder = new String();
		char it;
		int inposition= 0;
		int operator1 = 0;
		System.out.println("Enter An Inorder Expression: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		inorder = scan.nextLine();
		System.out.println("The Postorder Expression is ['']");
		//scan.next();
		//while(scan.hasNext()){
			//String string = scan.next();
			//System.out.println(string);
		//}
		//System.out.println(inorder.charAt(1));


		while(inposition < inorder.length()){
			if(Arrays.asList(operatorList).contains((char)inorder.charAt(inposition))){
				//System.out.println(inorder.charAt(inposition));
				if(inorder.charAt(inposition) == '('){
					operator.push(inorder.charAt(inposition));
					
					
				}else if(inorder.charAt(inposition) == ')'){
					//it = operator.pop();
					//System.out.println(it);
					/*while(it != '('){
						System.out.println(it);
						it = operator.pop();
					}*/
					
					int count = operator.size();
					
					for(int i = 0; i < count;i++){
						it = operator.pop();
						if(it !='('){
							System.out.println(it);
						}
					}
					/*for(int i = 0; i < operator.size(); i++){
						if(operator.get(i) != '('){
							System.out.println(operator.get(i));
						}
					}*/
				}else{
					//System.out.println((char)inorder.charAt(inposition));
					if(operator.isEmpty()){
						operator.push((char)inorder.charAt(inposition));
					}else{
						if(inorder.charAt(inposition) == '/' || inorder.charAt(inposition) == '*' || inorder.charAt(inposition) == '%'){
							it = operator.pop();
							//System.out.println(it);
							operator.push(it);
							operator.push(inorder.charAt(inposition));
						    
							
							
						}
						else{
							it = operator.pop();
							if(it == '/' || it == '*' || it == '%'){
								System.out.println(it);
								operator.push(inorder.charAt(inposition));
							}else if(it == '('){
								operator.push(it);
								operator.push(inorder.charAt(inposition));
								
								
							}else{
								operator.push(it);
								
							}
							//System.out.println(inorder.charAt(inposition));
						}
					}
				}
				inposition++;
			}else{
			    if(inposition < inorder.length() - 1){
			    	System.out.println((char)inorder.charAt(inposition));
				    inposition++;
			    }else{
			    	System.out.println((char)inorder.charAt(inposition));
			    	//System.out.println(operator.size());
			    	int length = operator.size();
			    	for(int i = 0; i < length;i++){
			    		it = operator.pop();
			    		System.out.println(it);

			    	}
				    break;
			    }
			}
			}
			
		}


	}
	


