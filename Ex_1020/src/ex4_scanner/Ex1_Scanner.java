package ex4_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		
		//Scanner : Ű���忡�� ���� �Է¹��� �� �ֵ��� �ϴ� Ŭ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int n = sc.nextInt();
		System.out.println("n : " + n);
		
		System.out.print("������ : ");
		String op = sc.next();
		System.out.println(1 + op + 2);
		
	}//main
}















