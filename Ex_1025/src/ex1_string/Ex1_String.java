package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String은 두 가지 특징을 가지고 있다.
		//1) 객체 생성법이 2가지다(암시적, 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		
		String s1 = "abc";
		String s2 = "abc";//암시적 객체생성
		
		String s3 = new String("abc");//명시적 객체생성
		
		//==은 객체간 비교시 값이 아닌 주소를 비교한다
		if( s1 == s3 ) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		//String클래스간 값 비교를 위해서 equals()기능을 사용
		if( s1.equals(s3) ) {
			System.out.println("값이 같습니다");
		}
		
		System.out.println("-------------------------");
		
		String greet = "hi";
		greet += " hello";
		System.out.println(greet);
		
		String a1 = "abc";
		String a2 = "abc";
		a2 = "abcd";
		
		
	}//main
}






















