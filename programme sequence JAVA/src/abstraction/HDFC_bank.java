package abstraction;

public class HDFC_bank extends RBI_bank{
	
	//concrete class of RBI-bank abstract class
	//EVERY INCOMPLETE METHOD CAN BE IMPLEMENT IS COMALSARY IN CONCRETE CLASS

	@Override
	public void loan() {

		System.out.println("HDFC-- LOAN");
	}
	
	public static void main(String[]args) {
		
		HDFC_bank hdfc=new HDFC_bank();
		
		hdfc.loan();
		hdfc.credit();
		hdfc.debit();
	}
	


}
