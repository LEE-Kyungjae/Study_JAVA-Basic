package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		
		//�迭 arr�� ��� �� �� ���� ū ���� ���
		//-----------------
		//���� ū �� : 19
		
		int[] arr = {4, 13, 7, 19, 1, 15};
		
		int max = arr[0];
		
		for( int i = 1; i < arr.length; i++ ) {
			
			if( arr[i] > max ) {
				max = arr[i];
			}
			
		}//for
		
		System.out.println("���� ū �� : " + max);
		
		System.out.println("---------------------------");
		
		//arr�迭�� ������ ������������ ����
		//1 4 7 13 15 19
		
		for( int i = 0; i < arr.length; i++ ) {
			
			for( int j = i; j < arr.length; j++ ) {
				
				if( arr[j] < arr[i] ) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}//inner
			
		}//outer
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}//main
}











