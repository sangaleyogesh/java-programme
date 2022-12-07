package constructor;

public class userdefinedconstructor1{ //userdefined constructor with parameter
	
	String carname;
	String model;
	int price;
	String engine;
	
	public userdefinedconstructor1(String name1,String model1,int price1,String engine1) {
		
	carname=name1;
	model=model1;
	price=price1;
	engine=engine1;

	}
	public static void main(String[]args) {
		
		userdefinedconstructor1 ud1=new userdefinedconstructor1("kia","seltos",200000,"automatic");	
		
		userdefinedconstructor1 ud2=new userdefinedconstructor1("Tata","Nexon",500000,"manual");	

		System.out.println(ud1.carname+" "+ud1.model+" "+ud1.price+" "+ud1.engine);
		System.out.println(ud2.carname+" "+ud2.model+" "+ud2.price+" "+ud2.engine);

	
	}
	
	
	
}