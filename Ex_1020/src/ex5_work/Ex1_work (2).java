package ex5_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// Scanner�� ���� ���� n1, n2�� ���� �Է¹޴´�
		// n1 ~ n2������ ���� ����Ͽ� ����� ���
		// ------------------
		// ��1 : 2
		// ��2 : 5
		// ��� : 14

		// ��1 : 5
		// ��2 : 2
		// ��� : 14

		Scanner sc = new Scanner(System.in);

		System.out.print("��1 : ");
		int su1 = sc.nextInt();

		System.out.print("��2 : ");
		int su2 = sc.nextInt();

		int res = 0;// su1�� su2������ ��� ���� ���� ������ ����

		//swap
		if( su1 > su2 ) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		
		for (int i = su1; i <= su2; i++) {
			res += i;
		}

		System.out.println("��� : " + res);

	}// main
}










