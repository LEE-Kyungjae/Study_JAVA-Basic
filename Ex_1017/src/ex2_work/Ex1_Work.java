package ex2_work;

public class Ex1_Work {
	public static void main(String[] args) {
		/*
		  �������� �ִ�. ��, ���, �������� Ű��� �ִµ�, 
		 �Ϸ翡 ����Ǵ� ���� ���� 5, 7, 5����.
		 
		  1)���������� �Ϸ翡 ����Ǵ� ������ �� ������ ��� 
		  -- �� ������ ������ ��� ������ �� ������ ����� ����Ÿ���� int�� �� �� 
		  2)��ü ������ �ð��� ��� ���� ������ ���
		  --��� ���갹���� ����� ������ float���� �Ұ�
		  
		  --------���----------
		  �Ϸ���귮 : 17
		 �ð��� ��ջ��귮 : 0.70833333 
		 */
		int pear= 5;//��
		int apple= 7;//���
		int orange = 5;//������
		int total = pear+apple+orange;
		//float avg \ total /24f;
		float avg = (float)total /24;
		
		System.out.println("---------���---------");
		System.out.println("�Ϸ���귮 : " + total);
		System.out.println("��ջ��귮 : " + avg);
		
	}// main
}
