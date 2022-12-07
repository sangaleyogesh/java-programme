package constructor;

public class userdefinedconstructor {
	
	int i;
	int j;
	double k;

public userdefinedconstructor(int x,int y) {
	
	i=x;
	j=y;
}
public userdefinedconstructor(int y, double z){
	
	j=y;
	k=z;
}

public void m1() {
	
System.out.println(i);
System.out.println(j);
System.out.println(k);

}

public static void main(String[]args) {
	
	userdefinedconstructor ud1=new userdefinedconstructor(30,40);
	ud1.m1();
	userdefinedconstructor ud2=new userdefinedconstructor(60,50.1);
	ud2.m1();
}





}