package ex5_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//�Ǻ���ġ ���� �����
		//1 1 2 3 5 8 13 21... �ٷ� ���� ���� �ΰ��� ���� ���������� ���
		//Ű���忡�� ���� �Է¹ް�, �Է¹��� Ƚ����ŭ�� �Ǻ���ġ ������ ���
		//-------------------
		//�ݺ�Ƚ�� : 6
		//1 1 2 3 5 8
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ�� : ");
		int cnt = sc.nextInt();
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		for( int i = 0; i < cnt; i++ ) {
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			System.out.print(num3 + " ");
		}//for
		
	}//main
}













