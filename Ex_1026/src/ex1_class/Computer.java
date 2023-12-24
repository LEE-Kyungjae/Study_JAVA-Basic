package ex1_class;

public class Computer {
	//클래스의 구성요소
	//1)변수(멤버, 속성...) 
	//2)메서드(함수)
	private String brand = "한샘전자";
	int ssd = 256;
	int ram = 512;
	float cpu = 2.4f;
	String graphic = "amd";
	
	//컴퓨터의 사양을 보여줄 메서드
	//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
	public void getInfo() {
		System.out.println("제조사 : " + brand);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("gc : " + graphic );
		System.out.println("-------------------------");
	}
	
	//메서드의 구성
	//접근제한자  반환형     메서드명( 파라미터, 인자, 매개변수... ){ 메서드의 실행영역 }
	//public   void   getInfo(){ }
	
	//접근제한자
	//1)public : 같은 프로젝트의 모든 타 클래스에게 접근을 허용
	//2)private : 현재 클래스에서만 사용을 허가
	//3)protected : 상속관계의 객체들에게만 사용을 허가
	//4)default : 같은 패키지의 클래스에게 접근을 허가
}

















