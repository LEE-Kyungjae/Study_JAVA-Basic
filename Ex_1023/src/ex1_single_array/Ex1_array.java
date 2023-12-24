package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//같은 타입의 자원들을 편하게 관리,제어하기 위해 배열을 사용
		//1) 배열선언
		int[] ar;
		
		//2) 배열생성
		//한 번 생성된 배열의 index수는 변하지 않는다
		ar = new int[3];
		
		//3) 배열 초기화
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		//존재하지 않는 index에 값을 넣거나 출력하는것은 불가능
		//ar[3] = 400;
		
		//System.out.println(ar[0]);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println( ar[i] );
		}//for
		
	}//main
}












































