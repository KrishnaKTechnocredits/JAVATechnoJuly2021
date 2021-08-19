package laxman;

public class Assignment12 {
	int itemPurchased;
	String customerName;
	String paymentType;
	String section;
	boolean printBill;
	boolean carryBag;
	
	
	void itemAddedToCart(int items) {
		itemPurchased = items;
	}
	void custName(String custName) {
		customerName = custName;
	}
	void paymentDoneUsing(String payment) {
		paymentType = payment;
	}
	void needBill(boolean bill) {
		printBill = bill;
	}
	void haveCarryBag(boolean bag) {
		
	}
	void section(){
		if(itemPurchased < 10 && paymentType.equals("cash"));{
			section ="section 1A";
		}  if(itemPurchased > 10 && paymentType.equals("Visa"));{
			section ="section 1B";
		}  if(itemPurchased > 10 && paymentType.equals("cash"));{
			section ="section 1C";
		}  if(itemPurchased < 10 && paymentType.equals("Visa"));{
			section ="section 1D";
		}
	}
	void printBill() {
		System.out.println(" Customer "+ customerName+" Bought "+ itemPurchased +" items by using "+paymentType+ " on " + section);
	}
	
	public static void main(String[]args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.itemAddedToCart(12);
		assignment12.custName("Harsh");
		assignment12.paymentDoneUsing("cash");
		assignment12.needBill(true);
		assignment12.haveCarryBag(false);
		assignment12.section();
		assignment12.printBill();
;	}
		
	}

	