package ex4_method;

public class MetTest {
	
	//반환형이 void가 아닌 경우라면
	//반드시 반환형의 타입과 일치하는 값을 반환하는 return이 필요하다
	public int subject( int n ) {
		n += 100;
		System.out.println("n : " + n);
		
		return n;//리턴할 값은 무조건 한 개
		
		//return밑으로는 어떤 코드도 작성될 수 없다
		//System.out.println("ddd");
	}
	
	public String myInfo(String name, int age) {
		
		//return "제 이름은 " + name + "이고, 나이는 " + age + "입니다"; 
		String ss = String.format("나는 %s이고, 나이는 %d다\n", name, age);
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





















