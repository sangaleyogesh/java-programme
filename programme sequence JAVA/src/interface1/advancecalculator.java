package interface1;

public class advancecalculator implements calculator,casio {
	
	public static void main(String[]args) {
		
		System.out.println(x);
		
		
		
	}

	@Override
	public void addition() {
System.out.println("advance cal:addition");		
	}

	@Override
	public void substraction() {
System.out.println("advance cal:substraction");
		
	}

	@Override
	public void multiplication() {
System.out.println("advance cal:multiplication");
		
	}

	@Override
	public void log() {
System.out.println("advance calculator:log");		
	}

	@Override
	public void tan() {
System.out.println("advance calculator:tan");		
	}
public void cos() {
	System.out.println("advance cal:cos");
}
	public void sin() {
	System.out.println("advance cal:sin");	
	}
	

}
