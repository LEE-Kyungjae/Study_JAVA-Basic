package ex3_label;

public class Ex1_label {
	public static void main(String[] args) {
		
		//label : Ư�� �ݺ����� �̸��� �ٿ��� �ѹ��� �� �� �̻��� �ݺ����� ������ �� �ִ�
		out:for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 == 0 ) {
					break out;
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("----------------------");
	
		int n = 0;
		out : while(true) {
			n++;
			
			switch(n) {
			case 1:
				System.out.println("i am 1");
				break out;
			}//switch
			
		}//while
		
	}//main
}























