package demo;

public class GP_Practice_Parameter_Class {

	public static void main(String[] args) {
		GP_Practice_Parameter_Class.T(1001, 231, 800);	
		GP_Practice_Parameter_Class FL = new GP_Practice_Parameter_Class();
		FL.Z(11.99, 7.99);
		GP_Practice_Parameter_Class TX = new GP_Practice_Parameter_Class();
		TX.R("Sakif", " Sezan");
		GP_Practice_Parameter_Class NJ =new GP_Practice_Parameter_Class();
		NJ.S(101, 3.08, 'R', "Rishad");
		
		
	}
public static void T (int a, int b, int c) {
		
		int d = a+b*c;
		System.out.println(d);
		

}

public void Z(Double x,Double y) {
	
	Double c =x+y;
	System.out.println(c);
}
static void R(String a,String b) {
	
	String c =a+b;
	System.out.println(c);
}
public void S(int a,Double b,char c,String d) {
	
	
	System.out.println(a+b+d);
	System.out.println(c);
}
}


