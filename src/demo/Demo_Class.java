package demo;

public class Demo_Class {

	public static void main(String[] args) {
		Demo_Class.Sakif(11.92, 3.15);	
		Demo_Class TX = new Demo_Class();
		TX.String("Sakif", " Sezan");
		Demo_Class.S('R', 'C');

	}
	
	static void Sakif(Double a, Double b) {
		
		Double c = a*b;
		System.out.println(c);
		
	}
	
	 void String (String x, String y) {
	
		String z = x+y;
		System.out.println(z);
		
		
	}
	 
	 public static void S(char a, char b) {
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 
	 }
}


