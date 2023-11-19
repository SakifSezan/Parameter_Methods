package demo;

public class Parameter_Class {

	public static void main(String[] args) {
		hiSakif();
		Parameter_Class TX = new Parameter_Class();
		TX.helloSezan(100.12188918);
		Parameter_Class FL = new Parameter_Class();
		FL.Houston(179, 799);
		//Parameter_Class.ClearLake('S', 'B');
		Parameter_Class.ClearLake('S', 'B', 'R');
		Parameter_Class.Galveston(1.99f, 15.99f);
	}
	
	public static void hiSakif() {
		
		System.out.println("Sakif Sezan");
	}
	
	public void helloSezan(Double a) {
		
		System.out.println(a);
		
		
		
	}
	
	public void Houston(int x, int y) {
		
		int z = x*y;
		System.out.println(z);
		
	}

	
	public static void ClearLake(char a, char b, char c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	
	public static void Galveston(float a, float b) {
		
		float c = a*b;
		System.out.println(c);
	}
}
