//Assignment 12 [Mall} DATE: 08/14/2021
package deepak;

public class Mall {
	int itemCnt;
	String paymentMethod;
	String CustomerName;
	String decision;
		
	void itemAddToCart(int itemCnt1) {
		itemCnt = itemCnt1;
	}
	
	void setCustomerName(String CustomerName1) {
		CustomerName = CustomerName1;
	}
	
	void displayCustomerInfo() {
		
		System.out.println("******************************************************************");
		System.out.println(CustomerName+" brought "+itemCnt+" items and "
				+ "payment done using "+paymentMethod+" in section "+decideSection());
		//CustomerName="null";
	}
	
	void paymentDoneUsing(String paidVia) {
		paymentMethod = paidVia;
	}
	
	String needBill(boolean flag) {
		if(flag == true) {
		return "Print the bill and handover to Mr. "+CustomerName;
		}
		else
			return CustomerName+" doesn't want bill";
	}
	
	String haveCarryBag(boolean flag) {
		if(flag == true)
			return "No Carry Bag required";
		else
			return "Please provide Carry Bag";
	}
		
	String decideSection() {
		if(itemCnt <= 10 && paymentMethod.equalsIgnoreCase("Cash"))
			decision = "1A";
		else if(itemCnt > 10 && paymentMethod.equalsIgnoreCase("Visa Card"))
			decision = "1B";
		else if(itemCnt > 10 && paymentMethod.equalsIgnoreCase("Cash"))
			decision = "1C";
		else if(itemCnt < 10 && paymentMethod.equalsIgnoreCase("Visa Card"))
			decision = "1D";
		else
			decision = "other than 1A, 1B, 1C and 1D";
		return decision;	
	}
			
	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.setCustomerName("Harsh");
		mall.itemAddToCart(12);
		mall.paymentDoneUsing("Visa Card");
		mall.decideSection();
		mall.displayCustomerInfo();
		System.out.println(mall.needBill(false));
		System.out.println(mall.haveCarryBag(true));
				
		Mall mall1=new Mall();
		mall1.setCustomerName("Deepak");
		mall1.itemAddToCart(5);
		mall1.paymentDoneUsing("Cash");
		mall1.decideSection();
		mall1.displayCustomerInfo();
		System.out.println(mall1.needBill(true));
		System.out.println(mall1.haveCarryBag(false));
		
		Mall mall2=new Mall();
		mall2.setCustomerName("Husain");
		mall2.itemAddToCart(6);
		mall2.paymentDoneUsing("visa card");
		mall2.decideSection();
		mall2.displayCustomerInfo();
		System.out.println(mall2.needBill(false));
		System.out.println(mall2.haveCarryBag(false));
		
		Mall mall3=new Mall();
		mall3.setCustomerName("Chandani");
		mall3.itemAddToCart(50);
		mall3.paymentDoneUsing("cash");
		mall3.decideSection();
		mall3.displayCustomerInfo();
		System.out.println(mall3.needBill(true));
		System.out.println(mall3.haveCarryBag(true));
	}
}
