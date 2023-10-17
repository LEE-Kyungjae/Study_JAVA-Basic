package ex2_value_type;

public class Ex1_valueType {
 public static void main(String[] args) {
	 /*
	  �⺻�ڷ���(valueType)
	  ���� :	boolean - 1bit
	  ������ : 	char  - 2byte
	  ������ : 	byte  - 1byte	........... -128 	~ 127
		 	short - 2byte	...........	-32768 	~ 32767
		  	int   - 4byte	........... -21�� 	~ 21��
		  	long  - 8byte	........... -900�� 	~ 900��
	 �Ǽ��� : 	float - 4byte
	  		double- 8byte
	  
	  */
	 
	 //���� : Ư������ �����Ͽ� ����ϴ� ����
	 //�ڷ��� ������; --> ����
	 //������ = ��; --> ����
	 //�ڷ��� ������ = ��; --> �ʱ�ȭ(����� ������ �ѹ���!)
	 
	 //���������� ��Ģ
	 //�ѱ۷� �̸��� ���� �ʴ´�
	 //_�� �����ϰ� Ư�����ڸ� ����� �� ����
	 //���ڷ� ������ �� ����
	 //������ ù���ڴ� �ݵ�� �ҹ��ڷ� �ۼ�
	 
	 //���� : true, false �� �ΰ��� ���� �Ѱ����� ���� ������ �ڷ���
	 boolean b1;
	 b1 = true;
	 System.out.println("b1 : " + b1);
	 b1 = false;
	 System.out.println("b1 : " + b1);
	 System.out.println("--------------------");
	 //������ : Ȭ����ǥ �ȿ� �� �ѱ��ڸ� ���� ������ �ڷ���
	 char c1 = 'A';
	 System.out.println("c1 : " + c1);
	 c1 = 65 + 1;
	 System.out.println("c1 : " + c1);
	 System.out.println("--------------------");
	 //������ : �ڿ����� ��� �ڷ���
	 //byte by1 = 128; <--ǥ�������� ����� ���� ���� �� ����
	 int n =2100000000;
	 long n2 = 2200000000l;
	 System.out.println("n : " + n);
	 System.out.println("n2 : " + n2);
	 System.out.println("--------------------");
	 
	 //�Ǽ��� : �Ҽ����� ���� ���� �����ϱ� ���� �ڷ���
	 float f1 = 3.14F;
	 double f2 = 3.14; 
	 f1 = 100;
	 f2 = 100;
	 System.out.println("f1 : " + f1);
 	}//main
}










