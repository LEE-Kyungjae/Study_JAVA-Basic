package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {

		int a = 10;
		int b = 12;
		boolean res = ++a >= b || 2 + (a - 3) <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
		System.out.println(res);

	}// main
}

