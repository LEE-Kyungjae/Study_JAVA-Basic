package ex1_single_array;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {
		
		//1 ~ 45������ ������ �߻����� lotto�迭�� �ߺ����� �ʰ� �����ϰ�
		//����� ����� ����
		//-------------------------
		//45 27 11 5 19 17
		
		int[] lotto = new int[6];
		
		outer : for( int i = 0; i < lotto.length; ) {
			
			lotto[i] = new Random().nextInt(6) + 1;
			
			//�ߺ����� ���ϴ� �ݺ���
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
















