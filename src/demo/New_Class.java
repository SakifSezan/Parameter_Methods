package demo;

public class New_Class {

	public static void main(String[] args) {
		New_Class.T(1, 2);	
		New_Class N = new New_Class();
		N.H('S', 'R');
		New_Class.D("Sakif", " Sezan");

	}
	public static void T(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void H(char a, char b) {
		
		System.out.println(a);
		System.out.println(b);
	}
	static void D(String a, String b) {
		String c = a+b;
		System.out.println(c);
	}
	

}
