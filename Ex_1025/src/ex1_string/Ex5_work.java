package ex1_string;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		//Ű���忡�� ���� �ް� �Է¹��� ���� ȸ��(��)���� �Ǵ�
		//ȸ��(��) : �տ��� �о, �ڿ��� �о �Ȱ��� ������ ���ڳ� ����
		//-----------------------
		//�� : a121a
		//a121a��(��) ȸ��(��) �Դϴ�
		
		//�� : 123
		//123��(��) ȸ��(��)�� �ƴմϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		
		String ori = sc.next();//�������ڿ�
		String rev = "";//������ ����� ������ ����
		
		for( int i = ori.length()-1; i >= 0; i--  ) {
			rev += ori.charAt(i);			
		}//for
		
		if( ori.equals(rev) ) {
			System.out.println(ori + "��(��) ȸ���� �Դϴ�");
		}else {
			System.out.println(ori + "��(��) ȸ������ �ƴ�");
		}
		
	}//main
}
















