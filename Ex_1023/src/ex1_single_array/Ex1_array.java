package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//���� Ÿ���� �ڿ����� ���ϰ� ����,�����ϱ� ���� �迭�� ���
		//1) �迭����
		int[] ar;
		
		//2) �迭����
		//�� �� ������ �迭�� index���� ������ �ʴ´�
		ar = new int[3];
		
		//3) �迭 �ʱ�ȭ
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		//�������� �ʴ� index�� ���� �ְų� ����ϴ°��� �Ұ���
		//ar[3] = 400;
		
		//System.out.println(ar[0]);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println( ar[i] );
		}//for
		
	}//main
}












































