package ex1_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� ���������� Ű����
		
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 == 0 ) {
					break;
					//break���� �Ʒ��ٿ��� � �ڵ嵵 �߰��� �� ����.
					//System.out.println("aaa");
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}










































