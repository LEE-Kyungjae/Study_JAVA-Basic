package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue�� : �ݺ��� ������ Ư�� ������� �ǳʶٰ��� �� ��
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5; ) {
				
				j++;
				if( j % 2 == 0 ) {
					//for�� �ȿ����� continue�� 
					//���� ����� for���� ���������� �ǳʶڴ�
					
					//���� for���� �������� ���ٸ�
					//���ǽ����� �ǳʶڴ�
					continue;
					//System.out.println();
				}
				
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}






























