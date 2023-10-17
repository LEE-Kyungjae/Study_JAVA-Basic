package ex2_work;

public class Ex1_Work {
	public static void main(String[] args) {
		/*
		  과수원이 있다. 배, 사과, 오렌지를 키우고 있는데, 
		 하루에 생산되는 양은 각각 5, 7, 5개다.
		 
		  1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력 
		  -- 각 과일의 갯수를 담는 변수와 총 갯수를 출력할 변수타입은 int로 할 것 
		  2)전체 과일의 시간당 평균 생산 갯수를 출력
		  --평균 생산갯수를 출력할 변수는 float으로 할것
		  
		  --------결과----------
		  하루생산량 : 17
		 시간당 평균생산량 : 0.70833333 
		 */
		int pear= 5;//배
		int apple= 7;//사과
		int orange = 5;//오렌지
		int total = pear+apple+orange;
		//float avg \ total /24f;
		float avg = (float)total /24;
		
		System.out.println("---------결과---------");
		System.out.println("하루생산량 : " + total);
		System.out.println("평균생산량 : " + avg);
		
	}// main
}
