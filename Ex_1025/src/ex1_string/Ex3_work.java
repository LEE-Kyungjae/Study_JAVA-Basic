package ex1_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//Ű���忡�� �ƹ����̳� �Է��� �޴´�
		//�Է¹��� ���忡 �ҹ��� a�� ������ ����Ͻÿ�
		//---------------------
		//�Է� : aaIOUTYISa@#$%^asdfa
		//a�� ���� : 5
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("�Է� : ");
		String str = sc.next();
		
		for( int i = 0; i < str.length(); i++ ) {
			
			if( str.charAt(i) == 'a') {
				count++;
			}
			
		}//for
		
		System.out.println("a�� ���� : " + count);
		
	}//main
}











