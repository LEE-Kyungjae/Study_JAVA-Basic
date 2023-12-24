package ex3_isnumber;

public class PrintNumber {
	
	public boolean isNumber(String str){
		
		//str : 12a
		for( int i = 0; i < str.length(); i++ ) {
			
			char ch = str.charAt(i);
			if( ch < '0' || ch > '9' ) {
				//숫자영역에 해당하는 값이 아니라면...
				return false;
			}
			
		}//for
		
		return true;
		
	}
	
}







