/*1. Create a class named as Mall, which contains below methods
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

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, 
needBill() have Boolean parameter & haveCarryBag have Boolean parameter*/


package ritabrata;

public class Mall {
	String custName;
	String paymentMethod;
	int itemNo;
	
	void itemAddedToCart(int itemCount) {
		itemNo=itemCount;
	}
	
	void customerName(String name) {
		custName= name;
		System.out.println("The customer name is:"+ custName);
	}
	
	void paymentDoneUsingCard(boolean paymentType) {
		if(paymentType)
			paymentMethod="Visa Card";
		else if(!paymentType)
			paymentMethod="Cash";	
		//return null;
	}
	
	void needBill(boolean bill) {
		if (bill==true) {
			System.out.println("Bill is printing, please wait for bill");
		}
		else if(!bill) {
			System.out.println("Thanks for choosing paperless billing system, check SMS for bil amount");
		}
	}
	
	void haveCarryBag(boolean carryBagReqd) {
		if (carryBagReqd)
			System.out.println("Please pay Rs. 5/- extra for each carry bag");
		else if (!carryBagReqd)
			System.out.println("Thanks for using no plastic");
	}
	
	String decideSection() {
		
		if(itemNo<=10 && paymentMethod.equals("Cash")){
			return "Section 1A";
		}
		else if(itemNo>10 && paymentMethod.equals("Visa Card")){
			return "Section 1B";
		}
		else if(itemNo>10 && paymentMethod.equals("Cash")){
			return "Section 1C";
		}
		else if(itemNo<=10 && paymentMethod.equals("Visa Card")){
			return "Section 1D";
		}
		return null;
	}
	
	void displayCustomerInfo() {
		System.out.println(custName+" has bought "+itemNo+ " no of items and payment done using "+paymentMethod+" method in "+decideSection());	
	}
	
	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.customerName("Rohit");
		mall.itemAddedToCart(11);
		mall.paymentDoneUsingCard(true);
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
		System.out.println("-------------------------------");
		
		mall.customerName("Rakesh");
		mall.itemAddedToCart(9);
		mall.paymentDoneUsingCard(false);
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.displayCustomerInfo();
	}
}
