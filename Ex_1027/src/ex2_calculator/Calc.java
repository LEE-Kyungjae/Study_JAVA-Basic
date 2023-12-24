package ex2_calculator;

public class Calc {
	public String getResult( int a, int b, String c ){

		String result = "";

		switch( c ) {
		case "+":
			result = String.format("결과 : %d\n", a + b);
			break;

		case "-":
			result = String.format("결과 : %d\n", a - b);
			break;

		default:
			result = "올바른 연산기호가 아닙니다";
			break;
		}//switch

		return result;
		
	}
}










