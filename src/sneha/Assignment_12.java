package sneha;

public class Assignment_12 {
	
	static int qty;
	static String custName = null;
	static String method1 = null;
	
    void itemAddedToCart(int item) {
		 qty = item;
	}
	
	 void customerName(String name){
		 custName = name;
	}
	
	static void paymentDoneUsing(String method) {
	
		if(method.equals("visaCard")) {
			System.out.println("Payment done using visa card");
			method1 = "visaCard";
		}
		else if(method.equals("cash")) {
			System.out.println("Payment done using cash");
			method1 = "cash";
		}
	}
	
	void needBill(boolean bool) {
		boolean bill = true;
		bill = bool;
		if(bill) {
			System.out.println(custName +" wants bill");
		}
		else {
			System.out.println(custName +" don't want bill");
		}
	}
	
	void haveCarryBag(boolean bool) {
		boolean bag = true;
		bag = bool;
		int count = 0;
		
		if(bag) {
			count++;
			System.out.println(custName + " don't have bag");
		}
	}
	
	void decideSection() {
		
		if((qty < 10) && (method1.equals("cash"))) {
			System.out.println("in Section 1A");
		}
		
		if((qty > 10) && (method1.equals("visaCard"))) {
			System.out.println("in Section 1B");
		}
		
		if((qty > 10) && (method1.equals("cash"))) {
			System.out.println("in Section 1C");
		}
		
		if((qty < 10) && (method1.equals("visaCard"))) {
			System.out.println("in Section 1D");
		}
	}
	
	void displayCustomerInfo() {
		System.out.println("*******************************************************************");
		System.out.println("\n" + custName + " brought " + qty + " Itemes");
	}
	
	public static void main(String[] a) {
		Assignment_12 assignment_12 = new Assignment_12(); 
		assignment_12.customerName("Sneha");
		assignment_12.itemAddedToCart(9);
		assignment_12.needBill(true);
		assignment_12.haveCarryBag(true);
		assignment_12.displayCustomerInfo();
		assignment_12.paymentDoneUsing("visaCard");
		assignment_12.decideSection();
		
	}
}
