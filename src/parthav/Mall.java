//Assignment 12;

package parthav;

public class Mall {
	String customerFullName;
	int itemsBought;
	String paymentMethod;
	boolean billChoice;
	boolean carryBagChoice;
	String mallSection;
	
	void setCustomerName(String customerName) {
		customerFullName = customerName;
	}
	
	void setItemsAddedToCart(int itemSelected) {
		itemsBought = itemSelected;
	}
	
	void setPaymentMethod(String passedMethod) {
		paymentMethod = passedMethod;
		
	}
	
	void setBillingNeed(boolean passedChoice) {
		billChoice = passedChoice;
	}
	
	void setCarryBagChoice(boolean passedChoice) {
		carryBagChoice = passedChoice;
	}
	
	void decideSection() {
		if (itemsBought < 10 && paymentMethod.equals("Cash")) {
			mallSection = "1A";
			System.out.println(customerFullName + " bought " + itemsBought + " items and payment done using " + paymentMethod + " in section " + mallSection);
		}
		
		else if (itemsBought > 10 && paymentMethod.equals("Visa Card")) {
			mallSection = "1B";
			System.out.println(customerFullName + " bought " + itemsBought + " items and payment done using " + paymentMethod + " in section " + mallSection);			
		}
		
		else if (itemsBought > 10 && paymentMethod.equals("Cash")) {
			mallSection = "1C";
			System.out.println(customerFullName + " bought " + itemsBought + " items and payment done using " + paymentMethod + " in section " + mallSection);			
		}
		
		else if (itemsBought < 10 && paymentMethod.equals("Visa Card")) {
			mallSection = "1D";
			System.out.println(customerFullName + " bought " + itemsBought + " items and payment done using " + paymentMethod + " in section " + mallSection);			
		}
		
		else 
			System.out.println("Please correct the payment method input OR select items greater than or less than 10");
		
	}
	
	public static void main(String[] args) {
		Mall mall = new Mall();
		mall.setCustomerName("Harsh");
		mall.setItemsAddedToCart(12);
		mall.setCarryBagChoice(true);
		mall.setPaymentMethod("Visa Card");
		mall.setBillingNeed(true);
		mall.decideSection();
	}
	

}
