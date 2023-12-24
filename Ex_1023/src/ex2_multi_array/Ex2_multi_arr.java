package ex2_multi_array;

public class Ex2_multi_arr {
	public static void main(String[] args) {
		
		String[][] java = { {"¿µÈñ", "100", "90"}, 
						    {"Ã¶¼ö", "85", "92", "60"} };
		
		for( int i = 0; i < java.length; i++ ) {
			
			for( int j = 0; j < java[i].length; j++ ) {
				System.out.print( java[i][j] + " " );
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
