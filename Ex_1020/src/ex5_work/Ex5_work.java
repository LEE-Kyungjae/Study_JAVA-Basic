package ex5_work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		//Ű���忡�� ������ �Է¹ް� �� ���� �Ҽ����� �ƴ����� �Ǵ��Ͻÿ�
		//�Ҽ� : 1�� �ڱ� �ڽ����θ� �������� ��(1�� �Ҽ��� �ƴ�)
		//------------------
		//�� : 5
		//5��(��) �Ҽ��Դϴ�
		
		//�� : 6
		//6��(��) �Ҽ��� �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int n = sc.nextInt();
		
		int i = 2;
		
		for( ; i <= n; i++) {
			
			if( n % i == 0 ) {
				break;
			}
			
		}//for
		
		if(n == i) {
			System.out.println(n + "��(��) �Ҽ�");
		}else {
			System.out.println(n + "��(��) �ȼҼ�");
		}
		
		
	}//main
}





















