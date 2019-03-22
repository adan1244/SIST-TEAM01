package kiosk.dao;
import java.util.List;

import kiosk.domain.*;

public class KioskDAO {
	private List<Item> item;
	private List<Membership> mem;
	private Order cart;
	private List<Order> order;
	
	public List<Item> listItem(String category) {
		return null;
	}
	
	public List<Order> listOrder() {
		return null;
	}
	
	public List<Order> listOrder(String date) {
		return null;
	}
	
	public Order getCart() {
		return cart;
	}
	
	public void addToCart(SubOrder suborder) {
		this.cart.getItem().add(suborder);
	}
	
	public void deleteFromCart(int index, int count) {
		
	}
	
	public void changePrice(String itemName, int price) {
		
	}
	
	public void deleteOrder(String date) {
		
	}
	
	public int getPoint(String phone) {
		int tmp = 0;
		
		for (Membership m : mem) {
			if (m.getPhone().equals(phone)) {
				tmp = m.getPoint();
				break;
			}
		}
		
		return tmp;
	}
	
	public void addPoint(String phone, int addingPoint) {

	}
	
	public void usePoint(String phone, int usingPoint) {
		
	}
}
