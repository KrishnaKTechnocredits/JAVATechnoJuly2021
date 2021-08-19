package sayli_Vyavhare;

public class Assignment12 {
	String custName;
	int itemsBought;
	String paymentDetails;
	
	String customerName(String name) {
		custName=name;
		return custName;
		}
	int itemAddedToCart(int item) {
		
		itemsBought=item;
		return itemsBought;
		}	
	
	void displayCustomerInfo() {
		System.out.println("Customer name is:"+custName);
		System.out.println("Items bought:"+itemsBought); 
		System.out.println("Summary: "+ "\n" +custName + " bought " + itemsBought +" items "
				+" and payment done using "+paymentDetails+" under section " + decideSection() );
		}
	
	String  paymentDoneUsing(String paymentDone ) {
		paymentDetails=paymentDone;
		return paymentDetails;
		}
	
	void needBill(boolean flag) {
		if(flag)
			System.out.println("Bill is provided");
		else
			System.out.println("Bill is not provided");
		}
	
	
	void  needCarryBag(boolean bagData) {
		if(bagData)
			System.out.println("Carry bag provided");
		else
			System.out.println("Carry bag not provided ");
	}
	String decideSection() {
		if(itemsBought<10 && paymentDetails.equals("Cash"))
			return "1A";
		else if(itemsBought>10 && paymentDetails.equals("Visa Card"))
			return "1B";

		else if(itemsBought>10 && paymentDetails.equals("Cash"))
			return "1C";

		else if(itemsBought<10 && paymentDetails.equals("Visa Card"))
			return "1D";

	return "Payment type is Incorrect... Please try again";
		}
	
	public static void main(String[] args) {
		Assignment12 assignment12 =new Assignment12();
		assignment12.customerName("Harsh");
		assignment12.itemAddedToCart(12);
		assignment12.paymentDoneUsing("Visa Card");
		assignment12.decideSection();
		assignment12.displayCustomerInfo();
		assignment12.needBill(true);
		assignment12.needCarryBag(false);
	}
}
