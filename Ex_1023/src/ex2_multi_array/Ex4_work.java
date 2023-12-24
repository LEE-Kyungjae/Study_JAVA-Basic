package ex2_multi_array;

public class Ex4_work {
	public static void main(String[] args) {
		
		//2차원 배열 arr에 담긴 모든 값의 합과 평균을 소수점 두자리까지 출력하시오
		//-------------------
		//총합 : 96
		//평균 : 6.86
		
		int[][] arr = { {5, 1, 7},
						{8, 12, 6, 19, 2},
						{2, 11, 10, 5},
						{7, 1} };
		
		int total = 0;
		float avg = 0;
		int cnt = 0;
		
		for( int i = 0; i < arr.length; i++ ) {
			
			for( int j = 0; j < arr[i].length; j++ ) {
				
				total += arr[i][j];
				cnt++;
				
			}//inner
			
		}//outer
		
		System.out.println("total : " + total);
		avg = (float)total / cnt;
		System.out.printf("평균 : %.2f", avg);
		
	}//main
}












