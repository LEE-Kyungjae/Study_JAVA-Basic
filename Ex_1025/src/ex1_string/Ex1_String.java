package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String�� �� ���� Ư¡�� ������ �ִ�.
		//1) ��ü �������� 2������(�Ͻ���, �����)
		//2) �� �� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
		
		String s1 = "abc";
		String s2 = "abc";//�Ͻ��� ��ü����
		
		String s3 = new String("abc");//����� ��ü����
		
		//==�� ��ü�� �񱳽� ���� �ƴ� �ּҸ� ���Ѵ�
		if( s1 == s3 ) {
			System.out.println("�ּҰ� �����ϴ�");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		}
		
		//StringŬ������ �� �񱳸� ���ؼ� equals()����� ���
		if( s1.equals(s3) ) {
			System.out.println("���� �����ϴ�");
		}
		
		System.out.println("-------------------------");
		
		String greet = "hi";
		greet += " hello";
		System.out.println(greet);
		
		String a1 = "abc";
		String a2 = "abc";
		a2 = "abcd";
		
		
	}//main
}






















