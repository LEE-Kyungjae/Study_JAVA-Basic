package ex2_multi_array;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {

		//학생들의 이름, 수학, 영어성적을 입력받고, 출력하는 프로그램을 만드시오
		//-----------------------
		//등록할 인원 수 : 2
		//이름 : hong
		//수학 : 90
		//영어 : 87
		//---------------
		//이름 : kim
		//수학 : 70
		//영어 : 100
		//---------------
		//2명 등록 완료!!
		//hong 	90	87
		//kim	70	100

		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int n = sc.nextInt();
		
		String[] info = {"이름 : ", "수학 : ", "영어 : ", "국어 : "};
		String[][] str = new String[n][info.length];
		
		for( int i = 0; i < str.length; i++ ) {
			
			for( int j = 0; j < str[i].length; j++ ) {
				
				System.out.print(info[j]);
				str[i][j] = sc.next();
				
			}//inner
			
			System.out.println("----------------");
			
		}//outer
		
//		for( int i = 0; i < n; i++ ) {
//			
//			System.out.print("이름 : ");
//			str[i][0] = sc.next();
//			
//			System.out.print("수학 : ");
//			str[i][1] = sc.next();
//			
//			System.out.print("영어 : ");
//			str[i][2] = sc.next();
//			
//			System.out.println("----------------");
//		}//for
		
		System.out.println(n + "명 등록 완료!!");
		
		for( int i = 0; i < str.length; i++ ) {
			
			for( int j = 0; j < str[i].length; j++ ) {
				System.out.print( str[i][j] + " " );
			}//inner
			
			System.out.println();
			
		}//outer
		
		
	}//main
}





















