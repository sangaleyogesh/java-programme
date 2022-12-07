package logicalprogramme;

public class printuppercaseLetter {
	
	public static void main(String []args) {
		
		String s="YoGeSh";
		
		
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isUpperCase(s.charAt(i))) {
				
				char uppercase=s.charAt(i);
				
				System.out.print(uppercase);
			}
		}
			
		System.out.println();
		
			for(int j=0; j<s.length(); j++) {

			if(Character.isLowerCase(s.charAt(j))) {
				
				char lowercase=s.charAt(j);
			
				System.out.print(lowercase);
			
		}
			}
		
		
	

}
}
		
