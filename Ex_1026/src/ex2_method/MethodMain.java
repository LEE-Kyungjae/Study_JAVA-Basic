package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		mt1.test1(2, 5);
		
		int su = 100;
		mt1.test2(su);
		System.out.println("su : " + su);
		
		int[] arr = {1, 2, 3};
		mt1.printArr(arr);
		
		System.out.println("--arr--");
		for( int a : arr ) {
			System.out.println(a);
		}
	}//main
}













