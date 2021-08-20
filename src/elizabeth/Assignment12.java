/*Create a class named as Mall, which contains below methods
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

package elizabeth;

class Assignment12{
	
	int itemCount;
	String payment;
	String Name;
	String section;

	void itemAddedToCart(int count){
		itemCount=count;
	}
	
	void customerName(String custName){
		Name=custName;
	}
	
	void paymentDoneUsing(String paymentMode){
		payment=paymentMode;
	}
	
	boolean needBill(boolean billRequired){
		if(billRequired==true){
			return true;
		}
		return false;
	}
	
	boolean haveCarryBag(boolean carryBagRequired){
		if(carryBagRequired==true){
			return true;
		}
		return false;
	}
	
	void decideSection(){
		if(itemCount<10 && payment=="Cash"){
			section="section 1A";
		}else if(itemCount>10 && payment=="Visa Card"){
			section="section 1B";
		}else if(itemCount>10 && payment=="Cash"){
			section="section 1C";
		}else if(itemCount<10 && payment=="Visa Card"){
			section="section 1D";
		}
	}
	
	void displayCustomerInfo(){
		System.out.println(Name + " brought " + itemCount + " items and payment done using " + payment + " in " +section);
	}
	
	public static void main(String[]args){
		Assignment12 assignment12=new Assignment12();
		assignment12.itemAddedToCart(20);
		assignment12.customerName("Elizabeth");
		assignment12.paymentDoneUsing("Cash");
		assignment12.needBill(true);
		assignment12.haveCarryBag(false);
		assignment12.decideSection();
		assignment12.displayCustomerInfo();
		
	}
}