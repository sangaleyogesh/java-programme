package generalization;

public class testclass {
	
	public static void main(String[]args) {
		
		airtel a=new airtel();
		a.audiocalling();
		a.internet();
		a.sms();
		a.hotstar();
		
		jio j=new jio();
		
		j.internet();
		j.sms();
		j.audiocalling();
		j.netflix();
		
		bsnl b=new bsnl();
		b.audiocalling();
		b.internet();
		b.sms();
		b.amazonprime();
		
	}
	

}
