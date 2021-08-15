package shraddha;

public class ShoppingMall {
	String custName;
	int itemCount;
	String paymentMethod;
	String sectionName;
	boolean wantBag;
	boolean wantBill;
	
	public static void main(String[] args) {
		ShoppingMall mall = new ShoppingMall();
		mall.setCustomerName("Shraddha");
		mall.itemAddedToCart(45);
		mall.paymentDoneUsing("Visa Card");
		mall.needBill(true);
		mall.wantCarryBag(false);
		mall.displayCutomerInfo();
		
		ShoppingMall mall1 = new ShoppingMall();
		mall1.setCustomerName("Pooja");
		mall1.itemAddedToCart(7);
		mall1.paymentDoneUsing("Cash");
		mall1.needBill(false);
		mall1.wantCarryBag(true);
		mall1.displayCutomerInfo();
	}
	
	void itemAddedToCart(int item){
		itemCount = item;
	}
	void setCustomerName(String name) {
		custName = name;
	}
	
	void paymentDoneUsing(String paymentName){
		paymentMethod = paymentName;
	}
	
	boolean needBill(boolean billRequired){
		if(billRequired == true) {
			wantBill = true;
			return wantBill;
	    } else {
			wantBill = false;
			return wantBill;
		}
	}
	
	boolean wantCarryBag(boolean bagRequired){
		if(bagRequired == true) {
			wantBag = true;
			return wantBag;
		} else { 
			wantBag = false;
			return wantBag;
		}
	}
	
	String decideSection() {
		if(itemCount < 10 && paymentMethod.equals("Visa Card"))
			return "1D";
		else if(itemCount > 10 && paymentMethod.equals("Cash"))
			return "1C";
		else if(itemCount > 10 && paymentMethod.equals("Visa Card"))
			return "1B";
		else if(itemCount < 10 && paymentMethod.equals("Cash"))
			return "1A";
		else
			return "Customer Service Desk";
	}
	
	void displayCutomerInfo() {
		sectionName = decideSection();
		System.out.println();
		System.out.println(custName+" brought "+itemCount+" items and payment done using "+paymentMethod+" in Section "+sectionName);
			if(wantBag) {
				System.out.println("Other Details :-");
				System.out.println("Carry Bag is being purchased by "+custName);
			}
			if(wantBill) {
				System.out.println("Other Details :-");
				System.out.println("Bill is taken by "+custName+" from Section "+sectionName);
			}
			
	}
	

}
