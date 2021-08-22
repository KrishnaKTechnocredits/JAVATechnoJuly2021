package sourabh;

public class Assignment_12 {

	String customerName;
	String paymentmode;
	int itemcount;
	boolean bill;
	boolean carrybag;

	void customerName(String custname) {
		customerName = custname;

	}

	void  itemsAddedToCart(int itemsbrought) {
		itemcount = itemsbrought;
	}

	void displayCustormerInfo() {
		System.out.print(customerName + " brought " + 
				itemcount + " items and payment done using " + paymentmode + " in section ");
		if(itemcount<10  && paymentmode=="Visa card") {
			System.out.println("1A");	
		}
		if(itemcount>10 && paymentmode=="Visa card") {
			System.out.println("1B");	
		}
		if(itemcount<10 && paymentmode=="Cash") {
			System.out.println("1C");	
		}
		if(itemcount>10 && paymentmode=="Cash") {
			System.out.println("1D");	
		}	
	}

	void paymentDoneUsing(String paymode) {
		paymentmode  = paymode;	
	}

	void needBill(boolean bill1 ) {
		bill = bill1;	
	}

	void haveCarryBag(boolean carrybag1) {
		carrybag = carrybag1;
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.customerName("Sourabh");
		assignment_12.paymentDoneUsing("Visa card");
		assignment_12.itemsAddedToCart(12);
		assignment_12.displayCustormerInfo();
		assignment_12.customerName("Sourabh Kulkarni");
		assignment_12.paymentDoneUsing("Cash");
		assignment_12.itemsAddedToCart(9);
		assignment_12.displayCustormerInfo();
	}
}
