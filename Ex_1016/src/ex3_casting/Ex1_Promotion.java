package ex3_casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
		//캐스팅(형변환)
		//1)프로모션
		// - 큰 자료형에 작은 자료형이 대입되는 것(자동O)
		//2)디모션
		// - 작은 자료형에 큰 자료형이 대입되는 것(자동X)
		double d = 100.5;//8byte
		int n = 200;// 4byte
		d = n;
		System.out.println("d : " + d);
		char c = 'A';//2byte;
		int n2 = 100;//4byte
		n2 = c ;
		System.out.println("n2 : " + n2);
				
	}//main
}
