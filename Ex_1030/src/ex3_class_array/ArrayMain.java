package ex3_class_array;

public class ArrayMain {
	public static void main(String[] args) {
		//��ü�� �迭 : ��ü�� �迭������ ����� ����
		
		ArrayTest[] arr = new ArrayTest[2];
		//��ü�� �迭ȭ �ϸ� �� index���� �޸� �Ҵ��� �ݵ�� �ʿ�
		//arr[0] = new ArrayTest();
		//arr[1] = new ArrayTest();
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = new ArrayTest();
		}//for
		
		arr[0].setName("ȫ�浿");
		//arr[0].name = "hong";
		arr[0].setGender('��');
		
		arr[1].setName("���浿");
		arr[1].setGender('��');
		
		for( int i = 0; i < arr.length; i++ ) {
			
			System.out.println(arr[i].getName() + "/" + arr[i].getGender());
			
		}//for
		
	}//main
}













