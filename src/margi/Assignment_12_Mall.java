package margi;

class Assignment_12_Mall{
	
	int totalItems;
	String customerName;
	String paymentMode;
	String decision;
	boolean bill;
	boolean bag;
	
	void itemAddedToCart(int items){
		totalItems = items;
	}
	
	void customerName(String custName){
		customerName = custName;
	}
	
	void paymentDoneUsing(String payMode){
		paymentMode = payMode;
	}
	
	void needBill(boolean getBill){
		bill = getBill;
	}
	
	void haveCarryBag(boolean getBag){
		bag = getBag;
	}

	void decideSection(){
		if(totalItems < 10 && paymentMode.equals("cash"))
			decision = "1A";
		else if(totalItems > 10 && paymentMode.equals("visa card"))
			decision = "1B";
		else if(totalItems > 10 && paymentMode.equals("cash"))
			decision = "1C";
		else if(totalItems < 10 && paymentMode.equals("visa card"))
			decision = "1D";
		else
			System.out.println("Enter valid payment mode");
	}
	
	void displayCustomerInfo(){
		System.out.println(customerName + " brought " + totalItems + " items and payment done using " + paymentMode + " in section " + decision);
	}
	
	public static void main(String[] args){
		Assignment_12_Mall mall = new Assignment_12_Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa card");
		mall.haveCarryBag(true);
		mall.needBill(true);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}