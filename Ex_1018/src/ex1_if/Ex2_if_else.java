package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {

		// if-else : 하나의 조건을 두고 참과 거짓을 모두 판별하는 문법
//		if( 조건식 ){
//		조건이 참일때 실행되는 영역
//		}else{
//		조건이 거짓일 때 실행되는 영역
//		}
//		
		int n = 48;
		String str = "";

		if (++n >= 50) {
			str = "50이상의 수";
		} else {
			str = "50미만의 수";

		}
		System.out.println(str);

		// 위의 if-else코드를 삼항 연산자로 변경

		n = 48;
		String over = "50이상의 수";
		String less = "50미만의 수";
		String result = ++n >= 50 ? over : less;
		System.out.println(result);//
		System.out.println("----------");

		int age = 30;
		int limit = 30;
		String res = age >= limit ? "드실만큼 드셨군요" : "좀더 드셔도 됨";
		System.out.println(res);
		
		if (age >= limit) {
			res = "드실만큼 드셨군요";
		} else {
			res = "좀더 드셔도 됨";
		}
		System.out.println(res);
		
	}// main
}
