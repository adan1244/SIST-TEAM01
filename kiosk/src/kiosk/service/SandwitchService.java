package kiosk.service;

import java.util.Scanner;

import kiosk.dao.KioskDAO;

public class SandwitchService {

	KioskDAO dao= null;
	
	// 기본생성자
	public SandwitchService() {

	}

	// dao 초기화 생성자
	public SandwitchService(KioskDAO dao) {
		this.dao=dao;
	}
	
	// 메인메뉴 주문
	public void menu1(Scanner sc) {
		while(true) {
			this.topping(sc);
			this.bread(sc);
			this.vegetable(sc);
			this.sauce(sc);
			
			}
	}
	
	// 토핑선택
	public String topping(Scanner sc) {
		String topping = null;
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("           서브웨이 무인 주문기                ");
			System.out.println("==================================");
			System.out.println(" 품목번호  품목명   가격");
			System.out.println(" 1        에그마요  5,000    ");
			System.out.println(" 2        풀드포크  4,000    ");
			System.out.println(" 3         터키      5,500    ");
			System.out.println(" 4         쉬림프    6,000    ");
			System.out.println("----------------------------------");
			System.out.println("선택 : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();

			if (sandchoice == 0) break;
		}
		return topping;
	}

	public String bread(Scanner sc) {
		String bread = "b";
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("               빵선택                          ");
			System.out.println("==================================");
			System.out.println("번호  이름");
			System.out.println("1      플랫");
			System.out.println("2     화이트");
			System.out.println("3    허니오트");
			System.out.println("4     파마산");
			System.out.println("----------------------------------");
			System.out.println("선택 : ");
			int breadchoice = sc.nextInt();
			sc.nextLine();
			if (breadchoice == 0) break;
		}
		return bread;
		
	}
	
	// 야채선택
	public String vegetable(Scanner sc) {
		String vege = "v";
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("              야채선택                         ");
			System.out.println("==================================");
			System.out.println("6 선택완료");
			System.out.println("----------------------------------");
			System.out.println("제외할 야채의 번호를 선택해주세요");
			System.out.println("선택 : ");
			int vegechoice = sc.nextInt();
			sc.nextLine();
			if (vegechoice == 0) break;
		}
		return vege;
	}
	
	// 소스선택
	public String sauce(Scanner sc) {
		String suace = "s";
		while(true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("              소스선택                         ");
			System.out.println("==================================");
			System.out.println();System.out.println();
			System.out.println("번호  이름");
			System.out.println("7 선택완료");
			System.out.println("----------------------------------");
			System.out.println("선택 : ");
			int saucechoice = sc.nextInt();
			sc.nextLine();
			if (saucechoice == 0) break;
			System.out.println();
			System.out.println("샌드위치 수량 : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();
		}
		return suace;
	}
}