package kiosk.service;

import kiosk.domain.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kiosk.dao.KioskDAO;

public class SandwitchService {

	KioskDAO dao = null;

	// �⺻������
	public SandwitchService() {

	}

	// dao �ʱ�ȭ ������
	public SandwitchService(KioskDAO dao) {
		this.dao = dao;
	}

	// ���θ޴� �ֹ�
	public void menu1(Scanner sc) {
		List<Item> list = new ArrayList<Item>();

		list.add(this.sandwitch(sc));
		list.add(this.bread(sc));
		list.add(this.vegetable(sc));
		list.add(this.sauce(sc));
	}

	// ������ġ ����
	public Item sandwitch(Scanner sc) {
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("           ������� ���� �ֹ���                ");
			System.out.println("==================================");
			System.out.println(" ǰ���ȣ  ǰ���   ����");
			List<Item> item = this.dao.listItem("sandwitch");
			int number = 1;
			for (Item i : item) {
				if (i != null) {
					System.out.printf("%3d  %3s   %3s%n", number, i.getName(), i.getPrice());
					++number;
				}
			}
			System.out.println("----------------------------------");
			System.out.println("���� : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();

			if (sandchoice == 0)
				break;

		}
		return null;

	}

	public Item bread(Scanner sc) {
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("               ������                          ");
			System.out.println("==================================");
			System.out.println("��ȣ  �̸�");
			List<Item> item = this.dao.listItem("bread");
			System.out.println("----------------------------------");
			System.out.println("���� : ");
			int breadchoice = sc.nextInt();
			sc.nextLine();
			if (breadchoice == 0)
				break;
		}

		return null;
	}

	// ��ä����
	public Item vegetable(Scanner sc) {
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("              ��ä����                         ");
			System.out.println("==================================");
			List<Item> item = this.dao.listItem("vegetable");
			System.out.println("6 ���ÿϷ�");
			System.out.println("----------------------------------");
			System.out.println("������ ��ä�� ��ȣ�� �������ּ���");
			System.out.println("���� : ");
			int vegechoice = sc.nextInt();
			sc.nextLine();
			if (vegechoice == 0 || vegechoice == 6)
				break;

		}
		return null;
	}

	// �ҽ�����
	public Item sauce(Scanner sc) {
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("              �ҽ�����                         ");
			System.out.println("==================================");
			System.out.println("��ȣ  �̸�");
			List<Item> item = this.dao.listItem("sauce");
			System.out.println("7 ���ÿϷ�");
			System.out.println("----------------------------------");
			System.out.println("���� : ");
			int saucechoice = sc.nextInt();
			sc.nextLine();
			if (saucechoice == 0 || saucechoice == 7)
				break;
			System.out.println();
			System.out.println("������ġ ���� : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();
		}
		return null;
	}
}