package demo;

public class Practice_Class {

	public static void main(String[] args) {
		Practice_Class TX = new Practice_Class();
		TX.Example(10.70, 2.99);
		Practice_Class NJ = new Practice_Class();
		NJ.New("Bushra", " Habiba");
		Practice_Class.Sakif('J');
		//Practice_Class.Sezan("Sakif", 'S', " Rishad");
		Practice_Class.Sezan("Sakif", " Sezan", " Rishad");
		
	}

	public void Example(Double a, Double b) {
		
		Double c = a*b;
		System.out.println(c);
	}
	
	public void New(String a, String b) {
		
		String c = a+b;
		System.out.println(c);
	}
	
	static void Sakif(char a) {
		
		System.out.println(a);
	}
	
	static void Sezan(String a, String string, String c) {
		
		String d = a+string+c;
		System.out.println(d);
	}
}


