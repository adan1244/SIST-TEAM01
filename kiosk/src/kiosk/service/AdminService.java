package kiosk.service;

import java.util.List;
import java.util.Scanner;

import kiosk.dao.KioskDAO;
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
	
	}
	
	//99.관리자메뉴 - 1.메뉴 관리 - 2.기존 메뉴 삭제
	private void itemDelete(Scanner sc) {
		
	}
	
	//99.관리자메뉴 - 1.메뉴 관리 - 3.기존 메뉴 가격 변경
	private void changeItemPrice(Scanner sc) {
		
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
		
	}
	
	//99.관리자메뉴 - 2.일일결산 - 2.금일 결산
	private void today() {
		
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
