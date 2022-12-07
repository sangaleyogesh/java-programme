package interface1;

public class testclass1 {

public static void main(String[]args) {
	
advancecalculator ad=new advancecalculator();
ad.addition();
ad.substraction();
ad.multiplication();
ad.log();
ad.tan();
ad.cos();
ad.sin();

/*--------------------------------------*/

calculator c=new advancecalculator();  // top casting 
c.addition();
c.substraction();
c.multiplication();

}	


}

