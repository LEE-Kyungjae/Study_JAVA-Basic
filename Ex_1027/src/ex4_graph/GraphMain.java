package ex4_graph;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		
		//0 ~ 9������ ������ 100�� �����
		//�߻��� 100���� �������� ������ ���� ������ �׷���ȭ �Ѵ�
		//------------------------
		//���� : 27834102938460001298431294.......
		//0�� ���� : ############ 12
		//1�� ���� : ######### 9
		//    .....
		//9�� ���� : ####### 7
		int[] nArr = new int[10];
		
		for( int i = 0; i < 100; i++ ) {
			int r = new Random().nextInt(10);
			System.out.print(r);
			nArr[r]++;
		}
		
		System.out.println();
		
		//nArr�� ��� ���� ������ �׷����� �׸��� Ŭ����
		PrintGraph pg = new PrintGraph();
		pg.print( nArr );
		
	}//main
}












