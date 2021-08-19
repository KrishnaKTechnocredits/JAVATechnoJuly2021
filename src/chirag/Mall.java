package chirag;

public class Mall {
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
			System.out.println("We only accept cash and visa card,please change payment method");
		
	}
	void displayCustomerInfo() {
		
		if(carryBagNeeded && billNeeded) { 
			System.out.println(customerName+" bought "+itemCounts+",Items along with carrybag."+"\n"+" Payment done by "+paymentMethod+" in "+decideSection()+",customer requested for the bill");
		}
		else if((!carryBagNeeded) && billNeeded) {
			System.out.println(customerName+" bought "+itemCounts+",Items without carrybag"+"\n"+"Payment done by "+paymentMethod+" in "+decideSection()+",Customer requested for the bill");
		}
		else if(carryBagNeeded && (!billNeeded)) { 
			System.out.println(customerName+" bought "+itemCounts+",Items along with carrybag."+"\n"+"Payment done by "+paymentMethod+" in "+decideSection()+",customer not requested for the bill");
		}
		else {
			System.out.println(customerName+" bought "+itemCounts+",Items along with carrybag."+"\n"+" Payment done by "+paymentMethod+" in "+decideSection()+",customer not requested for the bill");
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
		Mall mall1 = new Mall();
		mall1.setInfo("Chirag Prajapati");
		mall1.addedItemsToCart(9);
		mall1.isCarryBagNeeded(true);
		mall1.isBillneeded(true);
		mall1.setPaymentMethod("Cash");
		mall1.displayCustomerInfo();
	}
}