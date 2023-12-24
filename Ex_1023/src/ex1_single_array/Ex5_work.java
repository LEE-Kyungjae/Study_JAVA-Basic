package ex1_single_array;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {
		
		//1 ~ 45사이의 난수를 발생시켜 lotto배열에 중복되지 않게 저장하고
		//결과를 출력해 보자
		//-------------------------
		//45 27 11 5 19 17
		
		int[] lotto = new int[6];
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = new Random().nextInt(6) + 1;
			
			//중복값을 비교하는 반복문
			for( int j = 0; j < i; j++ ) {
				if( lotto[i] == lotto[j] ) {
					continue outer;
				}
			}//inner
			
			System.out.print( lotto[i] + " " );
			i++;
			
		}//outer
		
	}//main
}
















