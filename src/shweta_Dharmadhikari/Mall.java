package shweta_Dharmadhikari;

public class Mall {

	int itemAddedToCart(int itemCount) {
		return itemCount;
	}
	
	String customerName(String name) {
		return name;
	}
	
	String paymentDoneUsing(String paymentMethod) {
		//payMethod = paymentMethod;
		return paymentMethod;
	}
	
	void displayCutomerInfo(String name, int item,String payMethod,String sectionName) {
		System.out.println(name+" brought "+item+" items and payment done using "+payMethod+" in section "+sectionName);
	}
	
	boolean needBill(boolean isBillRequired) {
		if (isBillRequired)
			return true;
		else
			return false;
	}
	
	boolean haveCarryBag(boolean isCarryBagRequired) {
		if (isCarryBagRequired)
			return true;
		else
			return false;
	}
	
	String decideSection(int item,String payMethod) {
		if (item < 10 && payMethod == "Cash" )
			return "1A";
		else if (item > 10 && payMethod == "Visa Card" )
			return "1B";
		if (item > 10 && payMethod == "Cash" )
			return "1C";
		else if (item < 10 && payMethod == "Visa Card" )
			return "1D";
		return "";
	}
	
	public static void main(String[] args) {
		Mall mall = new Mall();
		int items=mall.itemAddedToCart(12);
		String name= mall.customerName("Shweta");
		String payMethod =mall.paymentDoneUsing("Visa Card");
		boolean isCarryBagRequired = mall.haveCarryBag(true);
		boolean isBillRequired = mall.needBill(true);
		String sectionName=mall.decideSection(items,payMethod);
		mall.displayCutomerInfo(name,items,payMethod,sectionName);
	}

}
