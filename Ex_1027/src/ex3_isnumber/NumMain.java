package ex3_isnumber;

import java.util.Scanner;

public class NumMain {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� �ް�, �Է¹��� ���� ��� ���ڷθ� �̷���� �ִ����� �Ǵ�
		//----------------------------
		//�Է� : 1234
		//1234�� �����Դϱ�? true
		
		//�Է� : 1aa
		//1aa�� �����Դϱ�? false
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		
		PrintNumber pn = new PrintNumber();
		result = pn.isNumber(str);
		
		System.out.println( str + "�� �����Դϱ�?" + result);
	}//main
}













