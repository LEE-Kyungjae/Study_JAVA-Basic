package ex2_value_type;

public class Ex1_valueType {
 public static void main(String[] args) {
	 /*
	  기본자료형(valueType)
	  논리형 :	boolean - 1bit
	  문자형 : 	char  - 2byte
	  정수형 : 	byte  - 1byte	........... -128 	~ 127
		 	short - 2byte	...........	-32768 	~ 32767
		  	int   - 4byte	........... -21억 	~ 21억
		  	long  - 8byte	........... -900경 	~ 900경
	 실수형 : 	float - 4byte
	  		double- 8byte
	  
	  */
	 
	 //변수 : 특정값을 저장하여 기억하는 공간
	 //자료형 변수명; --> 선언
	 //변수명 = 값; --> 대입
	 //자료형 변수명 = 값; --> 초기화(선언과 대입을 한번에!)
	 
	 //변수선언의 규칙
	 //한글로 이름을 짓지 않는다
	 //_를 제외하고 특수문자를 사용할 수 없다
	 //숫자로 시작할 수 없다
	 //변수의 첫글자는 반드시 소문자로 작성
	 
	 //논리형 : true, false 의 두가지 값중 한가지만 저장 가능한 자료형
	 boolean b1;
	 b1 = true;
	 System.out.println("b1 : " + b1);
	 b1 = false;
	 System.out.println("b1 : " + b1);
	 System.out.println("--------------------");
	 //문자형 : 홑따옴표 안에 딱 한글자만 저장 가능한 자료형
	 char c1 = 'A';
	 System.out.println("c1 : " + c1);
	 c1 = 65 + 1;
	 System.out.println("c1 : " + c1);
	 System.out.println("--------------------");
	 //정수형 : 자연수를 담는 자료형
	 //byte by1 = 128; <--표현범위를 벗어나는 값을 담을 수 없다
	 int n =2100000000;
	 long n2 = 2200000000l;
	 System.out.println("n : " + n);
	 System.out.println("n2 : " + n2);
	 System.out.println("--------------------");
	 
	 //실수형 : 소수점을 가진 값을 저장하기 위한 자료형
	 float f1 = 3.14F;
	 double f2 = 3.14; 
	 f1 = 100;
	 f2 = 100;
	 System.out.println("f1 : " + f1);
 	}//main
}










