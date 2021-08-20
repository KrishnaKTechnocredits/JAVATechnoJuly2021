package akshay;

public class Mall {
	
	String name;
	int itemCount;
	String payment;
	String section;
	
	
	void customerName(String custname) {
		name = custname;
	}
	
	void itemAddedToCart(int items) {
		itemCount = items;
	}
	
	void paymentDoneUsing(String paymentType) {
		payment = paymentType;
	}
	
	boolean needBill(boolean billrequire) {
		if (billrequire == true)
			return true;
		return false;
	}
	
	boolean haveCarryBag(boolean bagrequire) {
		if(bagrequire == true)
			return true;
		return false;
	}
	
	void decideSection() {
		if(itemCount <= 10 && payment.equals("Cash"))
			section = "1A";
		if(itemCount >= 10 && payment.equals("Visa Card"))
			section = "1B";
		if(itemCount > 10 && payment.equals("Cash"))
			section = "1C";
		if(itemCount < 10 && payment.equals("Visa Card"))
			section = "1D";
	}
	
	void displayCustomerInfo() {
		System.out.println(name + " brought " + itemCount + " items and payment done using " + payment + " in section " + section);
	}
	
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Akshay");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsing("Cash");
		mall.haveCarryBag(true);
		mall.needBill(false);
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.customerName("Aniket");
		mall.itemAddedToCart(10);
		mall.paymentDoneUsing("Visa Card");
		mall.haveCarryBag(true);
		mall.needBill(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}

