package ex1_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� �Է� �ް�, GugudanŬ������ result()�޼����
		//���� �����Ͽ�, �ش� ���� ����ϴ� �ڵ带 �ۼ�
		//��, Scanner�� mainŬ�������� �����ϵ��� �Ѵ�
		//---------------------------
		//�� : 5
		//5 * 1 = 5
		// ...
		//5 * 9 = 45
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int dan = sc.nextInt();
		
		Gugudan gugu = new Gugudan();
		gugu.result(dan);
		
		
	}//main
}




















