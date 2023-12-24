package ex4_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		
		//Scanner : 키보드에서 값을 입력받을 수 있도록 하는 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		System.out.println("n : " + n);
		
		System.out.print("연산자 : ");
		String op = sc.next();
		System.out.println(1 + op + 2);
		
	}//main
}















