package apurva;
//Assignement_12
class Mall{

	String name;
	int items;
	String payment;
	String sectionId;

	int itemAddedToCart(int itemsAdded){
		items = itemsAdded;
		return itemsAdded;
	}
	
	void customerName(String customerName){
		name = customerName;
	}
	
	String paymentDoneUsing(String paymentMode){
		payment = paymentMode;
		return paymentMode;	
	}
	
	boolean needBill(boolean bill){
		if(bill == true)
			System.out.println("Print Bill");
		return bill;
	}
	
	boolean haveCarryBag(boolean carryBag){
		if(carryBag)
			System.out.println("Extra Charges");
		
		return carryBag;
	}
	
	void displayCustomerInfo(){
		System.out.println(name + " brought " +items +" items" +" and payment done using " +payment +" card "+" in section " + decideSection());	
		}
	
	String decideSection(){
		
		if(items<10 && payment== "cash")
			return "1A";
		if(items>10 && payment == "visa")
			return "1B";
		if(items>10 && payment == "cash")
			return "1C";
		if(items<10 && payment == "visa")
			return "1D";		
		return "";
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Apurva");
		mall.needBill(false);
		mall.haveCarryBag(false);
		mall.paymentDoneUsing("visa");
		mall.itemAddedToCart(12);
		mall.decideSection();
		mall.displayCustomerInfo();
		
		Mall mallShop = new Mall();
		mallShop.customerName("Sarthak");
		mallShop.needBill(false);
		mallShop.haveCarryBag(false);
		mallShop.paymentDoneUsing("cash");
		mallShop.itemAddedToCart(22);
		mallShop.decideSection();
		mallShop.displayCustomerInfo();
		
		
	
	
	}
	
}