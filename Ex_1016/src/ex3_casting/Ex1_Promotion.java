package ex3_casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
		//ĳ����(����ȯ)
		//1)���θ��
		// - ū �ڷ����� ���� �ڷ����� ���ԵǴ� ��(�ڵ�O)
		//2)����
		// - ���� �ڷ����� ū �ڷ����� ���ԵǴ� ��(�ڵ�X)
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
