package kiosk.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import kiosk.dao.KioskDAO;
import kiosk.domain.Item;
import kiosk.domain.Order;

public class AdminService {
	
	KioskDAO dao = null;
	String pwd = null;
	
	//기본생성자
	public AdminService() {
		
	}
	
	//dao, pwd 초기화 생성자
	public AdminService(KioskDAO dao) {
		this.dao = dao;
		this.pwd = "123456";
	}

	
	//관리자 로그인 암호 
	public String getpwd() {
		return this.pwd;
	}
	
	//99.관리자 메뉴
	public void menu99(Scanner sc) {
		while(true) {
			System.out.println("뒤로가기  = 0");
			System.out.println("==================================");
			System.out.println("             관리자 메뉴                       ");
			System.out.println("==================================");
			System.out.println("1. 메뉴 관리                                           ");
			System.out.println("2. 일일 결산                                           ");
			System.out.println("3. 월말 결산                                           ");
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 0) break;
			
			switch(choice) {
			case 1: this.itemEdit(sc); break;
			case 2: this.daily(sc); break;
			case 3: this.monthly(sc); break;
			}
		}
	}
	
	//99.관리자메뉴 - 1.메뉴 관리
	private void itemEdit(Scanner sc) {
		while(true) {
			System.out.println("뒤로가기  = 0");
			System.out.println("==================================");
			System.out.println("              메뉴 관리                        ");
			System.out.println("==================================");
			System.out.println("1. 신 메뉴 추가                                        ");
			System.out.println("2. 기존 메뉴 삭제                                     ");
			System.out.println("3. 기존 메뉴 가격 변경                               ");
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 0) break;
			
			switch(choice) {
			case 1: this.itemAdd(sc); break;
			case 2: this.itemDelete(sc); break;
			case 3: this.changeItemPrice(sc); break;
			}
		}
	}
	
	//99.관리자메뉴 - 1.메뉴 관리 - 1.신 메뉴 추가
	private void itemAdd(Scanner sc) {
		List<Item> tmp = null;
		Item item = null;
		int category = 0;
		String categoryId = "";
		String categoryName = "";
		
		System.out.println("가테고리 종류 중 하나를 선택하세요");
		System.out.println("-> 1.샌드위치, 2.빵, 3.야채, 4.소스, 5.사이드");
		System.out.print("선택 : ");
		category = sc.nextInt();
		sc.nextLine();
		
		switch(category) {
		case 1: categoryName = "샌드위치"; categoryId = "SA"; break;
		case 2: categoryName = "빵"; categoryId = "BR"; break;
		case 3: categoryName = "야채"; categoryId = "VE"; break;
		case 4: categoryName = "소스"; categoryId = "SO"; break;
		case 5: categoryName = "사이드"; categoryId = "SI"; break;
		}
		
		System.out.printf("현재 등록된 %s의 종류", categoryName);
		System.out.println();
		System.out.print("-> ");
		
		tmp = this.dao.listItem(categoryId);
		for(Item l : tmp) {
			System.out.printf("%s ",l.getName());
		}
		System.out.println();
		
		System.out.print("추가할 메뉴 이름 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		item = new Item(categoryId, name, price);
		this.dao.addItem(item);
		
		System.out.println("메뉴가 추가되었습니다.");
	}
	
	//99.관리자메뉴 - 1.메뉴 관리 - 2.기존 메뉴 삭제
	private void itemDelete(Scanner sc) {
		List<Item> tmp = null;
		int category = 0;
		String categoryId = "";
		String categoryName = "";
		
		System.out.println("가테고리 종류 중 하나를 선택하세요");
		System.out.println("-> 1.샌드위치, 2.빵, 3.야채, 4.소스, 5.사이드");
		System.out.print("선택 : ");
		category = sc.nextInt();
		sc.nextLine();
		
		switch(category) {
		case 1: categoryName = "샌드위치"; categoryId = "SA"; break;
		case 2: categoryName = "빵"; categoryId = "BR"; break;
		case 3: categoryName = "야채"; categoryId = "VE"; break;
		case 4: categoryName = "소스"; categoryId = "SO"; break;
		case 5: categoryName = "사이드"; categoryId = "SI"; break;
		}
		
		System.out.printf("현재 등록된 %s의 종류", categoryName);
		System.out.println();
		System.out.print("-> ");
		
		tmp = this.dao.listItem(categoryId);
		for(Item l : tmp) {
			System.out.printf("%s ",l.getName());
		}
		System.out.println();
		
		System.out.print("삭제할 메뉴 이름 : ");
		String name = sc.nextLine();
		
		this.dao.deleteItem(categoryId, name);
	}
	
	//99.관리자메뉴 - 1.메뉴 관리 - 3.기존 메뉴 가격 변경
	private void changeItemPrice(Scanner sc) {
		List<Item> tmp = null;
		Map<String, String> remember1 = new HashMap<String, String>();
		Map<String, String> remember2 = new HashMap<String, String>();
		int category = 0;
		String categoryId = "";
		String categoryName = "";
		int count = 0;
		
		System.out.println("가테고리 종류 중 하나를 선택하세요");
		System.out.println("-> 1.샌드위치, 2.사이드");
		System.out.print("선택 : ");
		category = sc.nextInt();
		sc.nextLine();
		
		switch(category) {
		case 1: categoryName = "샌드위치"; categoryId = "SA"; break;
		case 2: categoryName = "사이드"; categoryId = "SI"; break;
		}
		while(true) {
			System.out.printf("현재 등록된 %s의 종류", categoryName);
			System.out.println();
			System.out.println("번호 이름 가격");
			
			tmp = this.dao.listItem(categoryId);
			for(Item l : tmp) {
				System.out.printf("%2d %s %d",++count, l.getName(), l.getPrice());
				System.out.println();
				remember1.put(String.valueOf(count), l.getName());
				remember2.put(String.valueOf(count), String.valueOf(l.getPrice()));
			}
			System.out.printf("%2d 선택완료", ++count);
			System.out.println();
			
			System.out.print("메뉴 번호 : ");
			String idx = sc.nextLine();
			
			if(idx.equals(String.valueOf(count))) break;
			
			System.out.printf("기존가격 %s",remember2.get(idx));
			System.out.println();
			
			System.out.print("번경할 가격 : ");
			int changePrice = sc.nextInt();
			sc.nextLine();
			
			this.dao.changePrice(categoryId, remember1.get(idx), changePrice);
			
			System.out.println("가격이 변경되었습니다.");
			
			count = 0;
			remember1.clear();
			remember2.clear();
		}
		
		
	}
	
	//99.관리자메뉴 - 2.일일결산
	private void daily(Scanner sc) {
		while(true) {
			System.out.println("뒤로가기  = 0");
			System.out.println("==================================");
			System.out.println("              일일 결산                        ");
			System.out.println("==================================");
			System.out.println("1. 전일 결산                                           ");
			System.out.println("2. 금일 결산                                           ");
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 0) break;
			
			switch(choice) {
			case 1: this.yesterday(); break;
			case 2: this.today(); break;
			}
		}
	}
	
	//99.관리자메뉴 - 2.일일결산 - 1.전일 결산
	private void yesterday() {
		String date = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
		//Date dateY = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		List<Order> list = dao.listOrder(date);
		int count = list.size();
		
		System.out.println("----------------------------------");
		System.out.printf("%s 주문 건수 %d", date, count);
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("품목별 판매량");

		for(int i = 0; i < count; ++i) {
			System.out.printf("%s", list.get(i).listSubOrders());
			System.out.println();
		}
	}
	
	//99.관리자메뉴 - 2.일일결산 - 2.금일 결산
	private void today() {
		String date = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE); 
		List<Order> list = dao.listOrder(date);
		int count = list.size();
		
		System.out.println("----------------------------------");
		System.out.printf("%s 주문 건수 %d", date, count);
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("품목별 판매량");
		
		for(int i = 0; i < count; ++i) {
			System.out.printf("%s", list.get(i).listSubOrders());
			System.out.println();
		}
	}
	
	//99.관리자메뉴 - 3.월말결산
	private void monthly(Scanner sc) {
		List<Order> list = null;
		
		while(true) {
			System.out.println("뒤로가기  = 0");
			System.out.println("==================================");
			System.out.println("              월별 매출액                      ");
			System.out.println("==================================");
			//월별 매출액 리스트 
			System.out.println("----------------------------------");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 0) {
				break;
			}
			else {
				this.oneMonth(sc);
			}
		}
	}
	
	//99.관리자메뉴 - 3.월말결산 - 선택한 달 결산
	private void oneMonth(Scanner sc) {
		
	}
}
