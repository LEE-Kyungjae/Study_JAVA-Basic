package ex4_method;

public class MetMain {
	public static void main(String[] args) {
		
		int su = 100;
		
		MetTest mt = new MetTest();
		su = mt.subject(su);
		System.out.println("su : " + su);
		
		String str = mt.myInfo("ȫ�浿", 20);
		System.out.println(str);
		
		int a = mt.varArgs(2, 3);
		System.out.println(a);
		
	}//main
}











