/*
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
package rushikesh;

public class Mall {
	String custName="";
	int itemNum;
	String paymentType;
	String section;
	boolean needBill=false;
	
	void itemAddedToCart(int num) {
		itemNum=num;	
	}
	
	void customerName(String name) {
		custName=name;
	}
	
	void paymentDoneUsing(String method) {
		paymentType=method;
	}
	
	void displayCutomerInfo() {
		System.out.println(custName+" Brought " +itemNum+" items and payment done using "
		+paymentType+" in section "+section);
		
	}
	
	void decideSection() {
		if(itemNum<10 && paymentType.equals("cash") ) {
			section="1A";
		}else if(itemNum>10 && paymentType.equals("visa card")) {
			section="1B";
		}else if(itemNum>10 && paymentType.equals("cash")) {
			section="1C";	
		}else if(itemNum<10 && paymentType.equals("visa card")) {
			section="1D";
		}
		
	}
	/*void needBill(boolean ifBillRequired) {
		
		if(ifBillRequired==true){
			System.out.println("Customer Need Bill for the Shopping");	
		}else {
			System.out.println("Customer Dosen't need a bill");
		}
	}
	
	void haveCarryBag(boolean ifCarryBagRequired) {
		
		if (ifCarryBagRequired==true) {
			System.out.println("The Customer have Carrybag and He don't Need any!");
		}else {
			System.out.println("The customer dosen't have Carrybag....give him/her one");
		}
	}
	*/
	
	public static void main(String[] args) {
		Mall assignment_12= new Mall();
		assignment_12.customerName("Rushikesh");
		assignment_12.itemAddedToCart(11);
		assignment_12.paymentDoneUsing("cash");
		assignment_12.decideSection();
		assignment_12.displayCutomerInfo();
		/*assignment_12.needBill(false);
		assignment_12.haveCarryBag(true);*/
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

