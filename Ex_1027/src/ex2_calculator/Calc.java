package ex2_calculator;

public class Calc {
	public String getResult( int a, int b, String c ){

		String result = "";

		switch( c ) {
		case "+":
			result = String.format("��� : %d\n", a + b);
			break;

		case "-":
			result = String.format("��� : %d\n", a - b);
			break;

		default:
			result = "�ùٸ� �����ȣ�� �ƴմϴ�";
			break;
		}//switch

		return result;
		
	}
}










