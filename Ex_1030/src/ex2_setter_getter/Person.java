package ex2_setter_getter;

public class Person {
	//setter && getter
	//private���� ���ǵ� ����� ���� �ְų� �������� ���� ����ϴ� �޼���
	
	private String school = "�ѱ�����б�";
	private String name;
	private int age;
	
	public String getSchool() {
		return school;
	}
	
	public void myInfo(String name, int age) {
		//this : ���� Ŭ���� �ڽ�
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













