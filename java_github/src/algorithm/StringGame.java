package algorithm;

import java.lang.reflect.Array;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.naming.directory.InitialDirContext;
import javax.swing.ListModel;
import javax.xml.bind.NotIdentifiableEvent;

import j2se.core.io.xml.TestDomParser;



public class StringGame {
	private static int init = 0;
	private static int init2 = 0;

	public static void main(String[] args) {
		String[] words = wordsList();
		List<Character> test2 = new ArrayList<Character>();
		List<Character> characters = charList(words);
		//List<Character> clearList = clear(characters);
		char[] test = new char[16];
		for(char i : characters){
			if(init < 15){
				test[init] = i; 
				init++;
			}
		}

		char[] shuffleLists = shuffleList(test);
		//System.out.println(shuffleLists);
		

		/*for(char[] i : shuffleLists){
			for(int j = 0; j < i.length;j++){
				System.out.println(i[j]);
			}
			
		}*/
		//System.out.println(test2);
		//char[][] charsList = doubleDimensionList(test2);
		//System.out.println(charsList);
		
		
		

	}
	public static char[] shuffleList(char[] cList){
		Boolean result;
		int listLength = 13;
		List<int[]> randomList = new ArrayList<int[]>();
		int[] testlist = new int[1];
		int[] testlist2 = new int[16];
		char[] list = new char[16];
		for(int i = 0;i < listLength;i++){
			int randomNumber = (int)(Math.random()*listLength)+1;
			//System.out.println(randomNumber);
			testlist[0] = randomNumber;

			for(int[] a : randomList){
				if(a.equals(randomNumber)){
					result = false;
				}else{
					result = true;
				}
				System.out.println(result);
				if(result){
					
					if(init < 14){
						testlist2[init] = cList[a[0]];
						init++;
					}
				}
				
			}
			
			
			for(int j = 0; j < 16; j++){
				//System.out.println(testlist2[j]);
				
			}
			
		}
			
		list[14] = cList[12];
		list[15] = cList[10];
		
		
		return list;
		
	}
	
	public static String[] wordsList(){
		String words[] = {"this","that","fat","two"};
		return words;
	}
	
	public static List<Character> charList(String[] words){
		List<Character> word_char = new ArrayList<Character>();
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].toCharArray().length; j++){
				word_char.add(words[i].toCharArray()[j]);
			}
		}
		return word_char;
	}
	
	public static List<Character> clear(List<Character> dirtyList){
		List<Character> clearList = new ArrayList<Character>();
		for(char chars : dirtyList){
			if(!clearList.contains(chars)){
				clearList.add(chars);
			}
		}
		return clearList;
	}
	public static char[][] doubleDimensionList(List<Character> dirtyList){
		char[][] doubleCharList = new char[4][4];
		char[] charsList = new char[14];
		System.out.println(charsList.length);
		int j = 0;
		int listLength = dirtyList.size();
		//System.out.println(listLength);
		//System.out.println(dirtyList);
		for(Character chars : dirtyList){
			charsList[j] = chars;
			j++;
		}


		
		
			for(int count = 0; count < 4 ; count++){
				for(int i = 0; i < 4; i++){
					doubleCharList[count][i] = charsList[init];
					if(init < 13){
						init++;
					}else{
						init = 0;
					}
					
					//System.out.println(charsList[a]);
				
			}
		}
		
		return doubleCharList;
	}
	
	

}
