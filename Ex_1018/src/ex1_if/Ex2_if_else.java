package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {

		// if-else : �ϳ��� ������ �ΰ� ���� ������ ��� �Ǻ��ϴ� ����
//		if( ���ǽ� ){
//		������ ���϶� ����Ǵ� ����
//		}else{
//		������ ������ �� ����Ǵ� ����
//		}
//		
		int n = 48;
		String str = "";

		if (++n >= 50) {
			str = "50�̻��� ��";
		} else {
			str = "50�̸��� ��";

		}
		System.out.println(str);

		// ���� if-else�ڵ带 ���� �����ڷ� ����

		n = 48;
		String over = "50�̻��� ��";
		String less = "50�̸��� ��";
		String result = ++n >= 50 ? over : less;
		System.out.println(result);//
		System.out.println("----------");

		int age = 30;
		int limit = 30;
		String res = age >= limit ? "��Ǹ�ŭ ��̱���" : "���� ��ŵ� ��";
		System.out.println(res);
		
		if (age >= limit) {
			res = "��Ǹ�ŭ ��̱���";
		} else {
			res = "���� ��ŵ� ��";
		}
		System.out.println(res);
		
	}// main
}
