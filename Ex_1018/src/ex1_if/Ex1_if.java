package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		/*
		 제어문 (control statement) : 프로그램의 흐름을 제어하는 문장 
		 크게 분기문과 반복문으로 나뉜다.
		 분기문 : if,switch
		 반복문 : for, while
		 */
		
//		if문
//		if( 조건식 ){
//		조건식이 참인경우 실행되는 영역 
//		}
		
		int n = 51;
		String str = "";
		
		if( n == 50) {
			str = "n은 50입니다";
		}
		
		if( n != 50) {
			str = "n은 50이 아닙니다";			
		}
		
		System.out.println(str);
		
	}// main
}











