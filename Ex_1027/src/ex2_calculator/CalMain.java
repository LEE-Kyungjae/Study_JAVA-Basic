package ex2_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//main���� ��ĳ�ʸ� ���� �� ���� ���� �����ȣ�� �Է¹޴´�
		//CalcŬ������ getResult()�޼��带 ���� ����� ���
		//----------------------
		//��1 : 5
		//��2 : 10
		//������ : +
		//��� : 15
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("������ : ");
		String op = sc.next();
		
		Calc calc = new Calc();
		String res = calc.getResult(su1, su2, op);
		
		System.out.println(res);
		
	}//main
}














