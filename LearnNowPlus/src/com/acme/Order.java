package com.acme;

abstract public class Order implements Shipment {
	
	public String customerid;
	public String orderiid;

	public Order(String customerid, String orderiid) {
		super();
		this.customerid = customerid;
		this.orderiid = orderiid;
	}
	
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getOrderiid() {
		return orderiid;
	}
	public void setOrderiid(String orderiid) {
		this.orderiid = orderiid;
	}
	
	public String getShippingAddress(){
		String shippiing = "ship via standard freight";
		if("coyote".equals(customerid)){
			shippiing="Shipping via expediiated freight";
		}
		
		
		return shippiing;
	}
	
	abstract public String getSpecialShippingAddress();
	

	@Override
	public String toString() {
		return "Order [customerid=" + customerid + ", orderiid=" + orderiid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((orderiid == null) ? 0 : orderiid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerid == null) {
			if (other.customerid != null)
				return false;
		} else if (!customerid.equals(other.customerid))
			return false;
		if (orderiid == null) {
			if (other.orderiid != null)
				return false;
		} else if (!orderiid.equals(other.orderiid))
			return false;
		return true;
	}
	
//	public void print() {
//	System.out.println("order no " +this.orderiid+ " customer id "+ customerid);
//	
//}
//
//

	
	

}
