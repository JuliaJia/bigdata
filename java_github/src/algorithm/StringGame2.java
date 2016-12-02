package algorithm;

import java.util.List;
import java.util.ArrayList;

public class StringGame2 {
	private static String[] words = {"this","two","fat","that"};
	private static char[][] gameChar = {{'t','h','i','s'},{'w','a','t','s'},{'o','a','h','g'},{'f','g','d','t'}};
	
	public static void main(String[] args) {
		String word1 = "";
		String word2 = "";

		
		List<String> wordList = new ArrayList<String>();


		String direction;
		String[][][] wordCheck = {{{"right","down","rightdown"},{"down"},{"down"},{"left","down","leftdown"}},{{"right"},{"jump"},{"jump"},{"left"}},{{"right"},{"jump"},{"jump"},{"left"}},{{"right","up","rightup"},{"up"},{"up"},{"left","up","leftup"}}};
		for(int i = 0;i < wordCheck.length;i++){
			for(int j = 0;j < wordCheck[i].length;j++){
				for(int a = 0; a < wordCheck[i][j].length;a++){
					direction = wordCheck[i][j][a];
					switch (direction) {
					case "right":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						word1 = "";
						word2 = "";
						String word3 = "";
						for(int b = 0; b < 4; b++){
							word1 = word1 + gameChar[i][b];
						}
						for(int c = 0 ; c < 3; c++){
							word2 = word2 + gameChar[i][c];
						}
						for(String d : words){
							//System.out.println(word);
							if(word1.equals(d)){
								word3 = word1;
							}else if(word2.equals(d)){
								word3 = word2;
							}
						}
						if((!wordList.contains(word3)) & word3 != ""){
							wordList.add(word3);
						}
						
						break;
					case "down":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						word1 = "";
						word2 = "";
						word3 = "";

						
						for(String d : words){
							for(int b = 0; b < 4; b++){
								word1 = "";
								for(int e = 0; e < 4; e++){
									word1 = word1 + gameChar[e][b];
								}
								if(word1.equals(d)){
									//System.out.println(word1);
									word3 = word1;
								}
							}
							for(int c = 0; c < 3; c++){
								word2 = "";
								for(int e = 0; e < 3; e++){
									word2 = word2 + gameChar[e][c];
								}
								if(word2.equals(d)){
									//System.out.println(word2);
									word3 = word2;
								}
								
								
							}
							
						}
						if((!wordList.contains(word3)) & word3 != ""){
							wordList.add(word3);
						}
						

						break;
					case "up":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					case "left":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					case "leftup":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					case "leftdown":
						int offset1 = 0;
						int offset2 = 3;
						
						word1 = "";
						word2 = "";
						word3 = "";
						for(int b = 0; b < 4; b++){
							word1 = word1 + gameChar[offset2][offset1];
							offset1++;
							offset2--;
							for(String d : words){
								if(word1.equals(d)){
									//System.out.println(d);
									word3 = word1;
								}
							}
							
						}
						if((!wordList.contains(word3)) & word3 != ""){
							wordList.add(word3);
						}
						offset1 = 0;
						offset2 = 3;

						for(int c = 0; c < 3; c++){
							word2 = word2 + gameChar[offset2][offset1];
							offset1++;
							offset2--;
							for(String d : words){
								if(word1.equals(d)){
									
									//System.out.println(d);
									word3 = word2;
								}
							}
							
						}
						if((!wordList.contains(word3)) & word3 != ""){
							wordList.add(word3);
						}
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					case "rightdown":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					case "rightup":
						offset1 = 3;
						offset2 = 3;
						
						word1 = "";
						word2 = "";
						word3 = "";
						for(int b = 0; b < 4; b++){
							word1 = word1 + gameChar[offset2][offset1];
							offset1--;
							offset2--;
							for(String d : words){
								if(word1.equals(d)){
									//System.out.println(d);
									word3 = word1;
								}
							}
							
						}
						if((!wordList.contains(word3)) & word3 != ""){
							wordList.add(word3);
						}
						offset1 = 3;
						offset2 = 3;

						for(int c = 0; c < 3; c++){
							word2 = word2 + gameChar[offset2][offset1];
							offset1--;
							offset2--;
							for(String d : words){
								if(word2.equals(d)){
									//System.out.println(d);
									word3 = word2;
								}
							}
							
						}
						if((!wordList.contains(word3)) & word3 != ""){
							wordList.add(word3);
						}
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					case "jump":
						//System.out.println("(" + i + "," + j + "," + a + ")");
						break;
					default:
						break;
					}
				}
			}
		}
		
		//System.out.println(wordList.toString());
		for(String d : wordList){
			System.out.println(d);
		}

	}

}