package ex2_multi_array;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {

		//�л����� �̸�, ����, ������� �Է¹ް�, ����ϴ� ���α׷��� ����ÿ�
		//-----------------------
		//����� �ο� �� : 2
		//�̸� : hong
		//���� : 90
		//���� : 87
		//---------------
		//�̸� : kim
		//���� : 70
		//���� : 100
		//---------------
		//2�� ��� �Ϸ�!!
		//hong 	90	87
		//kim	70	100

		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int n = sc.nextInt();
		
		String[] info = {"�̸� : ", "���� : ", "���� : ", "���� : "};
		String[][] str = new String[n][info.length];
		
		for( int i = 0; i < str.length; i++ ) {
			
			for( int j = 0; j < str[i].length; j++ ) {
				
				System.out.print(info[j]);
				str[i][j] = sc.next();
				
			}//inner
			
			System.out.println("----------------");
			
		}//outer
		
//		for( int i = 0; i < n; i++ ) {
//			
//			System.out.print("�̸� : ");
//			str[i][0] = sc.next();
//			
//			System.out.print("���� : ");
//			str[i][1] = sc.next();
//			
//			System.out.print("���� : ");
//			str[i][2] = sc.next();
//			
//			System.out.println("----------------");
//		}//for
		
		System.out.println(n + "�� ��� �Ϸ�!!");
		
		for( int i = 0; i < str.length; i++ ) {
			
			for( int j = 0; j < str[i].length; j++ ) {
				System.out.print( str[i][j] + " " );
			}//inner
			
			System.out.println();
			
		}//outer
		
		
	}//main
}





















