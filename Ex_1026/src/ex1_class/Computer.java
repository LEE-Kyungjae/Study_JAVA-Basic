package ex1_class;

public class Computer {
	//Ŭ������ �������
	//1)����(���, �Ӽ�...) 
	//2)�޼���(�Լ�)
	private String brand = "�ѻ�����";
	int ssd = 256;
	int ram = 512;
	float cpu = 2.4f;
	String graphic = "amd";
	
	//��ǻ���� ����� ������ �޼���
	//�޼���� � �۾��� �����ϱ� ���� ��ɹ����� ����
	public void getInfo() {
		System.out.println("������ : " + brand);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("gc : " + graphic );
		System.out.println("-------------------------");
	}
	
	//�޼����� ����
	//����������  ��ȯ��     �޼����( �Ķ����, ����, �Ű�����... ){ �޼����� ���࿵�� }
	//public   void   getInfo(){ }
	
	//����������
	//1)public : ���� ������Ʈ�� ��� Ÿ Ŭ�������� ������ ���
	//2)private : ���� Ŭ���������� ����� �㰡
	//3)protected : ��Ӱ����� ��ü�鿡�Ը� ����� �㰡
	//4)default : ���� ��Ű���� Ŭ�������� ������ �㰡
}

















