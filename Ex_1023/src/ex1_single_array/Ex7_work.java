package ex1_single_array;

import java.util.Random;
import java.util.Scanner;

public class Ex7_work {
	public static void main(String[] args) {
		
		//중복되지 않는 난수(1 ~ 9사이) 세 개를 비교하는 숫자야구 게임 만들기
		//예) 컴퓨터가 발생시킨 난수가 416이라면...
		//---------------------------
		//세자리 수 : 123
		//0strike 1ball
		//세자리 수 : 456
		//2strike 0ball
		//세자리 수 : 146
		//1strike 2ball
		//세자리 수 : 416
		//정답!!
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];//컴퓨터의 난수
		int[] user = new int[3];//유저의 수
		
		//1 ~ 9사이의 중복되지 않는 난수 발생
		do {
			
			for(int i = 0; i < com.length; i++) {
				com[i] = new Random().nextInt(9) + 1;
			}
			
		}while( com[0]==com[1] || com[0]==com[2] || com[1]==com[2] );
		
		while( true ) {
			System.out.print("세자리 수 :");
			
			int number = sc.nextInt();//사용자의 값을 받는다
			
			//number를 백,십,일의자리로 끊어서 user배열에 저장
			user[0] = number / 100;
			user[1] = number % 100 / 10;
			user[2] = number % 100 % 10;
			
			int strike = 0;
			int ball = 0;
			
			//경우의 수
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
			
			//정답처리
			if( strike == 3 ) {
				System.out.println("정답!!");
				break;
				
			}else {
				//스트라이크나 볼이 1개라도 있는경우
				if( strike > 0 || ball > 0 ) {
					System.out.printf("%dstrike, %dball\n", strike, ball);
				}else {
					//아웃인 경우
					System.out.println("out");
				}	
			}
			
		}//while
		
	}//main
}



















