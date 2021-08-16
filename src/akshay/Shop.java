package akshay;

public class Shop {
	
	static int maggie; 
	static int dosa; 
	static int pouches;
	static int panipuri;  
	static int masalas;
	
	void intialStock(int setmaggi, int setdosa, int setpouches, int setpanipuri, int setmasalas) {
		maggie = setmaggi;
		dosa = setdosa;
		pouches = setpouches;
		panipuri = setpanipuri;
		masalas = setmasalas;
	}
	
	void customer(int pickmaggi, int pickdosa, int pickpouches, int pickpanipuri, int pickmasalas) {
		maggie = maggie - pickmaggi;
		dosa = dosa - pickdosa;
		pouches = pouches - pickpouches;
		panipuri = panipuri - pickpanipuri;
		masalas = masalas - pickmasalas;
	}
	
	void outOfStock () {
		if(maggie <= 0)
			System.out.println("Maggi is outoff stock");
		if(dosa <= 0)
			System.out.println("Dosa is outoff stock");
		if(pouches <= 0)
			System.out.println("Pouches is outoff stock");
		if(panipuri <= 0)
			System.out.println("Panipuri is outoff stock");
		if(masalas <= 0)
			System.out.println("Masalas is outoff stock");
	}
	
	void availabelInStock() {
		if(maggie > 0)
			System.out.println("The availabel quantity of Maggi is: " + maggie);
		if(dosa > 0)
			System.out.println("The availabel quantity of Dosa is: " + dosa);
		if(pouches > 0)
			System.out.println("The availabel quantity of Pouches is: " + pouches);
		if(panipuri > 0)
			System.out.println("The availabel quantity of Panipuri is: " + panipuri);
		if(masalas > 0)
			System.out.println("The availabel quantity of Masala's is: " + masalas);
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.intialStock(50, 43, 39, 43, 73);
		shop.customer(47, 43, 20, 21, 70);
		shop.outOfStock();
		shop.availabelInStock();
	}
	
}