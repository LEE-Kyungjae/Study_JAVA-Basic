package ex4_vending;

public class Vending {

	private Can[] can = new Can[5];
	private int money = 0;
	
	public void init() {
		for( int i = 0; i < can.length; i++ ) {
			can[i] = new Can();
		}
		
		can[0].setCanName("coke");
		can[0].setPrice(1000);
		
		can[1].setCanName("sider");
		can[1].setPrice(1100);
		
		can[2].setCanName("orange");
		can[2].setPrice(1200);
		
		can[3].setCanName("banana");
		can[3].setPrice(1400);
		
		can[4].setCanName("hotsix");
		can[4].setPrice(1500);
		
	}//init();
	
	//돈을 받으면 먹을 수 있는 음료의 목록을 출력
	public void showCans( int money ) {
		this.money = money;
		
		for( int i = 0; i < can.length; i++ ) {
			
			if( can[i].getPrice() <= money ) {
				System.out.printf(
						"%s-%d원\n", can[i].getCanName(), can[i].getPrice());
			}
			
		}//for
		
		System.out.print(">> ");
		
	}
	
	//선택한 음료를 제공하고 잔돈을 돌려주는 메서드
	public int outCan(String name) {
		
		for( int i = 0; i < can.length; i++ ) {
			
			if( can[i].getCanName().equalsIgnoreCase(name) ) {
				System.out.println(can[i].getCanName() + " 선택함");
				System.out.println("잔액 : " + (money -= can[i].getPrice()));
			}
			
		}//for
		
		return money;
		
	}
	
}













