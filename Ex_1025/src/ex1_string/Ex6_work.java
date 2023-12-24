package ex1_string;

import java.util.Scanner;

public class Ex6_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값을 암호화 하여 출력
		//----------------------
		//입력 : abc123
		//결과 : `~!wer
		
		Scanner sc = new Scanner(System.in);
		char[] alphaCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				            '(', ')', '-', '_', '+', '=', '|', '[', ']', 
				            '{', '}', ';', ':', ',', '.', '/'};
		
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		System.out.print("입력 : ");
		String src = sc.next();//키보드에서 값을 받는다
		String result = "";
		
		//src의 문자를 charAt()으로 하나씩 가져와서 변환한 후 result에 저장
		for( int i = 0; i < src.length(); i++ ) {
			//src : abc123라고 가정
			char ch = src.charAt(i);
			
			if( ch >= 'a' && ch <= 'z' ) {
				result += alphaCode[ch - 'a'];
				
			}else if( ch >= '0' && ch <= '9' ) {
				result += numCode[ch - '0'];
				
			}
			
		}//for
		
		System.out.println("결과 : " + result);
		
	}//main
}












