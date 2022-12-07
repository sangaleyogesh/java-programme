package logicalprogramme;

public class junk_character_removal_by_regex_pattern {
	
	//removal of junk character by regex pattern
	
	public static void main(String[]args) {
		
	String word="ja$#v&apyth@#$on"; //removing junk from javapython word
	
	word=word.replaceAll("[^a-zA-Z0-9]", "");
	
	System.out.println(word);
		
		
		
	}

}
