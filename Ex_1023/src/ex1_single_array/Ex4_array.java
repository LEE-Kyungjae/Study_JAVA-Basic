package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		
		//배열 arr에 담긴 값 중 가장 큰 값을 출력
		//-----------------
		//가장 큰 값 : 19
		
		int[] arr = {4, 13, 7, 19, 1, 15};
		
		int max = arr[0];
		
		for( int i = 1; i < arr.length; i++ ) {
			
			if( arr[i] > max ) {
				max = arr[i];
			}
			
		}//for
		
		System.out.println("가장 큰 값 : " + max);
		
		System.out.println("---------------------------");
		
		//arr배열의 값들을 오름차순으로 정렬
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











