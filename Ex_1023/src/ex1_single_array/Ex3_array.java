package ex1_single_array;

public class Ex3_array {
	public static void main(String[] args) {

		//�迭 arr�� ��� ��� ���� ���� ����Ͻÿ�
		//-------------------
		//��� : 150
		
		int[] arr = {10, 20, 30, 40, 50};
		int res = 0;
		
		for( int i : arr ) {
			res += i;
		}
		
//		for( int i = 0; i < arr.length; i++ ) {
//			res += arr[i];
//		}//for
		
		System.out.println("��� : " + res);
		
	}//main
}














