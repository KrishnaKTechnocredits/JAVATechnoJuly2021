package nidhi;

class Nidhi_Assignment_12{
	
	
	int itemsAddedToCart(int items){
		return items;
	}
	
	String customerName(String name){
		return name;
	}
	
	String paymentDoneUsing(String modepayment){
		return modepayment;
	}
	
	void displayCustomerInfo(String name, int item, String mode, String section){
		System.out.println(name + " brought " + item + " items and payment done using " + mode + " in section " + section); 
	}
	
	boolean needBill(boolean bill){
		return bill;
	}
	
	boolean haveCarryBag(boolean haveBag){
		return haveBag;
	}
	
	String decideSection(int item, String payMode){
		if (item < 10 && payMode.equals("Cash")){
			return "1A";
		}else if (item > 10 && payMode.equals("Visa Card")){
			return "1B";
		}else if (item > 10 && payMode.equals("Cash")){
			return "1C";
		}else return "1D";
	}
	
	public static void main(String[] arg){
		Nidhi_Assignment_12 assignment12 = new Nidhi_Assignment_12();
		String cust = assignment12.customerName("Nidhi");
		int items = assignment12.itemsAddedToCart(9);
		String mode = assignment12.paymentDoneUsing("Visa Card");
		assignment12.needBill(true);
		assignment12.haveCarryBag(false);
		String section = assignment12.decideSection(items, mode);
		assignment12.displayCustomerInfo(cust,items,mode,section);
	}

}