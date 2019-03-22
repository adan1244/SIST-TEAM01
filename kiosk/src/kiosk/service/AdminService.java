package kiosk.service;

import java.util.Scanner;

import kiosk.dao.*;

public class AdminService {
	
	KioskDAO dao = null;
	
	//기본생성자
	public AdminService() {
		
	}
	
	//dao 초기화 생성자
	public AdminService(KioskDAO dao) {
		this.dao = dao;
	}

	
	//관리자 로그인 암호 
	public String getpwd() {
		return "";
	}
	
	//관리자 메뉴
	public void menu99(Scanner sc) {
		
	}
	
	//서브웨이 메뉴 관리
	private void itemEdit(Scanner sc) {
		
	}
	
	//서브웨이 메뉴 관리 - 신 메뉴 추가
	private void itemAdd(Scanner sc) {
	
	}
	
	//서브웨이 메뉴 관리 - 기존 메뉴 삭제
	private void itemDelete(Scanner sc) {
		
	}
	
	//서브웨이 메뉴 관리 - 기존 메뉴 가격 변경
	private void changeItemPrice(Scanner sc) {
		
	}
	
	//서브웨이 일일결산
	private void daily() {
		
	}
	
	//서브웨이 일일결산 - 전일 결산
	private void yesterday() {
		
	}
	
	//서브웨이 일일결산 - 금일 결산
	private void today() {
		
	}
	
	//서브웨이 월말결산
	private void monthly(Scanner sc) {
		
	}
	
	//서브웨이 월말결산 - 선택한 달 결산
	private void oneMonth(Scanner sc) {
		
	}
}
