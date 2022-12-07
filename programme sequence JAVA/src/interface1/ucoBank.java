package interface1;

public class ucoBank implements RbiBank ,USbank,BrazilBank{

	public static void main(String[]args) {
		
		System.out.println(minbalance);
		
	}
	
	@Override
	public void credit() {
		System.out.println("uco bank credit card");
		
	}

	@Override
	public void debit() {
		System.out.println("uco bank debit card");
	}

	@Override
	public void loan() {
		System.out.println("uco bank loan");
	}

	@Override
	public void homeloan() {

		System.out.println("uco bank home loan");
	}

	@Override
	public void carloan() {
System.out.println("uco bank car loan");		
	}
	
	
	

}
