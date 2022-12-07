package string;

public class duplicate {

	//to find the duplicate character in string 
	
public static void main(String[]args) {
	
String s="abcdad";

int len=s.length();

for(int i=0; i<len; i++) {
	
	for(int j=i+1; j<len; j++) {	
	
	if(s.charAt(i)==s.charAt(j)) { 
		
	System.out.println(s.charAt(j));

		}
	
	}
	

}
}
	
	
}
