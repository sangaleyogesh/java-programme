package encapsulation;

public class diffclass {

	//access variable from different class by using setter and getter method
	
	public static void main(String[]args) {
		
		empdata emp=new empdata();
		
		emp.setAge(40);
		emp.setName("anita");
		emp.setPin(2022);
		
		System.out.println(emp.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getPin());
		
	}
	
}
