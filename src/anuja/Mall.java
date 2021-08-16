package anuja;

public class Mall {
	
	String name;
	String mode;
	static int itemadded;
	
	void itemAddedToCart(int item) {
		System.out.print(name + " bought "+item+ (" items"));
		itemadded=item;
	}
	
	void customerName(String custName) {
		name=custName;
	}
	
	void paymentDoneUsing(String option) {
		if(option.equals("visa")) {
			mode="visa card";
		System.out.print(" and payment done using "+ mode);
		}
		else if(option.equals("cash")) {
			mode="cash";
		System.out.print(" and payment done using "+ mode);
		}
	 }
	 
	 void displayCustomerInfo() {
		 
	 }
	 
	 void needBill(boolean flag) {
		 if(flag==true)
		 System.out.println("Customer needs bill");
	 }
	 
	 void haveCarryBag(boolean status) {
		 if(status==true)
			 System.out.println("Customer needs carry bag");
	 }
	 
	 void decideSection() {
		 if(itemadded<10 && mode.equals("cash")) {
			System.out.println("in Section 1A");
		 }
		 else if(itemadded>10 && mode.equals("visa card"))
			 System.out.println(" in section 1B");
		 else if(itemadded>10 && mode.equals("cash"))
			 System.out.println(" in section 1C");
		 else if(itemadded<10 && mode.equals("visa card"))
			 System.out.println(" in section 1D");
	 }
		 
	 public static void main(String[] args) {
		Mall mall=new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(12);
		mall.paymentDoneUsing("visa");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(true);
	}
}
