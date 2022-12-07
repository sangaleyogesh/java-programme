package logicalprogramme;

public class printprimenumber{
	//print prime number up to 10-->2,3,5,7
public static void main(String[]args) {
	
	int i;
	int j;
	
	for( i=1; i<10;i++) {
		
		for(j=2; j<i;j++) {
			
			if(i%j==0)
				
				break;
		}
		if(i==j) {
			System.out.print(" "+j);
		}
	
	}
}	
	

}