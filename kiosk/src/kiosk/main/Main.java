package kiosk.main;

import java.util.Scanner;

import kiosk.service.AdminService;
import kiosk.service.CartService;
import kiosk.service.SandwitchService;
import kiosk.service.SideDishService;

public class Main {

	public static void main(String[] args) {
		SandwitchService sandwitch = new SandwitchService();
		SideDishService sideDish = new SideDishService();	
		CartService cart = new CartService();	
		AdminService admin = new AdminService();	
        Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("==================================");
			System.out.println("      서브웨이 무인 주문기        ");
			System.out.println("==================================");
			System.out.println("1 샌드위치 주문");
			System.out.println("2 사이드 주문 ");
			System.out.println("3 장바구니(결제)");
			System.out.println("----------------------------------");
			System.out.print("선택:");
			int m = sc.nextInt();
			sc.nextLine();

			if (m == 0) break;

			switch (m) {
			case 1: sandwitch.menu1(sc); break;
			//case 2: sideDish.menu2(sc); break;
			//case 3: cart.menu3(sc); break;
			case 99: admin.menu99(sc); break;
			}
			
		}
		   
		sc.close();
		System.out.println("프로그램 종료");
	}

	}
 



