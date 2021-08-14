package nidhi;

class Nidhi_Assignment_9{
	int maggieCount = 50;
	int dosaCount =43;
	int oilPoucheCount = 39;
	int panipuriCount = 43;
	int masalaCount = 73;
	
	void outOfStock(){
		System.out.println("Out of Stock Items:");
		if (maggieCount<= 0){
			System.out.println("Maggie");
		}
		if (dosaCount<= 0){
			System.out.println("Dosa");
		}
		if (oilPoucheCount<= 0){
			System.out.println("Oil Pouch");
		}
		if (panipuriCount<= 0){
			System.out.println("Pani Puri");
		}
		if (masalaCount<= 0){
			System.out.println("Masala");
		}
	}
	
	void availableStock(){
		System.out.println("Available in Stock Items:");
		if (maggieCount > 0){
			System.out.println(maggieCount+ " Maggie");
		}
		if (dosaCount > 0){
			System.out.println(dosaCount + " Dosa");
		}
		if (oilPoucheCount > 0){
			System.out.println(oilPoucheCount + " Oil Pouch");
		}
		if (panipuriCount > 0){
			System.out.println(panipuriCount+ " Pani Puri");
		}
		if (masalaCount > 0){
			System.out.println(masalaCount + " Masala");
		}
	
	}
	
	void userShopping(int maggi, int dosa, int oil, int pani, int masala){
		
		//update maggie count
		if (maggieCount <=0){
			System.out.println("Maggie is Out of Stock");
		}
		else if (maggi > maggieCount){
			System.out.println("Only " + maggieCount + " Maggie in Stock");
		}
		else {
			maggieCount = maggieCount - maggi;
		}
		
		//update dosa count
		if (dosaCount <=0){
			System.out.println("Dosa is Out of Stock");
		}
		else if (dosa > dosaCount){
			System.out.println("Only " + dosaCount + " Dosa in Stock");
		}
		else {
			dosaCount = dosaCount - dosa;
		}
		
		//Oil count update
		if (oilPoucheCount <=0){
			System.out.println("Oil Pouch is Out of Stock");
		}
		else if (oil > oilPoucheCount){
			System.out.println("Only " + oilPoucheCount + "Oil Pouch in Stock");
		}
		else {
			oilPoucheCount = oilPoucheCount - oil;;
		}
		
		// pani puri count update
		if (panipuriCount <=0){
			System.out.println("Pani puri is Out of Stock");
		}
		else if (pani > panipuriCount){
			System.out.println("Only " + panipuriCount + " Pani Puri in Stock");
		}
		else {
			panipuriCount = panipuriCount - pani;;
		}
		// masala count update
		if (masalaCount <=0){
			System.out.println("Masala is Out of Stock");
		}
		else if (masala > masalaCount){
			System.out.println("Only " + masalaCount + "Masala in Stock");
		}
		else {
			masalaCount = masalaCount - masala;;
		}
		
	}
	
	public static void main(String[] ar){
		Nidhi_Assignment_9 assignment9 = new Nidhi_Assignment_9();
		assignment9.userShopping(50,40,14,14,90);
		assignment9.outOfStock();
		assignment9.availableStock();
	}
	

}