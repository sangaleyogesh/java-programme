package encapsulation;

public class empdata {
	private int Pin;
	private String Name;
	private int Age;	
	private int Rollno;
public static void main(String[]args) {
	
//encapsulation is the process of wrapping the datacode and variables in to single unit
//variable are always private and method are public ,variables can not access directly to the another class
	//methods are directly created by right click on source-->generate getters and setters
	
	
	empdata emp=new empdata();
	
	emp.setPin(4222);
	
	emp.setName("yogesh");
	
	emp.setAge(30);
	
	emp.setRollno(20);
	System.out.println("emp pin is:"+emp.getPin());
	
	System.out.println("emp name is:"+emp.getName());
	
	System.out.println("emp age is:"+emp.getAge());
	
	System.out.println("emp roll no:"+emp.getRollno());
	
}

public int getPin() {
	return Pin;
}

public void setPin(int pin) {
	Pin = pin;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}	

public int getRollno() {
	
	return Rollno;
	
}
public void setRollno(int rollno) {
	
Rollno=rollno;	
}


}
