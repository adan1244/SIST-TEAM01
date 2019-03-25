package kiosk.service;

import kiosk.domain.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kiosk.dao.KioskDAO;

public class SandwitchService {

	KioskDAO dao = null;

	// 기본생성자
	public SandwitchService() {

	}

	// dao 초기화 생성자
	public SandwitchService(KioskDAO dao) {
		this.dao = dao;
	}

	// 메인메뉴 주문
	public void menu1(Scanner sc) {
		List<Item> list = new ArrayList<Item>(); 
		this.sandwitch(sc);
		
	}

	// 샌드위치 선택
	public Item sandwitch(Scanner sc) {
		List<Item> item= new ArrayList<Item>();
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("           서브웨이 무인 주문기                ");
			System.out.println("==================================");
			System.out.println(" 품목번호  품목명   가격");
			item = this.dao.listItem("sandwitch");
			int number = 1;
			for (Item i : item) {
				if (i != null) {
					System.out.printf("%3d  %3s   %3s%n", number, i.getName(), i.getPrice());
					++number;
				}
			}
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();

			if (sandchoice == 0) 
				break;
				this.bread(sc);

		}
		
		
		return null;

	}

	public Item bread(Scanner sc) {
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("               빵선택                          ");
			System.out.println("==================================");
			System.out.println("번호  이름");
			List<Item> item = this.dao.listItem("bread");
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int breadchoice = sc.nextInt();
			sc.nextLine();
			if (breadchoice == 0)
				break;
		}

		return null;
	}

	// 야채선택
	public Item vegetable(Scanner sc) {
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("              야채선택                         ");
			System.out.println("==================================");
			List<Item> item = this.dao.listItem("vegetable");
			System.out.println("6 선택완료");
			System.out.println("----------------------------------");
			System.out.println("제외할 야채의 번호를 선택해주세요");
			System.out.print("선택 : ");
			int vegechoice = sc.nextInt();
			sc.nextLine();
			if (vegechoice == 0 || vegechoice == 6)
				break;

		}
		return null;
	}

	// 소스선택
	public Item sauce(Scanner sc) {
		while (true) {
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("              소스선택                         ");
			System.out.println("==================================");
			System.out.println("번호  이름");
			List<Item> item = this.dao.listItem("sauce");
			System.out.println("7 선택완료");
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int saucechoice = sc.nextInt();
			sc.nextLine();
			if (saucechoice == 0 || saucechoice == 7)
				break;
			System.out.println();
			System.out.println("샌드위치 수량 : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();
		}
		return null;
	}
}