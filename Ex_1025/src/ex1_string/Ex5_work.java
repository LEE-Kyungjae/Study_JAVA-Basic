package ex1_string;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		//키보드에서 값을 받고 입력받은 값이 회문(수)인지 판단
		//회문(수) : 앞에서 읽어도, 뒤에서 읽어도 똑같이 읽히는 숫자나 문자
		//-----------------------
		//값 : a121a
		//a121a은(는) 회문(수) 입니다
		
		//값 : 123
		//123은(는) 회문(수)이 아닙니다
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		
		String ori = sc.next();//원본문자열
		String rev = "";//원본을 뒤집어서 저장할 변수
		
		for( int i = ori.length()-1; i >= 0; i--  ) {
			rev += ori.charAt(i);			
		}//for
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "은(는) 회문수 입니다");
		}else {
			System.out.println(ori + "은(는) 회문수가 아님");
		}
		
	}//main
}
















