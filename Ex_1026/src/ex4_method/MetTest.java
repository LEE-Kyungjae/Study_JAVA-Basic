package ex4_method;

public class MetTest {
	
	//��ȯ���� void�� �ƴ� �����
	//�ݵ�� ��ȯ���� Ÿ�԰� ��ġ�ϴ� ���� ��ȯ�ϴ� return�� �ʿ��ϴ�
	public int subject( int n ) {
		n += 100;
		System.out.println("n : " + n);
		
		return n;//������ ���� ������ �� ��
		
		//return�����δ� � �ڵ嵵 �ۼ��� �� ����
		//System.out.println("ddd");
	}
	
	public String myInfo(String name, int age) {
		
		//return "�� �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�"; 
		String ss = String.format("���� %s�̰�, ���̴� %d��\n", name, age);
		return ss;
	}
	
	//variable arguments
	public int varArgs( int ...a ) {
		
		if( a[0] == 1 ) {
			return 1 * 100;
		}else {
			return a[0] *= 10;
		}
		
	}
	
}





















