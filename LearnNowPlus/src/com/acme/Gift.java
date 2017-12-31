package com.acme;

public class Gift {
	public String customerid;
	public String giftid;
	public Gift(String customerid, String giftid) {
		super();
		this.customerid = customerid;
		this.giftid = giftid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getGiftid() {
		return giftid;
	}
	public void setGiftid(String giftid) {
		this.giftid = giftid;
	}
	

}
