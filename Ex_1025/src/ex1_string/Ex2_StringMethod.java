package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//��Ʈ�� Ŭ������ �޼����
		//�޼����? ��� �۾��� �����ϱ� ���� ��ɹ����� ����
		//���� ���Ǵ� �ڵ带 �޼���� �����θ� �ʿ��� �� ���� �����ٰ� �� �� �ִ�.
		String str = "Hong Gil Dong";
		int idx = str.length();
		System.out.println("���� str�� ���� : " + idx);
		
		idx = str.indexOf('o');
		System.out.println("�� ó�� ���� o�� ��ġ : " + idx);
		
		idx = str.lastIndexOf('o');
		System.out.println("������ o�� ��ġ : " + idx);
		
		char c = str.charAt(5);
		System.out.println("5��° ��ġ�� ���� : " + c);
		
		String a1 = " hel lo ";
		//trim() : ���� ���̳� ���� �ǹ̾��� ������ ����
		System.out.println(a1.trim().length());
		
		String a2 = "apple";
		if( a2.equals("apple") ) {
			System.out.println("equals()�� ���� ���� ���� �� �ִ�");
		}
		
		if( a2.equalsIgnoreCase("Apple") ) {
			System.out.println("equalsIgnoreCase()�� ��ҹ��� �������� ���� ������ ��");
		}
		
		//��Ʈ�� Ŭ������ �޼���� �ƴ�����, 
		//���ڿ��� �ۼ��� ���������� �ڵ带 ���� ���ڷ� �ٲ��ִ� �޼��带 ����
		String number = "100";
		int a = Integer.parseInt(number);
		System.out.println( a + 1 );
		
		String number2 = "10.1";
		float f = Float.parseFloat(number2);
		System.out.println(f + 1);
		
		//wrapperŬ������
		//int - Integer
		//char - Character
		//boolean - Boolean
		//byte - Byte
		//short - Short
		//long - Long
		//float - Float
		//double - Double
	}//main
}














