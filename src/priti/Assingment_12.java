package priti;

class Assingment_12{
	int maggie= 50;
	int dosa = 50;
	int pouch = 60;
	int panipuri = 70;
	int chips = 50;
	int coldDrinks = 50;
	int biscuit=100;
	int ketchup = 80;
	int coffee = 200;
	int cheese = 150;
	int dairymilk= 200;
	int bread = 50;
	String custName;
	String addres;
	//String payOption1 = visaCard;
	//String payOption2 = cash;
	boolean carryBag = true;
	
	void setcustDetails(String name,String streetAddres){
		custName = name;
		addres = streetAddres;
	}	
	
	void displayCustomerInfo(){
		System.out.println("Customer Details:--");
		System.out.println("Customer Name:--" +custName);
		System.out.println("Address:--" +addres);
	
	}
		
	void itemAddedToCart1(int magQty) {
		if (magQty>maggie) {
			System.out.println("Required qty is- "+magQty+ "but max qty we have is -"+ maggie+ "so partial qty is dispatched");
			maggie = 0;
			
		}else {
			maggie = maggie- magQty;
			System.out.println("maggie--" +magQty);
		}
	}
	
	void itemAddedToCart2(int dosaQty) {
		if (dosaQty>dosa) {
			System.out.println("Required qty is- "+dosaQty+ "but max qty we have is -"+ dosa+ "so partial qty is dispatched");
			dosa = 0;
		}else {
			dosa = dosa-dosaQty;
			System.out.println("dosa--" +dosaQty);
		}
		
	}
		
	void itemAddedToCart3(int pouchQty){
		if (pouchQty>pouch) {
			System.out.println("Required qty is- "+pouchQty+ "but max qty we have is -"+ pouch+ "so partial qty is dispatched");
			pouch = 0;
			}else {
			pouch= pouch-pouchQty;
			System.out.println("pouch--" +pouchQty);
		}
	}
	
	void itemAddedToCart4(int paniQty) {
		if (paniQty>panipuri) {
			System.out.println("Required qty is- "+paniQty+ "but max qty we have is -"+panipuri+ "so partial qty is dispatched");
			panipuri = 0;
		}else {
			panipuri = panipuri-paniQty;
			System.out.println("Panipuri--" +paniQty);
		}
	}
	
	void itemAddedToCart5(int chipQty) {
		if (chipQty>chips) {
			System.out.println("Required qty is- "+chipQty+ "but max qty we have is -"+ chips+ "so partial qty is dispatched");
			chips = 0;
		}else {
			chips = chips- chipQty;
			System.out.println("Chips--" +chipQty);
		}
	}
	
	void itemAddedToCart6(int coldDrinksQty) {
		if (coldDrinksQty>coldDrinks) {
			System.out.println("Required qty is- "+coldDrinksQty+ "but max qty we have is -"+ coldDrinks+ "so partial qty is dispatched");
			coldDrinks = 0;
	}else{
			coldDrinks = coldDrinks- coldDrinksQty;
			System.out.println("ColdDrinks--" +coldDrinksQty);
		}
	}
	
	void itemAddedToCart7(int bisQty) {
		if (bisQty>biscuit) {
			System.out.println("Required qty is- "+bisQty+ "but max qty we have is -"+ biscuit+ "so partial qty is dispatched");
			biscuit = 0;
			
		}else {
			biscuit = biscuit- bisQty;
			System.out.println("biscuit--" +bisQty);
		}
	}
	void itemAddedToCart8(int ketchQty) {
		if (ketchQty>ketchup) {
			System.out.println("Required qty is- "+ketchQty+ "but max qty we have is -"+ ketchup+ "so partial qty is dispatched");
			ketchup = 0;
			
		}else {
			ketchup = ketchup- ketchQty;
			System.out.println("ketchup--" +ketchQty);
		}
	}
	
	void itemAddedToCart9(int coffeeQty) {
		if (coffeeQty>coffee) {
			System.out.println("Required qty is- "+coffeeQty+ "but max qty we have is -"+ coffee+ "so partial qty is dispatched");
			coffee = 0;
			
		}else {
			coffee = coffee- coffeeQty;
			System.out.println("coffee--" +coffeeQty);
		}
	}
	
	void itemAddedToCart10(int cheesQty) {
		if (cheesQty>cheese) {
			System.out.println("Required qty is- "+cheesQty+ "but max qty we have is -"+ cheese+ "so partial qty is dispatched");
			cheese = 0;
			
		}else {
			cheese = cheese- cheesQty;
			System.out.println("cheese--" +cheesQty);
		}
	}
	
	void itemAddedToCart11(int dairymilkQty) {
		if (dairymilkQty>dairymilk) {
			System.out.println("Required qty is- "+dairymilkQty+ "but max qty we have is -"+ dairymilk+ "so partial qty is dispatched");
			dairymilk = 0;
			
		}else {
			dairymilk = dairymilk- dairymilkQty;
			System.out.println("dairymilk--" +dairymilkQty);
		}
	}
	
	void itemAddedToCart12(int breadQty) {
		if (breadQty>bread) {
			System.out.println("Required qty is- "+breadQty+ "but max qty we have is -"+ bread+ "so partial qty is dispatched");
			bread = 0;
			
		}else {
			bread = bread- breadQty;
			System.out.println("bread--" +breadQty);
		}
	}
	
	
	void paymentDone(String payType){
		if (payType.equals("VisaCard")){
			System.out.println("Payment done using VisaCard");
		}else if (payType.equals("Cash")){
			System.out.println("Cash Payment done");
		}
	}	
	
	void descideSection(int items,String payType ){
		if(items<10 && payType.equals("Cash")){
			System.out.println("Make payment in Section 1A");
		}else if (items>10 && payType.equals("VisaCard")){
			System.out.println("Make payment in Section 1B");
		}else if (items >10 && payType.equals("Cash")){
			System.out.println("Make payment in Section 1c");
		}else if (items<10 && payType.equals("VisaCard")){
			System.out.println("Make payment in Section 1D");
		}
		
	}
	void haveCarryBag(boolean status){
		if (status == true){
			System.out.println("Please add carry bag charges to bill");
		} 
		
	}
	
	void needBill(String str){
		if (str.equals("Y")){
			System.out.println("Please print the bill");
		}
		
	}
		
	public static void main (String[] a){
		Assingment_12 assingment_12 = new Assingment_12();
		System.out.println("------------------------------------------");
		assingment_12.setcustDetails("Ritesh", "105,Bond street");
		assingment_12.displayCustomerInfo();
		assingment_12.itemAddedToCart1(10);
		assingment_12.itemAddedToCart2(15);
		assingment_12.itemAddedToCart3(20);
		assingment_12.itemAddedToCart4(25);
		assingment_12.itemAddedToCart5(15);
		assingment_12.itemAddedToCart6(30);
		assingment_12.itemAddedToCart7(18);
		assingment_12.itemAddedToCart8(22);
		assingment_12.itemAddedToCart9(25);
		assingment_12.itemAddedToCart10(30);
		assingment_12.itemAddedToCart11(5);
		assingment_12.itemAddedToCart12(1);
		System.out.println("------------------------------------------");
		assingment_12.descideSection(12, "VisaCard");
		System.out.println("------------------------------------------");
		assingment_12.paymentDone("VisaCard");
		assingment_12.haveCarryBag(false);
		assingment_12.needBill("N");
	}
}