package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//배우 검색 : song
		//[song]
		//박쥐
		//기생충
		//관상
		
		//배우 검색 : aa
		//해당 배우의 정보가 없습니다
		
		String[][] actor = {{"[song]", "박쥐", "기생충", "관상"}, 
					        {"[lee]", "백두산", "광해", "레드"}, 
					        {"[ma]", "범죄도시", "이웃사람들", "성난황소"}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배우 검색 : ");
		String name = sc.next();
		
		int cnt = 0;
		
		for( int i = 0; i < actor.length; i++ ) {
			
			if( actor[i][0].equals("["+name+"]") ) {
				//이름이 일치하는 배우가 있는 경우
				for( int j = 0; j < actor[i].length; j++ ) {
					System.out.println( actor[i][j] );
				}//inner
				
			}else {
				//이름이 일치하는 배우가 없는 경우
				cnt++;
				if( cnt == actor.length ) {
					System.out.println("배우의 정보가 없어요");
				}
			}
			
		}//outer
		
	}//main
}



















