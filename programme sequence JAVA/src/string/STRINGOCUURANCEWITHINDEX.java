package string;

public class STRINGOCUURANCEWITHINDEX {
//TO FIND THE OCCURANCE count  OF a and index first index
	
	public static void main(String[] args) {
		
		String s="yogesh sangalae";
		
		int l=s.length();
		
	String s1=s.replace("a", "");
	
		int l1=s1.length();
		
		int  count=l-l1;
		
		System.out.println(count);
		
		
		int index=s.indexOf("a"); //TO FIND THE FISRST INDEX
		
		System.out.println(index);
		
		int index1=s.indexOf("a" ,s.indexOf("a")+1);
		
		System.out.println(index1);
		
		int index2=s.indexOf("a", s.indexOf("a", s.indexOf("a", s.indexOf("a")+1)+1));
	
		System.out.println(index2);
		
		
	}
	
	
}
