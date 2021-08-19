/*Assignment - 12 : 14th Aug'2021
1. Create a class named as Mall, which contains below methods
	a. itemAddedToCart()
	b. customerName()
	c. paymentDoneUsing()
		i. Visa Card ii. Cash
	d. displayCutomerInfo()
	e. needBill()
	f. haveCarryBag()
	g. decideSection()
	i.e. console should print: Harsh brought 12 items and payment done using visa card in section 1B
Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D
Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter
*/
package monika;

public class Assignment_12 {

	int itemAdded;
	String customerName,paymentType,section;
	boolean billNeeded, carryBagNeeded;
	
	void setCustomerName(String custName) {
		customerName=custName;
	}
	void itemAddedtoCart(int item) {
		if(item>0)
			itemAdded=item;
		else
			System.out.println("Invalid Item Count Entered");
	}
	void paymentDoneUsing(String type) {
		if(type.equals("Cash")|| type.equals("Visa Card"))
			paymentType=type;
		else
			System.out.println("Invalid payment method Available types 1) Cash  2)Visa Card");
	}
	void section() {
		if(itemAdded!=0 && paymentType!=null) {
			if(itemAdded<10 && paymentType.equals("Cash"))
				section="1A";
			else if(itemAdded<10 && paymentType.equals("Visa Card"))
				section="1D";
			else if(itemAdded>=10 && paymentType.equals("Cash"))
				section="1C";
			else if(itemAdded>=10 && paymentType.equals("Visa Card"))
				section="!B";
		}else
			System.out.println("Item Added or Pyment type is not Correct");
			
	}
	
	void needBill(boolean bill) {
		billNeeded=bill;
	}
	void carryBagNeeded(boolean carryBag) {
		carryBagNeeded=carryBag;
	}
	void displayCustomerInfo() {
		System.out.println("Customer Name:"+customerName+"\nShopped using "+paymentType);
		if(billNeeded)
			System.out.println("Customer has requested for Bill");
		else 
			System.out.println("Customer did't requested for Bill");
		if(carryBagNeeded)
			System.out.println("Customer has requested for CarryBag");
		else
			System.out.println("Customer did't requested for CarryBag");
	}
	public static void main(String[] args) {
		Assignment_12 assignment_12=new Assignment_12();
		assignment_12.setCustomerName("Monika Zankar");
		assignment_12.itemAddedtoCart(15);
		assignment_12.carryBagNeeded(true);
		assignment_12.needBill(true);
		assignment_12.paymentDoneUsing("Visa Card");
		assignment_12.displayCustomerInfo();
	}
	
}
