package ex3_casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
		char c1 = 'A';
		int n = c1 + 1;
		c1 = (char)n;
		System.out.println("c1 : " +c1);
	
		float f1 = 5.5f;
		int n1 = 0;
		n1 = (int)f1;
		System.out.println("n1 : " +n1);
	}//main
}
