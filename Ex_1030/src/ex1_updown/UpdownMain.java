package ex1_updown;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		//스캐너를 통해 키보드에서 값을 입력받으면
		//UpdownCheck클래스에서 생성된 랜덤값(1 ~ 50사이)과 비교하여
		//UP인지 DOWN인지를 출력.
		//정답을 맞힌 경우 main에서 코드를 종료하도록 처리.
		//------------------------------
		//값 : 30
		//DOWN
		//값 : 15
		//UP
		//값 : 25
		//3회 만에 정답!!
		
		Scanner sc = new Scanner(System.in);
		UpdownCheck udc = new UpdownCheck();
		
		while(true) {
			
			System.out.print("값 : ");
			int num = sc.nextInt();
			
			boolean check = udc.check(num);
			
			if( check ) {//check == true
				//break;
				return;
			}
			
		}//while
		
	}//main
}

















