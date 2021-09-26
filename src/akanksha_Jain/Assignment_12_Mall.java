/* Assignment - 12 : 14th Aug'2021
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

package akanksha_Jain;

public class Assignment_12_Mall {
	int items;
	String paymentMode;
	boolean isBill;
	boolean isCarryBag;
	String customerName;
	
	void setCustomerName(String custName) {
		customerName = custName;
	}

	void itemAddedToCart(int itemsCount) {
		if (itemsCount > 0)
			items = itemsCount;
	}
	
	void paymentDoneUsing(String mode) {
		if (mode.equals("CASH") || mode.equals("VISA_CARD"))
			paymentMode = mode;
		else
			System.out.println("Wrong payment method");
	}
	
	void needBill(boolean isBillPresent) {
		isBill = isBillPresent; 
	}
	
	void haveCarryBag(boolean isCarryBagPresent) {
		isCarryBag = isCarryBagPresent; 
	}
	
	String decideSection() {
		if (items < 10 && paymentMode.equals("CASH"))
			return "section 1A";
		else if (items >= 10 && paymentMode.equals("VISA_CARD"))
			return "section 1B";
		else if (items >= 10 && paymentMode.equals("CASH"))
			return "section 1c";
		else if (items < 10 && paymentMode.equals("VISA_CARD"))
			return "section 1D";
		else
			return "section";
	}
	
	void displayCutomerInfo() {
		if (isBill && isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " with bill and carry bag both.");
		else if (!isBill && isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " without bill and with carry bag.");
		else if (isBill && !isCarryBag)
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " with bill and without carry bag.");
		else
			System.out.println(customerName + " brought " + items + " items and payment done using " + paymentMode + " in " + decideSection() + " without bill and carry bag both.");
	}
	
	public static void main(String[] args) {
		Assignment_12_Mall mall = new Assignment_12_Mall();
		mall.setCustomerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("VISA_CARD");
		mall.needBill(true);
		mall.haveCarryBag(true);
		mall.displayCutomerInfo();
	}
}