package ex2_continue;

public class Ex2_continue {
	
	public static void main(String[] args) {
		
		int n = 0;
		while( n < 5 ) {
			n++;
			
			if( n % 2 == 0 ) {
				//while문 에서 사용한 continue는
				//while문의 증감식으로 건너뛴다
				continue;
			}
			
			System.out.println(n);
		}//while
		
		System.out.println("--------------");
		
		int num = 0;
		while( num <= 5  ) {
			num++;
			
			switch(num) {
			case 1:
				System.out.println("i am 1");
				continue;
				
			case 2:
				System.out.println("i am 2");
				continue;
			}//switch
			
		}//while
		
	}//main
	
}








