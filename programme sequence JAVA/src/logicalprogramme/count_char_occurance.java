package logicalprogramme;

public class count_char_occurance {
	
	public static void main(String[]args) {
		
		//to chrck count of character in sentence
		
		String str="hello good evening good evening";
		
		int totalcount=str.length();
				
		int countafter_replace=str.replace("v", "").length();
		
		int count=totalcount-countafter_replace;
		
		System.out.println(count);

	}

}
