package ex2_multi_array;

public class Ex3_multi_arr {
	public static void main(String[] args) {
		
		int[][] num = new int[2][];
		num[0] = new int[2];
		num[1] = new int[3];
		
		num[0][0] = 100;
		num[0][1] = 200;
		
		num[1][0] = 300;
		num[1][1] = 400;
		num[1][2] = 500;
		
		for( int i = 0; i < num.length; i++ ) {
			
			for( int j = 0; j < num[i].length; j++ ) {
				System.out.print(num[i][j] + " ");
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}















