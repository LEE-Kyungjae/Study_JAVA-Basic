package ex4_graph;

public class PrintGraph {
	public void print(int[] arr) {
		
		for( int i = 0; i < arr.length; i++ ) {
			
			System.out.print(i + "°¹¼ö : ");
			for( int j = 0; j < arr[i]; j++ ) {
				System.out.print("#");
			}//inner
			
			System.out.println(" " + arr[i]);
			
		}//outer
		
	}//print
}
