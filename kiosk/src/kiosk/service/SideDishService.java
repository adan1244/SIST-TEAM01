package kiosk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kiosk.dao.KioskDAO;
import kiosk.domain.Item;
import kiosk.domain.Order;
import kiosk.domain.SubOrder;
import kiosk.main.Main;

public class SideDishService {

	KioskDAO dao = null;

	// 기본생성자
	public SideDishService() {

	}

	public SideDishService(KioskDAO dao) {
		this.dao = dao;
	}

	// 사이드메뉴 주문
	public void menu2(Scanner sc) {
		while (true) {

			System.out.println();
			System.out.println("뒤로 가기 = 0");
			System.out.println("==================================");
			System.out.println("           사이드 선택");
			System.out.println("==================================");
			System.out.println("번호          이름            가격");
			List<Item> item = this.dao.listItem("SI");
			int count = 1;
			for (Item i : item) {
				if (i != null) {
					System.out.printf("%4d%12s%15s%n", count, i.getName(), i.getPrice());
					++count;
				}
			}
			System.out.println("----------------------------------");
			System.out.print("선택:");
			int m = sc.nextInt();
			sc.nextLine();
			if (m == 0)
				break;
			List<Item> temp = new ArrayList<Item>();
			temp.add(item.get(m - 1));
			System.out.print("수량:");
			int m_ = sc.nextInt();
			sc.nextLine();

			SubOrder s1 = new SubOrder(temp, m_);
			this.dao.addToCart(s1);
			System.out.println("장바구니에 추가되었습니다.");
			System.out.println("");
			System.out.println("== 현재 장바구니에 추가된 메뉴 ===");
			Order order = dao.getCart();
			for (int i = 0; i < order.getItem().size(); ++i) {
				System.out.printf("%d %s%n ", i + 1, order.getItem().get(i));
			}

			System.out.println("----------------------------------");

			if (m_ == 0)
				Main.main(null);
			break;

		}

	}

}
