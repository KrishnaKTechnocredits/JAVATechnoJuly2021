package chaitanya;

public class Ass12Mall {
	
	String customerName,paymentMethod,section,billStatus,carryBagStatus;
	int countincart;
	
	void itemsAddedToCart(int numberofitems){
		countincart=numberofitems;
	}

	void customerName(String name){
		customerName=name;
	}

	void paymentDone(String paymentmode){
		 paymentMethod=paymentmode;
	}
	
	void displayCutomerInfo(){

		System.out.println(customerName+" bought "+ countincart +" items and payment done using "+paymentMethod+ " in "+section);
		System.out.println("Bill Required: " + billStatus);
		System.out.println("Carry Bag Required: " + carryBagStatus);

	}

	String needBill(boolean status){
		if(status)
			return billStatus="Yes";
		else
			return billStatus="No";
	}

	String haveCarryBag(boolean status){
		if(status)
			return carryBagStatus="Yes";
		else
			return carryBagStatus="No";
	}
	
	String decideSection(){

		if(countincart<10 && paymentMethod.equals("Cash")){
			section="Section 1A";
			return section;
		}else if (countincart>10 && paymentMethod.equals("Visa Card")) {
			section="section 1B";
			return section;
		}else if(countincart>10 && paymentMethod.equals("Cash")){
			section="Section 1C";
			return section;
		}else if(countincart<10 && paymentMethod.equals("Visa Card")){
			section="section 1D";
			return section;
		} else 
			return "Invalid Selection";
		

	}


    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass12Mall ass12mall=new Ass12Mall();
		ass12mall.customerName("Chaitanya");
		ass12mall.itemsAddedToCart(15);
		ass12mall.paymentDone("Visa Card");
		ass12mall.decideSection();
		ass12mall.needBill(true);
		ass12mall.haveCarryBag(false);
		ass12mall.displayCutomerInfo();
	}
}
