package sagar_Anasane;

class Mall{
	String customerName;
	int addedItems;
	String paymentDone;
	String section;
	String section1 = "1A";
	String section2 = "1B";
	String section3 = "1C";
	String section4 = "1D";	

	void itemAddedToCart(int item){
		addedItems = item;
	}
	
	String customerName(String name){
		customerName = name;
		return name;
	}
	
	void paymentDoneUsing(String payment){
		paymentDone = payment;
	}
	
	void displayCustomerInfo(){
		System.out.println(customerName +" bought " + addedItems +" Items and payment done using "+paymentDone+" in Section "+section);
	}
	
	Boolean needBill(boolean flag){
		if (flag == true)
			System.out.println("bill needed");
		else
			System.out.println("no need of bill");
			return flag;
	}
	
	boolean haveCarryBag(boolean bag){
		if (bag = true)
			System.out.println("Bag needed");
		else
			System.out.println("no need og bag");
		return bag;
	}
	
	void  decideSection(){
		if (addedItems <10 && paymentDone == "cash")
			section = section1;
			//System.out.println(section1);
		else if (addedItems >10 && paymentDone == "Visa Card")
			section = section2;
		//System.out.println(section2);
		else if (addedItems >10 && paymentDone == "cash")
			section = section3;//System.out.println(section3);
		else if (addedItems <10 && paymentDone == "Visa Card")
			section = section4;	
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.displayCustomerInfo();
		mall.needBill(true);
		mall.haveCarryBag(false);
	}
}	