package indrani;

public class Assignment_12 {
	
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
			}
	
	void needBill(boolean bill) {
		if (bill==true) {
			System.out.println("Bill is printing, please wait for bill");
		}
		else if(!bill) {
			System.out.println("Thanks for choosing paperless billing system, check SMS for bill amount");
		}
	}
	
	void haveCarryBag(boolean carryBagReqd) {
		if (carryBagReqd)
			System.out.println("Please pay Rs. 5/- extra for carry bag");
		else if (!carryBagReqd)
			System.out.println("Thanks for not using plastic");
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
		
		Assignment_12 mall=new Assignment_12();
		mall.customerName("Mohan");
		mall.itemAddedToCart(10);
		mall.paymentDoneUsingCard(true);
		mall.needBill(false);
		mall.haveCarryBag(false);
		mall.displayCustomerInfo();
		System.out.println("-------------------------------");
		
		mall.customerName("Rohini");
		mall.itemAddedToCart(20);
		mall.paymentDoneUsingCard(true);
		mall.needBill(false);
		mall.haveCarryBag(true);
		mall.displayCustomerInfo();
	}
}

