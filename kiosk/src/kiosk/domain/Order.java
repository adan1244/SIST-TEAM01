package kiosk.domain;

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
}
