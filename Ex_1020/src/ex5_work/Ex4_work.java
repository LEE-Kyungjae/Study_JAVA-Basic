package ex5_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//Ű���忡�� �Է¹��� �� ���� �ִ����� ���ϱ�
		//������� 10, 4�� �Է� �޾Ҵٸ� 2��
		//3, 7�� �Է¹޾Ҵٸ� '�ִ������� �����ϴ�'�� ���.
		Scanner sc = new Scanner(System.in);
		int check = 0;
		
		System.out.print("��1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int n2 = sc.nextInt();
		
		if( n1 >= n2 ) {
			check = n1;
		}else {
			check = n2;
		}
		
		int i = 0;
		for( i = check; i >= 1; i-- ) {
			if( n1 % i == 0 && n2 % i == 0 ) {
				break;
			}
		}//for
		
		if( i == 1 ) {
			System.out.println("�ִ������� �����ϴ�");
		}else {
			System.out.println("�ִ����� : " + i);
		}
		
	}//main
}












