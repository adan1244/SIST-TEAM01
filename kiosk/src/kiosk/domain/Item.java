package kiosk.domain;

public class Item {
	private String category;
	private String name;
	private int price;
	
	public Item() {}
	
	public Item(String category, String name, int price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
