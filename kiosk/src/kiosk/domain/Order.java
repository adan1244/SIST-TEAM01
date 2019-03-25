package kiosk.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String date;
	private List<SubOrder> item;
	
	public Order() {}
	
	public Order(String date, List<SubOrder> item) {
		this.date = date;
		this.item = item;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<SubOrder> getItem() {
		return item;
	}

	public void setItem(List<SubOrder> item) {
		this.item = item;
	}
	
	// SubOrder의 toString을 호출해서 장바구니에 들어있는 주문 목록을 문자열 리스트로 받아온다
	public List<String> listSubOrders() {
		List<String> tmp = new ArrayList<String>();
		for(SubOrder so : item) {
			tmp.add(so.toString());
		}
		return tmp;
	}
}
