package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
//		�������� : �񱳿����ڸ� ���� ������ �� �� �̻� �ʿ��Ҷ� ���
		int age = 22;
		int limit = 25;
//		&&(and)������ : ������ ������ false �� ��� ���� ������ �������� �ʴ´� 
//		true && true ---> true
//		true && false ---> false
//		false && true ---> false
//		false && false ---> false

		boolean result = limit - age >= 5 && (age += 3) > 20;
		System.out.println(age);
		System.out.println("&& : " + result);

		int n1 = 10;
		int n2 = 20;
//		||(or)������ : ���� ������ true �� ��� ���� ������ �������� �ʴ´�
//		true || true ---> true
//		true || false ---> true
//		false || true ---> true
//		false || false ---> false
		result = (n1 += 10) > 20 || (n2 += 1) - 10 == 11;
		System.out.println(n2);
		System.out.println("|| : " + result);
		
		//!(not)������ : true �� false��, false�� true�� ����
		System.out.println("! : " + !result);
		System.out.println(result);
		System.out.println("----------");
		
		// ����������
//		1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
//		���������� ���������� �������� ������ �� �˾ƾ� �Ѵ�
		int a = 10;
		System.out.println("a : " + ++a);
		int b = 10;
		System.out.println("b :" + b++);
		System.out.println(b);
		
		b++;
		++b;
		--b;
		++b;
		b--;
		b--;
		++b;
		b++;
		System.out.println("bb : " + ++b);

		//����(����)������
		//�ϳ��� ���ǽ��� ���� ���ǽ��� ���ϋ��� �����϶��� ���� �ٸ� ����� ��ȯ�ϴ� ������
		int i1 = 10;
		int i2 = 15;
		int res = ++i1 >= i2 ? 100 : 200;
		System.out.println(res);
		int i3 = 11;
		int i4 = 12;
		char res2 = (i3 += i3) == (i4 += 10) ? 'O' : 'X';
		System.out.println(res2);
	}// main
}






























