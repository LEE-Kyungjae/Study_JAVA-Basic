package ex1_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//���� question�� O, X���� ����ִ´�
		//OOXXO��� 1 + 2 + 0 + 0 + 1 = 4
		//OOOXOO��� 1 + 2 + 3 + 0 + 1 + 2 = 9
		//OXXOOXOOO��� 1 + 0 + 0 + 1 + 2 + 0 + 1 + 2 + 3 = 10
		//-----------------
		//�Է� : OXXOOXOOO
		//��� : 10
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String question = sc.next();
		
		int cnt = 0;
		int sum = 0;
		
		for( int i = 0; i < question.length(); i++ ) {
			
			if( question.charAt(i) == 'O' ) {
				cnt++;
			}else {
				cnt = 0;
			}
			
			sum += cnt;
			
		}//for
		
		System.out.println("��� : " + sum);
		
	}//main
}










