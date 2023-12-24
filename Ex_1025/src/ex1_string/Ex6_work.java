package ex1_string;

import java.util.Scanner;

public class Ex6_work {
	public static void main(String[] args) {
		
		//Ű���忡�� �Է¹��� ���� ��ȣȭ �Ͽ� ���
		//----------------------
		//�Է� : abc123
		//��� : `~!wer
		
		Scanner sc = new Scanner(System.in);
		char[] alphaCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				            '(', ')', '-', '_', '+', '=', '|', '[', ']', 
				            '{', '}', ';', ':', ',', '.', '/'};
		
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		System.out.print("�Է� : ");
		String src = sc.next();//Ű���忡�� ���� �޴´�
		String result = "";
		
		//src�� ���ڸ� charAt()���� �ϳ��� �����ͼ� ��ȯ�� �� result�� ����
		for( int i = 0; i < src.length(); i++ ) {
			//src : abc123��� ����
			char ch = src.charAt(i);
			
			if( ch >= 'a' && ch <= 'z' ) {
				result += alphaCode[ch - 'a'];
				
			}else if( ch >= '0' && ch <= '9' ) {
				result += numCode[ch - '0'];
				
			}
			
		}//for
		
		System.out.println("��� : " + result);
		
	}//main
}












