package demo;

public class New_Parameter {

	public static void main(String[] args) {
		New_Parameter TX = new New_Parameter();
		TX.Tom(32.49, "Sakif", 'Z', 7000);
		New_Parameter.Rasif(12121, "Sayan");
		New_Parameter FL = new New_Parameter();
		FL.Sakif("Bushra", " Habiba");

	}
	
	public void Tom(Double x, String y, char z, int a) {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

	
	public static void Rasif(int a, String x) {
		
		System.out.println(a);
		System.out.println(x);
		
		
	}
	
	
	public String Sakif(String a, String b) {
		
		String x = a+b;
		System.out.println(x);
		return x;
	}
}
