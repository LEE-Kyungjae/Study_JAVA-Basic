package ex1_single_array;

import java.util.Random;
import java.util.Scanner;

public class Ex7_work {
	public static void main(String[] args) {
		
		//�ߺ����� �ʴ� ����(1 ~ 9����) �� ���� ���ϴ� ���ھ߱� ���� �����
		//��) ��ǻ�Ͱ� �߻���Ų ������ 416�̶��...
		//---------------------------
		//���ڸ� �� : 123
		//0strike 1ball
		//���ڸ� �� : 456
		//2strike 0ball
		//���ڸ� �� : 146
		//1strike 2ball
		//���ڸ� �� : 416
		//����!!
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];//��ǻ���� ����
		int[] user = new int[3];//������ ��
		
		//1 ~ 9������ �ߺ����� �ʴ� ���� �߻�
		do {
			
			for(int i = 0; i < com.length; i++) {
				com[i] = new Random().nextInt(9) + 1;
			}
			
		}while( com[0]==com[1] || com[0]==com[2] || com[1]==com[2] );
		
		while( true ) {
			System.out.print("���ڸ� �� :");
			
			int number = sc.nextInt();//������� ���� �޴´�
			
			//number�� ��,��,�����ڸ��� ��� user�迭�� ����
			user[0] = number / 100;
			user[1] = number % 100 / 10;
			user[2] = number % 100 % 10;
			
			int strike = 0;
			int ball = 0;
			
			//����� ��
			for(int i = 0; i < user.length; i++) {
				
				for( int j = 0; j < user.length; j++ ) {
					
					if( i == j ) {
						if( com[i] == user[j] )
							strike++;
						
					}else {
						if(com[i] == user[j])
							ball++;
					}
					
				}//inner
				
			}//outer
			
			//����ó��
			if( strike == 3 ) {
				System.out.println("����!!");
				break;
				
			}else {
				//��Ʈ����ũ�� ���� 1���� �ִ°��
				if( strike > 0 || ball > 0 ) {
					System.out.printf("%dstrike, %dball\n", strike, ball);
				}else {
					//�ƿ��� ���
					System.out.println("out");
				}	
			}
			
		}//while
		
	}//main
}



















