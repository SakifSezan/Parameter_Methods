package firstpkg;

public class First_Non_static_Parameter_Class {

	public static void main(String[] args) {
		First_Non_static_Parameter_Class T = new First_Non_static_Parameter_Class();
		T.S(111, 23141);

	}
	public void S(int a, int b) {
		
		int c =  a*b;
		System.out.println(c);
	}

}
