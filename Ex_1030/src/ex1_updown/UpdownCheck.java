package ex1_updown;

import java.util.Random;

public class UpdownCheck {
	//난수 발생 및 정답판별
	private int random = new Random().nextInt(51);
	private int count = 0;
	private boolean result = false;
	
	public boolean check( int n ) {
		count++;
		
		if( n < random ) {
			System.out.println("UP");
		}else if( n > random ) {
			System.out.println("DOWN");
		}else {
			System.out.println(count + "회 만에 정답!");
			result = true;
		}
		
		return result;
		
	}//check()
	
}













