package ex5_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//Ű���忡�� �Է¹��� �� �ΰ��� �ּҰ������ ���Ͻÿ�
		//������� 2,5�� �Է¹޾Ҵٸ� 10��, 
		//4,6�� �Է¹޾Ҵٸ� 12�� ����ؾ� �Ѵ�
		//-------------------------
		//��1 : 4
		//��2 : 6
		//�ּҰ���� : 12
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int n2 = sc.nextInt();
		
		for( int i = 1; i <= n1 * n2; i++ ) {
			
			if( i % n1 == 0 && i % n2 == 0 ) {
				System.out.println("�ּҰ���� : " + i);
				break;
			}
			
		}//for
		
	}//main
}









