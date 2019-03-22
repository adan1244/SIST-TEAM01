package kiosk.domain;

import java.util.List;

public class SubOrder {
	private List<Item> item;
	private int count;
	private int price;
	
	public SubOrder() {}
	
	public SubOrder(List<Item> item, int count) {
		this.item = item;
		this.count = count;
		this.calculatePrice();
	}

	public List<Item> getItem() {
		return item;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void calculatePrice() {
		int tmp = 0;
		for (Item i : item) {
			tmp += i.getPrice();
		}
		tmp = tmp * count;
		this.price = tmp;
	}
}
