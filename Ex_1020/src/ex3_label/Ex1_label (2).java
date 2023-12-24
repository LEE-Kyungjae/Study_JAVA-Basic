package ex3_label;

public class Ex1_label {
	public static void main(String[] args) {
		
		//label : 특정 반복문에 이름을 붙여서 한번에 두 개 이상의 반복문을 제어할 수 있다
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























