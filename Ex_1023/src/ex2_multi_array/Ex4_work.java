package ex2_multi_array;

public class Ex4_work {
	public static void main(String[] args) {
		
		//2���� �迭 arr�� ��� ��� ���� �հ� ����� �Ҽ��� ���ڸ����� ����Ͻÿ�
		//-------------------
		//���� : 96
		//��� : 6.86
		
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
		System.out.printf("��� : %.2f", avg);
		
	}//main
}












