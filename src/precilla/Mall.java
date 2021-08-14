package precilla;

public class Mall {
	int itemChoice;
	String customerName,paymentMode;
	boolean needBillChoice=true;
	boolean haveCarryBagChoice=true;
	int itemAddedTocart(int item) {
		itemChoice=item;
		return item;
	}
	String customerName(String name) {
		customerName=name;
		return name;
	}
	String paymentDoneUsing(String payment) {
		paymentMode=payment;
		if(payment=="visa card") {
			return payment;
			
		}else if(payment=="cash") {
			return payment;
		}else {
			needBillChoice=false;
			haveCarryBagChoice=false;
			System.out.println("We support only Visa and cash");
		}
		return null;	
		
	}
	void needBill(boolean customerChoice) {
		if(customerChoice==true && needBillChoice==true) 
			System.out.println("Bill Generated ");
		if(!customerChoice && needBillChoice==true)
			System.out.println("Bill not generated ");
		if(customerChoice==true && needBillChoice==false)
			System.out.println();
	}
	void haveCarrBag(boolean customerChoice) {
		if(customerChoice && haveCarryBagChoice==true) 
			System.out.println("Extra cost will be added in the bill for the carry bag ");
		if(customerChoice==false && haveCarryBagChoice==true)
			System.out.println("No extra cost will be charged !! thank you for Shopping..Visit again");	
		if(customerChoice==true && haveCarryBagChoice==false)
			System.out.println();
	}
	void displayCustomerInfo() {
		if(itemChoice<=0)
			System.out.println("\nNothing to print!!!");
		else
			System.out.println(customerName + " brought " + itemChoice+ " items and payment done using "+paymentMode+" in "+decideSection());
				
	}
	String decideSection() {

		if(itemChoice<10 && paymentMode=="cash")
			return "1A" ;
		if(itemChoice>10 && paymentMode=="visa card")
			return "1B";
		if(itemChoice>10 && paymentMode=="cash")
			return "1C";
		if(itemChoice<10 && paymentMode=="visa card")
			return "1D";
	
		return null;
	}
	public static void main(String[] args) {
		Mall mall=new Mall();
		//Option 1 items<10 and payment done using cash,Sending customer to section 1A
		mall.customerName("Precilla");
		mall.itemAddedTocart(8);
		mall.paymentDoneUsing("cash");
		mall.displayCustomerInfo();
		mall.haveCarrBag(true);
		System.out.println();//Option 2 items>10 and payment done using visa card,Sending customer to section 1B
		mall.customerName("Rozita");
		mall.itemAddedTocart(14);
		mall.paymentDoneUsing("visa card");
		mall.displayCustomerInfo();
		mall.needBill(false);
		System.out.println();//Option 3 items>10 and payment done using cash,Sending customer to section 1C
		mall.customerName("Prathima");
		mall.itemAddedTocart(13);
		mall.paymentDoneUsing("cash");
		mall.displayCustomerInfo();
		mall.needBill(true);
		System.out.println();//"\nOption 4 items<10 and payment-visa card,Sending customer to section 1D"
		mall.customerName("Stella");
		mall.itemAddedTocart(7);
		mall.paymentDoneUsing("visa card");
		mall.displayCustomerInfo();
		mall.haveCarrBag(false);
		mall.customerName("Aranha");//for items<=0
		mall.itemAddedTocart(-1);
		mall.paymentDoneUsing("visa card");
		mall.displayCustomerInfo();
		System.out.println();
		mall.paymentDoneUsing("debit");
		
	}
}
