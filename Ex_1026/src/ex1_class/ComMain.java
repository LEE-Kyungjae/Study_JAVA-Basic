package ex1_class;

public class ComMain {
	public static void main(String[] args) {
		
		Computer p1 = new Computer();
		p1.getInfo();
		
		Computer p2 = new Computer();
		//private으로 생성된 변수는 외부에서 접근이 불가능하다
		//p2.brand = "애플";
		p2.ssd = 1024;
		p2.getInfo();

	}//main
}


















