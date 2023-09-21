package com.a28;



public class Commission {
	String name,address;
	long phone;
	int sales_amount;
	double perct,commission;
		
	public Commission(String name,String address,long phone , int sales_amount) {		
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.sales_amount=sales_amount;
		calculate();
	}
	void calculate() {
		if(sales_amount>=100000) {
			perct=0.1;
		}
		else if (sales_amount<100000 && sales_amount>=50000) {
			perct=0.05;
		}
		else if (sales_amount<50000 && sales_amount>=30000) {
			perct=0.03;
		}
		else if (sales_amount<30000) {
			perct=1;
		}
		commission=sales_amount*perct;
		
		
	}
	
	
	
	//Setters and Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}

	

	@Override
	public String toString() {
		return "Commission [name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount="
				+ sales_amount + ", perct=" + perct + ", commission=" + commission + "]";
	}
	
	

}
