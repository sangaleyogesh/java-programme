package string;

public class split {
	
	public static void main(String[]args) {
		
		String s="20/5/2022";
		
		String s1[]= s.split("/");
		
		for(int i=0; i<s1.length; i++) {
			
			System.out.println(s1[i]);
		}
				
		
	}

}
