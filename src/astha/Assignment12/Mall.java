package astha.Assignment12;

public class Mall {

	int itemInCart;
	String customerName;
	String modeOfPayment;
	boolean needBill;
	boolean needCarryBag;
	String billingSection;
	
	void customerName(String name){
		customerName = name;		
	}
	
	void itemAddedToCart(int item){
		itemInCart = item;		
	}
	
	void paymentDoneUsing(String paymentMode){
		modeOfPayment = paymentMode;
	}
	
	void needBill(boolean billRequired){
		needBill = billRequired;		
	}
	
	void haveCarryBag(boolean carryBagRequired){
		needCarryBag = carryBagRequired;		
	}
	
	void decideSection(){
		if(itemInCart < 10 && modeOfPayment.equals("Cash")){
			billingSection = "Section 1A";
		}else if (itemInCart > 10 && modeOfPayment.equals("Visa Card")){
			billingSection = "Section 1B";
		}else if (itemInCart > 10 && modeOfPayment.equals("Cash")){
			billingSection = "Section 1C";
		} else if (itemInCart < 10 && modeOfPayment.equals("Visa Card")){
			billingSection = "Section 1D";
		} 		
	}
	
	void displayCustomerInfo(){
		if (itemInCart == 0){
			System.out.println("Please add item to your cart");
		}else if (!(modeOfPayment.equals("Cash")|| modeOfPayment.equals("Visa Card"))) {
			System.out.println("Please use the correct mode of payment");
		}else{
			System.out.println(customerName+ " bought "+itemInCart+" items and payment done using "+modeOfPayment+ " in " +billingSection);
			System.out.println("Bill required? " +needBill);
			System.out.println("CarryBag required? "+needCarryBag);
		}
	}	
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Astha");
		mall.itemAddedToCart(50);
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
