package ex2_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//main에서 스캐너를 통해 두 개의 값과 연산기호를 입력받는다
		//Calc클래스의 getResult()메서드를 통해 결과를 출력
		//----------------------
		//수1 : 5
		//수2 : 10
		//연산자 : +
		//결과 : 15
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String op = sc.next();
		
		Calc calc = new Calc();
		String res = calc.getResult(su1, su2, op);
		
		System.out.println(res);
		
	}//main
}














