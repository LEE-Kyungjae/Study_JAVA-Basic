package ex1_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//키보드에서 아무값이나 입력을 받는다
		//입력받은 문장에 소문자 a의 갯수를 출력하시오
		//---------------------
		//입력 : aaIOUTYISa@#$%^asdfa
		//a의 갯수 : 5
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("입력 : ");
		String str = sc.next();
		
		for( int i = 0; i < str.length(); i++ ) {
			
			if( str.charAt(i) == 'a') {
				count++;
			}
			
		}//for
		
		System.out.println("a의 갯수 : " + count);
		
	}//main
}











