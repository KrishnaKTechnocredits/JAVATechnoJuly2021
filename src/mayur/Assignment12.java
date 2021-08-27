package mayur;
public class Assignment12{
	
	String custName;
	int noOfItems;
    String paymentType;	
	String section;
	
	
	void setCustomerName(String customerName){
		custName = customerName;
	}
	
	void itemAddedToCart(int items){
		noOfItems = items;
		
	}
	void paymentDoneUsing(String modeOfpayment){
		paymentType = modeOfpayment;
	}
	
	void displayCutomerInfo(){  
		
		System.out.println(custName+ " brought " +noOfItems+ " items and payment done using " +paymentType+ " in " +section);
	}
	boolean needBill(boolean isBillRequired){
		if(isBillRequired = true){
			return true;
		}
		return false;
		}
	
	boolean haveCarryBag(boolean isCarryBagrequired){
		if(isCarryBagrequired = true){
			return true;
		}
		return false;
	}
	
	void decideSection(){
		
		if(noOfItems<10 && paymentType =="Cash"){
			section ="section 1A";
		}else if(noOfItems>10 && paymentType == "Visa Card"){
			section ="section 1B";
		}else if(noOfItems>10 && paymentType == "Cash"){
			section ="section 1C";
		}else if(noOfItems<10 && paymentType =="Visa Card"){
			section="section 1D";
		}else 
			System.out.println("Customer don't have Cash and Card payment option");
			
	}
	public static void main(String [] args){
		Assignment12 assignment12 = new Assignment12();
		assignment12.setCustomerName("Mayur");
		assignment12.itemAddedToCart(20);
		assignment12.paymentDoneUsing("Visa Card");
		assignment12.needBill(true);
		assignment12.haveCarryBag(false);
		assignment12.decideSection();
		assignment12.displayCutomerInfo();
		
		
			
	}
}
	









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

Hint: itemAddedToCart method have int parameter, paymentDoneUsing() method have String parameter, needBill() 
have Boolean parameter & haveCarryBag have Boolean parameter */
		
		
