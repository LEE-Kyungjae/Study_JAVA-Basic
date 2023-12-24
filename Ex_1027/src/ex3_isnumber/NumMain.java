package ex3_isnumber;

import java.util.Scanner;

public class NumMain {
	public static void main(String[] args) {
		
		//키보드에서 값을 받고, 입력받은 값이 모두 숫자로만 이루어져 있는지를 판단
		//----------------------------
		//입력 : 1234
		//1234는 숫자입니까? true
		
		//입력 : 1aa
		//1aa는 숫자입니까? false
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		PrintNumber pn = new PrintNumber();
		result = pn.isNumber(str);
		
		System.out.println( str + "은 숫자입니까?" + result);
	}//main
}













