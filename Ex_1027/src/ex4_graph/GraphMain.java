package ex4_graph;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		
		//0 ~ 9사이의 난수를 100개 만든다
		//발생한 100개의 난수에서 각각의 숫자 갯수를 그래프화 한다
		//------------------------
		//난수 : 27834102938460001298431294.......
		//0의 갯수 : ############ 12
		//1의 갯수 : ######### 9
		//    .....
		//9의 갯수 : ####### 7
		int[] nArr = new int[10];
		
		for( int i = 0; i < 100; i++ ) {
			int r = new Random().nextInt(10);
			System.out.print(r);
			nArr[r]++;
		}
		
		System.out.println();
		
		//nArr에 담긴 값을 가지고 그래프를 그리는 클래스
		PrintGraph pg = new PrintGraph();
		pg.print( nArr );
		
	}//main
}












