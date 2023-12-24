package ex2_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("È«±æµ¿");
		p1.setAge(20);
		System.out.println( p1.getName() );
		
		Person p2 = new Person();
		p2.setAge(25);
		p2.setName("¹Ú±æµ¿");
		
		int a = p2.getAge();
		System.out.println( p1.getSchool() + "/" + p2.getName() + "/" + a);
		
		//p1.myInfo("±è±æ¼ø", 26);
		//System.out.println(p1.getName());
		//System.out.println(p1.getAge());
		
	}//main
	
	
	
	
	
	
	
	
	
	
	
	
	
}
