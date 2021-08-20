package nishi;

public class Mall {
	int itemAdded;
	String customerName;
	String paymentMethod;
	boolean  neededBill;
	boolean hasCarryBag;
	String section;
	
	void itemAddedToCart(int numOfItem) {
		itemAdded+=numOfItem;	
	}
	
	void customerName(String CustName)
	{
		customerName=CustName;
	}
	
	void paymentDoneUsing(String paymentMode) {
		if(paymentMode.equals("Cash"))
			paymentMethod= "Cash";
		else
			paymentMethod= "Visa Card";					
	}
	
	void displayCustomerInfo()
	{
		System.out.println(customerName+" brought "+itemAdded+" items and payment done using "+paymentMethod+" in section "+section );
	}
	
	void needBill(boolean hasBill) {
		neededBill=hasBill;
	}
	
	void haveCarryBag(boolean hasBag)
	{	
		hasCarryBag=hasBag;
	}
	
	void decideSection()
	{
		if(itemAdded < 10 && paymentMethod.equals("Cash"))
			section="1A";
		else if(itemAdded>10 && paymentMethod.equals("Visa Card"))
			section="1B";
		else if(itemAdded>10 && paymentMethod.equals("Cash"))
			section="1C";
		else if(itemAdded<10 && paymentMethod.equals("Visa Card"))
			section="1D";
	}

	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(10);
		mall.itemAddedToCart(2);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.displayCustomerInfo();
		

	}

}
