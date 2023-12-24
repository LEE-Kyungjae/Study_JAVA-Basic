package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//JAVA
		for( int i = 0; i < ch.length; i++ ) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		//배열의 선언, 생성, 초기화를 한 줄로
		String[] sArr = {"유비", "관우", "장비"};
//		for( int i = 0; i < sArr.length; i++ ) {
//			System.out.println( sArr[i] );
//		}
		
		//개선된 루프(향상된 for문)
		//배열의 각 인덱스에 대한 접근이 불가
		for( String s : sArr ) {
			System.out.println(s);
		}
		
	}//main
}








