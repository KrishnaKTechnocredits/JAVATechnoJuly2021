package paresh;

public class Assignment12 {
	String customerName;
	String paymentMethod;
	boolean carryBagNeeded;
	boolean billNeeded;
	int itemCounts;

	void setInfo(String customerInfo) {
		customerName = customerInfo;
	}
	
	void addedItemsToCart(int addedItems) {
		if(addedItems > 0)
			itemCounts = addedItems;
		else
			System.out.println("Number of items must be greater then zero");
	}
	
	void setPaymentMethod(String paymentType) {
		if(paymentType.equals("Cash") || paymentType.equals("Visa"))
			paymentMethod = paymentType;
		else
			System.out.println("We only accept cash and visa card, Please change payment method");
	}
	
	void displayCustomerInfo() {

		if(carryBagNeeded && billNeeded) { 
			System.out.println(customerName+" bought "+itemCounts+",Items along with carrybag."+"\n"+" Payment done by "+paymentMethod+" in "+decideSection()+", customer requested for the bill");
		}
		else if((!carryBagNeeded) && billNeeded) {
			System.out.println(customerName+" bought "+itemCounts+", Items without carrybag"+"\n"+" Payment done by "+paymentMethod+" in "+decideSection()+", Customer requested for the bill");
		}
		else if(carryBagNeeded && (!billNeeded)) { 
			System.out.println(customerName+" bought "+itemCounts+", Items along with carrybag."+"\n"+" Payment done by "+paymentMethod+" in "+decideSection()+", customer not requested for the bill");
		}
		else {
			System.out.println(customerName+" bought "+itemCounts+", Items along with carrybag."+"\n"+" Payment done by "+paymentMethod+" in "+decideSection()+", customer not requested for the bill");
		}
	}
	
	void isBillneeded(boolean neededBill) {
		billNeeded = neededBill;
	}
	
	void isCarryBagNeeded(boolean carryBag) {
		carryBagNeeded = carryBag;
	}
	
	String decideSection() {
		if(itemCounts < 10  && paymentMethod.equals("Cash"))
			return "Section A";

			else if (itemCounts > 10 && paymentMethod.equals("Visa"))
				return "Section B";

			else if (itemCounts> 10 && paymentMethod.equals("Cash"))
				return "Section C";
			else 
				return "Section D";
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.setInfo("Paresh");
		assignment12.addedItemsToCart(10);
		assignment12.isCarryBagNeeded(true);
		assignment12.isBillneeded(true);
		assignment12.setPaymentMethod("Cash");
		assignment12.displayCustomerInfo();
	}
}	
