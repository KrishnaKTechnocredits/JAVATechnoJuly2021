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

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() have Boolean parameter & haveCarryBag have Boolean parameter */

package harshada;

public class Assignment_12_Mall {
	
	String custName;
	int itemsCount;
	String paymentInfo;
	
	
	void itemAddedToCart(int tempItemsCount){
		itemsCount=tempItemsCount;
	}
	
	void customerName(String tempName) {
		custName=tempName;
	}
	
	void paymentDoneUsing(String paymentType) {
		paymentInfo=paymentType;
	}
	
	void displayCustomerInfo(){
		System.out.println("Customer details are as follows: ");
		System.out.println("Customer Name = "+ custName);
		System.out.println("Number of items purchased by the customer are "+ itemsCount);
		
	}
	void needBill(boolean status){
		if(status)
			System.out.println("Bill is provided ");
		else
			System.out.println("Bill is not provided ");
	}
	
	void haveCarryBag(boolean status){
		if(status)
			System.out.println("CarryBag is provided ");
		else
			System.out.println("CarryBag is not provided ");
		
	}
	
	String getDecisionSection() {
		if (itemsCount < 10 && paymentInfo.equals("Cash"))
			return "Section 1A";
		else if (itemsCount > 10 && paymentInfo.equals("Visa Card"))
			return "Section 1B";
		else if (itemsCount > 10 && paymentInfo.equals("Cash"))
			return "Section 1C";
		else if (itemsCount < 10 && paymentInfo.equals("Visa Card"))
			return "Section 1D";
		
		return "Item added or payment type is incorrect";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_12_Mall mall1=new Assignment_12_Mall();
		mall1.customerName("Harsh");
		mall1.itemAddedToCart(25);
		mall1.paymentDoneUsing("Cash");
		//String sectionMessage=mall1.getDecisionSection();
		System.out.println(mall1.custName+ " brought "+ mall1.itemsCount+ " items and  Payment done using "+ mall1.paymentInfo + " in "+ mall1.getDecisionSection()+ "\n");
		mall1.displayCustomerInfo();
		mall1.needBill(true);
		mall1.haveCarryBag(false);
		
		//Sample output: Harsh brought 12 items and payment done using visa card in section 1B
	}

}
