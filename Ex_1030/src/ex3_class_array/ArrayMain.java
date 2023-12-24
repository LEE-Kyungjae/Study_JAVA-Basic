package ex3_class_array;

public class ArrayMain {
	public static void main(String[] args) {
		//객체형 배열 : 객체를 배열구조로 만드는 형식
		
		ArrayTest[] arr = new ArrayTest[2];
		//객체를 배열화 하면 각 index별로 메모리 할당이 반드시 필요
		//arr[0] = new ArrayTest();
		//arr[1] = new ArrayTest();
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = new ArrayTest();
		}//for
		
		arr[0].setName("홍길동");
		//arr[0].name = "hong";
		arr[0].setGender('남');
		
		arr[1].setName("남길동");
		arr[1].setGender('여');
		
		for( int i = 0; i < arr.length; i++ ) {
			
			System.out.println(arr[i].getName() + "/" + arr[i].getGender());
			
		}//for
		
	}//main
}













