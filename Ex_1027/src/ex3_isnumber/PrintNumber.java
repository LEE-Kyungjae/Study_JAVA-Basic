package ex3_isnumber;

public class PrintNumber {
	
	public boolean isNumber(String str){
		
		//str : 12a
		for( int i = 0; i < str.length(); i++ ) {
			
			char ch = str.charAt(i);
			if( ch < '0' || ch > '9' ) {
				//���ڿ����� �ش��ϴ� ���� �ƴ϶��...
				return false;
			}
			
		}//for
		
		return true;
		
	}
	
}







