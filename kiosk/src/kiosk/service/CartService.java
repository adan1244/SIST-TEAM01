package kiosk.service;

import java.util.Scanner;

import kiosk.dao.KioskDAO;
import kiosk.domain.Membership;
import kiosk.domain.Order;

public class CartService {
	private KioskDAO dao = new KioskDAO();
	private Order order = new Order();
	private Membership membership = new Membership();
	
	//장바구니(결제) 메뉴
	public void menu03(Scanner sc) {
		while(true) {
			System.out.println();
			System.out.println("뒤로가기 = 0");
			System.out.println("==================================");
			System.out.println("          장바구니 (결제)"         );
			System.out.println("==================================");
			//dao.listOrder();
			System.out.println("----------------------------------");
			//가격출력 (총금액)
			System.out.println("----------------------------------");
			System.out.println("1. 결제하기");
			System.out.println("2. 삭제하기");
			System.out.print("선택 : ");
			int input = sc.nextInt();
			sc.nextLine();
			
			if(input == 0) {
				break;
			} else if(input == 1) {
				System.out.println();
				System.out.println("뒤로가기 = 0");
				System.out.println("==================================");
				System.out.println("          결제 방법 선택          ");
				System.out.println("==================================");
				System.out.println("1. 일반 카드 결제");
				System.out.println("2. 포인트 적립 + 결제");
				System.out.println("3. 포인트 사용 결제");
				System.out.println("----------------------------------");
				System.out.print("선택 : ");
				int payInput = sc.nextInt();
				sc.nextLine();
				
				if(payInput == 0) {
					break;
				}else if(payInput == 1) {
					this.pay1(sc);
				}else if(payInput == 2) {
					this.pay2(sc);
				}else if(payInput == 3) {
					this.pay3(sc);
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			} else if(input == 2) {
				System.out.println("삭제할 메뉴의 번호를 입력하세요.");
				System.out.print("선택 : ");
				int orderId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("삭제할 수량을 입력하세요.");
				System.out.print("선택 : ");
				int orderNum = sc.nextInt();
				sc.nextLine();
				
				System.out.println("정말 삭제하시겠습니까? (YES : 1 / NO : 0)");
				System.out.print("선택 : ");
				int input2 = sc.nextInt();
				sc.nextLine();
				
				if(input2 == 1) {
					//dao.deleteFromCart();
					System.out.println("선택한 메뉴가 장바구니에서 삭제되었습니다.");
				}else if(input2 == 0){
					System.out.println("취소되었습니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	
	//일반 카드 결제
	public void pay1(Scanner sc) {
		while(true) {
			System.out.print("카드번호 : ");
			String cardNum = sc.nextLine();
			
			if(cardNum.length() != 19) {
				System.out.println("유효하지 않은 카드 번호입니다.");
			}else {
				//System.out.printf("총 %d원 결제되었습니다. %n", 총금액);
				int point = 0;
				this.bill(point);
				break;
			}
		}
	}
	
	//포인트 적립 결제 
	public void pay2(Scanner sc) {
		while(true) {
			System.out.print("카드   번호 : ");
			String cardNum = sc.nextLine();
			
			if(cardNum.length() != 19) {
				System.out.println("유효하지 않은 카드 번호입니다.");
			}else {
				while(true) {
					System.out.print("핸드폰 번호 : ");
					String phoneNum = sc.nextLine();
					
					if(phoneNum.length() != 13) {
						System.out.println("유효하지 않은 핸드폰 번호입니다.");
					}else {
						//System.out.printf("총 %d원 결제되었습니다. %n", 총금액);
						//int point = 총금액 * 0.1 + membership.getPoint();
						int point = 0;
						System.out.printf("%d 포인트 적립", point);
						
						membership.setPoint(point);
						this.bill(point);
						
						break;
					}
				}
				break;
			}
		}	
	}
	
	//포인트 사용 결제
	public void pay3(Scanner sc) {
		int point = membership.getPoint();
		this.bill(point);	
	}
	
	//영수증 출력
	public void bill(int point) {
		System.out.println("==============영수증===============");
		//System.out.printf("날    짜 : %s", order.getDate());
		System.out.println("==================================");
		//System.out.println(order.getItem());
		System.out.println("==================================");
		//System.out.printf("총    액 : %d", 총 금액);
		System.out.println("==================================");
		//System.out.printf("결제금액 : %d", 총 금액);
		System.out.println("==================================");
		System.out.printf("적 립 금 : %d", point);
	}
}
