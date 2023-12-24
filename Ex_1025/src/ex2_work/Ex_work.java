package ex2_work;

import java.util.Scanner;

public class Ex_work {
	public static void main(String[] args) {
		
		//키보드에서 홀수를 입력받고 그에 해당하는 마방진을 출력
		//-------------
		//입력 : 3
		//08 01 06
		//03 05 07
		//04 09 02
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		int num = 1;//시작 수
		int y = 0; //행
		int x = 0; //열
		
		System.out.print("입력 : ");
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

















