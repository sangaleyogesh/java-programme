package logicalprogramme;

public class printuppercaseAndconverttolowercase {
	
	
	public static void main(String[]args) {
		
		String s="YoGeSH";
		
		StringBuffer s1=new StringBuffer(s);
		
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isUpperCase(s.charAt(i))) {
				
			//	System.out.print(s.charAt(i));
				
				s1.setCharAt(i, Character.toLowerCase(s.charAt(i)));
				
			}

				else if(Character.isLowerCase(s.charAt(i))) {
					
				s1.setCharAt(i, Character.toUpperCase(s.charAt(i)));
				}
			 				
	       }
          	System.out.println(s1);	

}}
