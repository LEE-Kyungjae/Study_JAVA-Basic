package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복문 내에서 특정 문장들을 건너뛰고자 할 때
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5; ) {
				
				j++;
				if( j % 2 == 0 ) {
					//for문 안에서의 continue는 
					//가장 가까운 for문의 증감식으로 건너뛴다
					
					//만약 for문에 증감식이 없다면
					//조건식으로 건너뛴다
					continue;
					//System.out.println();
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}






























