package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
//		논리연산자 : 비교연산자를 통한 연산이 두 개 이상 필요할때 사용
		int age = 22;
		int limit = 25;
//		&&(and)연산자 : 앞쪽의 연산이 false 일 경우 뒤쪽 연산을 수행하지 않는다 
//		true && true ---> true
//		true && false ---> false
//		false && true ---> false
//		false && false ---> false

		boolean result = limit - age >= 5 && (age += 3) > 20;
		System.out.println(age);
		System.out.println("&& : " + result);

		int n1 = 10;
		int n2 = 20;
//		||(or)연산자 : 앞쪽 연산이 true 일 경우 뒤쪽 연산을 수행하지 않는다
//		true || true ---> true
//		true || false ---> true
//		false || true ---> true
//		false || false ---> false
		result = (n1 += 10) > 20 || (n2 += 1) - 10 == 11;
		System.out.println(n2);
		System.out.println("|| : " + result);
		
		//!(not)연산자 : true 를 false로, false를 true로 변경
		System.out.println("! : " + !result);
		System.out.println(result);
		System.out.println("----------");
		
		// 증감연산자
//		1씩 증가시키거나 1씩 감소시키는 연산자
//		선행증감과 후행증감의 차이점을 구별할 줄 알아야 한다
		int a = 10;
		System.out.println("a : " + ++a);
		int b = 10;
		System.out.println("b :" + b++);
		System.out.println(b);
		
		b++;
		++b;
		--b;
		++b;
		b--;
		b--;
		++b;
		b++;
		System.out.println("bb : " + ++b);

		//삼항(조건)연산자
		//하나의 조건식을 통해 조건식이 참일떄와 거짓일때에 따라 다른 결과를 반환하는 연산자
		int i1 = 10;
		int i2 = 15;
		int res = ++i1 >= i2 ? 100 : 200;
		System.out.println(res);
		int i3 = 11;
		int i4 = 12;
		char res2 = (i3 += i3) == (i4 += 10) ? 'O' : 'X';
		System.out.println(res2);
	}// main
}






























