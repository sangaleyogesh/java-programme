package constructor;

public class constructor7{
	
	String carname;
	String model;
	String engine;
	int price;
public constructor7(String name1, String model1,String engine1,int price1) {
	carname=name1;
	model=model1;
	engine=engine1;
	price=price1;
	

}
public void m1() {
	
	System.out.println(carname+" "+model+" "+engine+" "+price);
}

public static void main(String[]args) {
	
constructor7 ud1=new constructor7("Maruti","alto800","automatic",100000);	
ud1.m1();
constructor7 ud2=new constructor7("Tata","Nexon","automatic",200000);
ud2.m1();
constructor7 ud3=new constructor7("maruti","Wagnor","automatic",300000);
ud3.m1();
}


}

