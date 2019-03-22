package kiosk.domain;

import java.util.List;

public class SubOrder {
	private List<Item> item;
	private int count;
	
	SubOrder() {}
	
	SubOrder(List<Item> item, int count) {
		this.item = item;
		this.count = count;
	}
}
