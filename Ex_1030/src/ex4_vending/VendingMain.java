package ex4_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		
		Vending ven = new Vending();
		ven.init();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ฑÝพื : ");
		
		int money = sc.nextInt();
		
		ven.showCans(money);
		
		String name = sc.next();
		money = ven.outCan(name);
		
	}//main
}



















