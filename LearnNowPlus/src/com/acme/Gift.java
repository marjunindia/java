package com.acme;

public class Gift  implements Shipment{
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
	@Override
	public String getShippingAddress() {
		// TODO Auto-generated method stub
		return "Gift shipping address";
	}
	@Override
	public String toString() {
		return "Gift [customerid=" + customerid + ", giftid=" + giftid + "]";
	}
	

}
