package shantanu.assignment12;

public class Mall {
	String customerName, paymentMethod, section;
	int itemsBought;
	boolean billRequired, hasCarryBag;
	
	void itemsAddedToCart(int itemNumber){
		itemsBought = itemNumber;
	}
	void setCustomerName(String name) {
		customerName = name;
	}
	void paymentDoneUsing(String method) {
		paymentMethod = method;
	}
	void displayCustomerInfo() {
		if(paymentMethod.equals("Visa"))
			System.out.println(customerName + " bought " + itemsBought + " items " + "and payment was done using visa card in section "+section);
		else if(paymentMethod.equals("Cash"))
			System.out.println(customerName + " bought " + itemsBought + " items " + "and payment was done using cash in section "+section);
	}
	void needBill(boolean bill){
		billRequired = bill;
	}
	void haveCarryBag(boolean bag){
		hasCarryBag = bag;
	}
	void decideSection() {
		if(itemsBought < 10) {
			if(paymentMethod.equals("Cash"))
				section = "1A";
			else
				section = "1D";
			
		}else if(itemsBought > 10) {
			if(paymentMethod.equals("Cash"))
				section = "1C";
			else
				section = "1B";	
		}
		
	}
	
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.setCustomerName("Shantanu");
		mall.itemsAddedToCart(5);
		mall.paymentDoneUsing("Cash");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
	}
}
