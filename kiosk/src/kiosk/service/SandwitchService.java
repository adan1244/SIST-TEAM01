package kiosk.service;

import kiosk.domain.Item;
import kiosk.domain.SubOrder;

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
		List<Item> item = new ArrayList<Item>();
		Item temp = this.sandwitch(sc);
		if (temp == null)
			return;
		item.add(temp);

		Item tempb = this.bread(sc);
		if (tempb == null)
			return;
		item.add(tempb);

		Item tempv = this.vegetable(sc);
		if (tempv == null)
			return;
		item.add(tempv);

		Item temps = this.sauce(sc);
		if (temps == null)
			return;
		item.add(temps);
		
		System.out.println();
		System.out.print("샌드위치 수량 : ");
		int countchoice = sc.nextInt();
		sc.nextLine();
		SubOrder sub = new SubOrder(item , countchoice);
		this.dao.addToCart(sub);
	}

	// 샌드위치 선택
	public Item sandwitch(Scanner sc) {
		List<Item> item = new ArrayList<Item>();
		Item items = new Item();
		System.out.println("뒤로가기 = 0");
		System.out.println("==================================");
		System.out.println("           서브웨이 무인 주문기                ");
		System.out.println("==================================");
		System.out.println(" 품목번호  품목명   가격");
		item = this.dao.listItem("SA");
		int i;
		for (i=0; i<item.size();++i) {
			System.out.printf("%3d  %3s  %3d%n", i+1, item.get(i).getName(), item.get(i).getPrice());
		}

		System.out.printf("%3d 선택완료%n",i+1);
		System.out.println("----------------------------------");
		System.out.print("선택 : ");
		int sandchoice = sc.nextInt();
		sc.nextLine();
		if (sandchoice == 0)
			return null;
		items = item.get(sandchoice - 1);

		return items;
	}

	public Item bread(Scanner sc) {
		List<Item> item = new ArrayList<Item>();
		Item items = new Item();

		System.out.println("뒤로가기 = 0");
		System.out.println("==================================");
		System.out.println("               빵선택                          ");
		System.out.println("==================================");
		System.out.println("번호  이름");
		item = this.dao.listItem("BR");
		int i;
		for (i=0; i<item.size();++i) {
			System.out.printf("%3d  %3s  %3d%n", i+1, item.get(i).getName(), item.get(i).getPrice());
		}

		System.out.printf("%3d 선택완료%n",i+1);
		System.out.println("----------------------------------");
		System.out.print("선택 : ");
		int breadchoice = sc.nextInt();
		sc.nextLine();
		if (breadchoice == 0)
			return null;
		items = item.get(breadchoice - 1);

		return items;
	}

	// 야채선택
	public Item vegetable(Scanner sc) {
		List<Item> item = new ArrayList<Item>();
		Item items = new Item();

		System.out.println("뒤로가기 = 0");
		System.out.println("==================================");
		System.out.println("              야채선택                         ");
		System.out.println("==================================");
		item = this.dao.listItem("VE");
		int i;
		for (i=0; i<item.size();++i) {
			System.out.printf("%3d  %3s  %3d%n", i+1, item.get(i).getName(), item.get(i).getPrice());
		}

		System.out.printf("%3d 선택완료%n",i+1);
		System.out.println("----------------------------------");
		System.out.println("야채의 번호를 선택해주세요");
		System.out.print("선택 : ");
		int vegechoice = sc.nextInt();
		sc.nextLine();
		if (vegechoice == 0)
			return null;
		items = item.get(vegechoice - 1);

		return items;
	}

	// 소스선택
	public Item sauce(Scanner sc) {
		List<Item> item = new ArrayList<Item>();
		Item items = new Item();
		
		System.out.println("뒤로가기 = 0");
		System.out.println("==================================");
		System.out.println("              소스선택                         ");
		System.out.println("==================================");
		System.out.println("번호  이름");
		item = this.dao.listItem("SO");
		int i;
		for (i=0; i<item.size();++i) {
			System.out.printf("%3d  %3s  %3d%n", i+1, item.get(i).getName(), item.get(i).getPrice());
		}

		System.out.printf("%3d 선택완료%n",i+1);
		System.out.println("----------------------------------");
		System.out.print("선택 : ");

		int saucechoice = sc.nextInt();
		sc.nextLine();
		if (saucechoice == 0)
			return null;
		items = item.get(saucechoice-1);

		return items;
	}
}