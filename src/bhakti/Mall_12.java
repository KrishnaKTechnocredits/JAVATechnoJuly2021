//Assignment - 12 : 14th Aug'2021
//
//1. Create a class named as Mall, which contains below methods
//	a. itemAddedToCart()
//	b. customerName()
//	c. paymentDoneUsing()
//		i. Visa Card ii. Cash
//	d. displayCutomerInfo()
//	e. needBill()
//	f. haveCarryBag()
//	g. decideSection()
//
//	i.e. console should print: Harsh brought 12 items and payment done using visa card in section 1B
//
//Expectations:
//• If items are less than 10 and payment done using cash, then send customer to section 1A
//• If items are more than 10 and payment done using visa card, then send customer to section 1B
//• If items are more than 10 and payment done using cash, then send customer to section 1C
//• If items are less than 10 and payment done using visa card, then send customer to section 1D
//
//Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter



package bhakti;

public class Mall_12{
	
	String custName;
	boolean itemlessThan10;
	String needBill;
	int totalItem;
	String userPaymentMethod;
	String section; 
	boolean needCarryBag;
	 
	void setCustomerName(String name) {
		custName= name;
	}
	
	void itemAddedToCart(int item ) {
		totalItem=item;
		if (totalItem <=0) {
			System.out.println("Enter valid item");			
		}
		else if (totalItem <=10) {
			itemlessThan10 = true;
		}
		else 
		itemlessThan10 =false;	
	}
	
	void haveCarryBag(String carrybag) {
		if (carrybag.equals("Yes"))
		needCarryBag=true;
		else if (carrybag.equals("No")) 
		needCarryBag=false;		
	}
	void paymentDoneUsing(String paymentMethod) {
        if (!paymentMethod.equals("Cash") || !paymentMethod.equals("Card")) {
        	System.out.println("Not valid Payment method");	}

		userPaymentMethod=paymentMethod;
	}
	
	void decideSection(){
		
		if (itemlessThan10==true && userPaymentMethod.equals("Cash") ) {
			section= "1A";
		}else if (itemlessThan10==false && userPaymentMethod.equals("Cash") ){
			section= "1C";
		}else if (itemlessThan10==false && userPaymentMethod.equals("Card") ){
			section= "1D";
		}else if (itemlessThan10==true && userPaymentMethod.equals("Card") ){
			section= "1B";
		}else {
			System.out.println("Invalid payment method");
			section= "invalid section";
		}
	}
	
	void needBill(String billstatus) {
		if (billstatus.equals("Yes"))
			System.out.println("Bill is  required");
		else if (billstatus.equals("No")) {
			System.out.println("Bill is not required");
		}else 
			System.out.println("Bill status is not yet mentioned ");
	}
	
	void displayCutomerInfo() {
		 System.out.println(custName+ "  brought "+totalItem+ " items and payment done using "+userPaymentMethod+ " in section " +section );
		 if (needCarryBag) {
			 System.out.println("Need carry bag");
		 }else if (!needCarryBag) {
			 System.out.println("No carry bag");
		 } 
	}
	
	public static void main (String[] df){
		Mall_12 mall = new Mall_12();
		mall.setCustomerName("Bhakti");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsing("Cash");
		mall.needBill("Yes");
		mall.haveCarryBag("Yes");
		mall.decideSection();
		mall.displayCutomerInfo();	
		
	}
}
