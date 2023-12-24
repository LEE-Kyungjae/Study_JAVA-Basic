package ex2_setter_getter;

public class Person {
	//setter && getter
	//private으로 정의된 멤버에 값을 넣거나 가져오기 위해 사용하는 메서드
	
	private String school = "한국고등학교";
	private String name;
	private int age;
	
	public String getSchool() {
		return school;
	}
	
	public void myInfo(String name, int age) {
		//this : 현재 클래스 자신
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}













