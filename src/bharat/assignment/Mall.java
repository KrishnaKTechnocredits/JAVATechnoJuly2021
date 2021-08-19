package bharat.assignment;

public class Mall {
	
	int itemAdded;
	
	String customerName;
	
	String paymentDone;
	
	String section;
	
	String section1 = "1A";
	
	String section2 = "1B";
	
	String section3 = "1C";
	
	String section4 = "1D";
	
	void itemAddedTocart(int item) {
		itemAdded = item;
		
	}
	
	String customerName(String name) {
		customerName = name;
		return name;
	}
	
	void paymentDoneUsing(String payment) {
		paymentDone = payment;
		
	}
	
	void displayCustomerInfo() {
		System.out.println(customerName +"bought" + itemAdded + "items and payment done using " +paymentDone+ "in section " +section);
	}

	
	void needBill(boolean status) {
		if(status == true)
			System.out.println("Bill needed");
		else
			System.out.println("no need of bill");

	}
	
	void haveCarryBag(boolean bag) {
		if(bag == true)
			System.out.println("Bag needed");
		else
			System.out.println("no need of bag");
	}

	void decideSection() {
		if (itemAdded < 10 && paymentDone == "cash")
			section = section1;
		
		else if (itemAdded > 10 && paymentDone == "visa card")
			section = section2;
		
		else if (itemAdded > 10 && paymentDone == "cash")
			section = section3;
		
		else if (itemAdded < 10 && paymentDone == "visa card")
			section = section4;
	}
	
	public static void main(String[] args) {
		
		
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedTocart(12);
		mall.paymentDoneUsing("visa");
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.needBill(true);
		mall.haveCarryBag(true);
		
	}
	
}

