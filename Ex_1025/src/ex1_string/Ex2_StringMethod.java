package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//스트링 클래스의 메서드들
		//메서드란? 어떠한 작업을 수행하기 위한 명령문들의 집합
		//자주 사용되는 코드를 메서드로 만들어두면 필요할 때 마다 가져다가 쓸 수 있다.
		String str = "Hong Gil Dong";
		int idx = str.length();
		System.out.println("문장 str의 길이 : " + idx);
		
		idx = str.indexOf('o');
		System.out.println("맨 처음 문자 o의 위치 : " + idx);
		
		idx = str.lastIndexOf('o');
		System.out.println("마지막 o의 위치 : " + idx);
		
		char c = str.charAt(5);
		System.out.println("5번째 위치의 문자 : " + c);
		
		String a1 = " hel lo ";
		//trim() : 문장 앞이나 뒤의 의미없는 공백을 제거
		System.out.println(a1.trim().length());
		
		String a2 = "apple";
		if( a2.equals("apple") ) {
			System.out.println("equals()를 통해 값을 비교할 수 있다");
		}
		
		if( a2.equalsIgnoreCase("Apple") ) {
			System.out.println("equalsIgnoreCase()는 대소문자 구별없이 값이 같은지 비교");
		}
		
		//스트링 클래스의 메서드는 아니지만, 
		//문자열로 작성된 숫자형태의 코드를 실제 숫자로 바꿔주는 메서드를 보자
		String number = "100";
		int a = Integer.parseInt(number);
		System.out.println( a + 1 );
		
		String number2 = "10.1";
		float f = Float.parseFloat(number2);
		System.out.println(f + 1);
		
		//wrapper클래스들
		//int - Integer
		//char - Character
		//boolean - Boolean
		//byte - Byte
		//short - Short
		//long - Long
		//float - Float
		//double - Double
	}//main
}














