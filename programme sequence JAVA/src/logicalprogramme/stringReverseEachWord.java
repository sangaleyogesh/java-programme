package logicalprogramme;

public class stringReverseEachWord {
	
	//reverse eachword at that place
	public static void main(String[]args) {
		
	String word="java python ruby";
		
	String reversestring="";
	
	String []w=word.split(" "); //spliting by space so that value wil be like using the for each loop
								//java  index-0
								//python   1
								//ruby     2
	for(String w1:w) {
		
	String reverseword="";
		
	for(int i=w1.length()-1; i>=0; i--) {
		
	reverseword=reverseword+w1.charAt(i);
		
			}	
	reversestring=reversestring+reverseword+" ";
		
	}
	System.out.println(reversestring);
	
	}
	
		
		
	

}
