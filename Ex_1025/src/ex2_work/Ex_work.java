package ex2_work;

import java.util.Scanner;

public class Ex_work {
	public static void main(String[] args) {
		
		//Ű���忡�� Ȧ���� �Է¹ް� �׿� �ش��ϴ� �������� ���
		//-------------
		//�Է� : 3
		//08 01 06
		//03 05 07
		//04 09 02
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int num = 1;//���� ��
		int y = 0; //��
		int x = 0; //��
		
		System.out.print("�Է� : ");
		int size = sc.nextInt();
		
		arr = new int[size][size];
		
		x = size / 2;
		
		while( num <= size * size ) {
			
			arr[y][x] = num;
			
			if( num % size == 0 ) {
				y++;
			}else {
				y--;
				x++;
			}
			
			if(y < 0) {
				y = size - 1;
			}
			
			if( x == size ) {
				x = 0;
			}
			
			num++;
		}//while
		
		for( int i = 0; i < size; i++ ) {
			
			for(int j = 0; j < size; j++) {
				
				System.out.printf("%02d ", arr[i][j]);
				
			}//inner
			
			System.out.println();
		}//outer
	}//main
}

















