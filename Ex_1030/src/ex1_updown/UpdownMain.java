package ex1_updown;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		//��ĳ�ʸ� ���� Ű���忡�� ���� �Է¹�����
		//UpdownCheckŬ�������� ������ ������(1 ~ 50����)�� ���Ͽ�
		//UP���� DOWN������ ���.
		//������ ���� ��� main���� �ڵ带 �����ϵ��� ó��.
		//------------------------------
		//�� : 30
		//DOWN
		//�� : 15
		//UP
		//�� : 25
		//3ȸ ���� ����!!
		
		Scanner sc = new Scanner(System.in);
		UpdownCheck udc = new UpdownCheck();
		
		while(true) {
			
			System.out.print("�� : ");
			int num = sc.nextInt();
			
			boolean check = udc.check(num);
			
			if( check ) {//check == true
				//break;
				return;
			}
			
		}//while
		
	}//main
}

















