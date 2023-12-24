package ex1_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		//키보드에서 값을 입력 받고, Gugudan클래스의 result()메서드로
		//값을 전달하여, 해당 단을 출력하는 코드를 작성
		//단, Scanner는 main클래스에서 생성하도록 한다
		//---------------------------
		//단 : 5
		//5 * 1 = 5
		// ...
		//5 * 9 = 45
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		Gugudan gugu = new Gugudan();
		gugu.result(dan);
		
		
	}//main
}




















