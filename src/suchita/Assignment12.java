package suchita;

class Assignment12 {
	
	String section;
	int item=0;
	String pay;
	String name;
	
	int itemAddedToCart(int itemAdd) {
		item=itemAdd;
		return(item) ;
	}
	
	String customerName(String custName) {
		name=custName;
		return(name);
	}
	
	String paymentDoneUsing(String payment) {
		pay=payment;
		return(pay);
	}
	
	void displayCustomerInfo() {
		decideSection();
		System.out.println(name + " brought " + item + " items and payment done using " + pay + " in section " + section);
		
		
	}
	
	boolean needBill(boolean bill) {
		
		if(bill == true)
			System.out.println("\n Print bill ");
			return(bill);
		
	}
	
	boolean haveCarryBag(boolean bag) {
		if(bag == true)
			System.out.println(" \n bag required");
			return(bag);
	}
	
	void decideSection() {
		if(item < 10 && pay.equals("cash"))
			section = "1A";
		else if(item > 10 && pay.equals("visa_card"))
			section = "1B";
		else if(item > 10 && pay.equals("cash"))
			section = "1C";
		else if(item < 10 && pay.equals("visa_card"))
			section = "1D";
		
	}
	
	public static void main(String[] args) {
		Assignment12 assignment = new Assignment12();
		assignment.itemAddedToCart(12);
		assignment.customerName("Ram ");
		assignment.paymentDoneUsing("visa_card");
		assignment.decideSection();
		assignment.displayCustomerInfo();
		assignment.needBill(false);
		assignment.haveCarryBag(false);
	}
	
}