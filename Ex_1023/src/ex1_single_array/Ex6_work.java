package ex1_single_array;

import java.util.Random;

public class Ex6_work {
	public static void main(String[] args) {
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�
		//(��, 3450, 2100�� ���� 1���ڸ� ���ڴ� �ݵ�� 0�� �Ǿ�� �Ѵ�)
		//�߻��� ���� money�� �������� �ٲٸ� ������ ������ �� �� �� �ʿ������� ���
		//������ �� ���� ���� �������� ����� ��.
		//--------------------------------
		//�ݾ� : 2590
		//500�� : 5
		//50�� : 1
		//10�� : 4
		
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		
		System.out.println("�ݾ� : " + money);
		
		for( int i = 0; i < coin.length; i++ ) {
			
			int res = money / coin[i];
			
			if( res > 0 ) {
				System.out.printf( "%d�� : %d��\n", coin[i], res );
				money %= coin[i];
			}
			
		}//for		
		
	}//main
}


















