package ex1_class;

public class ComMain {
	public static void main(String[] args) {
		
		Computer p1 = new Computer();
		p1.getInfo();
		
		Computer p2 = new Computer();
		//private���� ������ ������ �ܺο��� ������ �Ұ����ϴ�
		//p2.brand = "����";
		p2.ssd = 1024;
		p2.getInfo();

	}//main
}


















