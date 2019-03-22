package kiosk.service;

import kiosk.domain.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kiosk.dao.KioskDAO;

public class SandwitchService {

	KioskDAO dao= null;
	
	// �⺻������
	public SandwitchService() {

	}

	// dao �ʱ�ȭ ������
	public SandwitchService(KioskDAO dao) {
		this.dao=dao;
	}
	
	// ���θ޴� �ֹ�
	public void menu1(Scanner sc) {
		List<Item> list =new ArrayList<Item>();
		list.add(this.sandwitch(sc));
		list.add(this.bread(sc));
		list.add(this.vegetable(sc));
		list.add(this.sauce(sc));
		
	}
	
	// ������ġ ����
	public Item sandwitch(Scanner sc) {
		String topping = null;
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("           ������� ���� �ֹ���                ");
			System.out.println("==================================");
			System.out.println(" ǰ���ȣ  ǰ���   ����");
			System.out.println(" 1        ���׸���  5,000    ");
			System.out.println(" 2        Ǯ����ũ  4,000    ");
			System.out.println(" 3         ��Ű      5,500    ");
			System.out.println(" 4         ������    6,000    ");
			System.out.println("----------------------------------");
			System.out.println("���� : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();

			if (sandchoice == 0) break;
			
		}
		return null;
		
	}

	public Item  bread(Scanner sc) {
		String bread = "b";
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("               ������                          ");
			System.out.println("==================================");
			System.out.println("��ȣ  �̸�");
			System.out.println("1      �÷�");
			System.out.println("2     ȭ��Ʈ");
			System.out.println("3    ��Ͽ�Ʈ");
			System.out.println("4     �ĸ���");
			System.out.println("----------------------------------");
			System.out.println("���� : ");
			int breadchoice = sc.nextInt();
			sc.nextLine();
			if (breadchoice == 0) break;
		}
		
		return null;
		
	}
	
	// ��ä����
	public Item  vegetable(Scanner sc) {
		String vege = "v";
		while (true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("              ��ä����                         ");
			System.out.println("==================================");
			System.out.println("6 ���ÿϷ�");
			System.out.println("----------------------------------");
			System.out.println("������ ��ä�� ��ȣ�� �������ּ���");
			System.out.println("���� : ");
			int vegechoice = sc.nextInt();
			sc.nextLine();
			if (vegechoice == 0) break;
		}
		return null;
	}
	
	// �ҽ�����
	public Item sauce(Scanner sc) {
		String suace = "s";
		while(true) {
			System.out.println("�ڷΰ��� = 0");
			System.out.println("==================================");
			System.out.println("              �ҽ�����                         ");
			System.out.println("==================================");
			System.out.println();System.out.println();
			System.out.println("��ȣ  �̸�");
			System.out.println("7 ���ÿϷ�");
			System.out.println("----------------------------------");
			System.out.println("���� : ");
			int saucechoice = sc.nextInt();
			sc.nextLine();
			if (saucechoice == 0) break;
			System.out.println();
			System.out.println("������ġ ���� : ");
			int sandchoice = sc.nextInt();
			sc.nextLine();
		}
		return null;
	}
}