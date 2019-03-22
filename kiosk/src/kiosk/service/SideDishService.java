package kiosk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kiosk.dao.KioskDAO;

public class SideDishService {
		
		/*private KioskDAO dao;
		public SideDishService() {
			this.dao = new  KioskDAO();
		}
		
		public void menu2(Scanner sc) {
			while (true) {

				System.out.println();
				System.out.println("==================================");
				System.out.println("         사이드 선택");
				System.out.println("==================================");
				System.out.println("번호     이름     가격");
				List<Item> item = this.dao.listItem("sideDish");
				int count = 1;
				for (Item i : item) {
					if (i != null) {
						System.out.printf("%3d  %3s   %3s%n"
								, count, i.getName()
								, i.getPrice());
						++count;
						}
					}
				System.out.println("----------------------------------");
				System.out.print("선택:");
				int m = sc.nextInt();
				sc.nextLine();
				List<Item> temp = new ArrayList<Item>();
				temp.add(item.get(m-1));
				System.out.print("수량:");
				int m_ = sc.nextInt();
				sc.nextLine();
				
				SubOrder s1 = new SubOrder(temp, m_);
				this.dao.add(s1);
				System.out.println("장바구니에 추가되었습니다.");

				if (m == 0)
					break;

			
				}

			}
			*/		
		}



