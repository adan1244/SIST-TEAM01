package kiosk.domain;

public class Membership {
	private String phone;
	private int point;
	
	public Membership() {}
	
	Membership(String phone, int point) {
		this.phone = phone;
		this.point = point;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
