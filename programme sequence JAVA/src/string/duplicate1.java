package string;

public class duplicate1 {
	
public static void main(String[]args) {
	
String s="abcdab";

int len=s.length();

for(int i=0; i<len; i++) {
	
	for(int j=i+1;  j<len; j++) {
		
		if(s.charAt(i)==s.charAt(j)){
			
			System.out.println(s.charAt(j));
		}
		
	}
	
}


	
}	

}
