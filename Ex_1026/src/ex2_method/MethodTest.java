package ex2_method;

public class MethodTest {
	
	public void test1( int a, int b ) {
		a += b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public void test2( int n ) {
		n++;
		System.out.println("n : " + n);
	}
	
	public void printArr( int[] n ) {
		System.out.println("--printArr--");
		n[0] = 5;
		for( int a : n ) {
			System.out.println(a);
		}
		System.out.println("-----------");
	}
	
}













