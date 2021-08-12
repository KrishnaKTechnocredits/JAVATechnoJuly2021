package kumar_Ashish;

class Shop{
	int  qtyMaggie, qtyDosa, qtyPouches, qtyPanipuri, qtyMasala ;
	
	void setInStock(int passingMaggie, int passingDosa, int passingPouches, int passingPanipuri, int passingMasala ){
		qtyMaggie = passingMaggie;
		qtyDosa = passingDosa;
		qtyPouches = passingPouches;
		qtyPanipuri = passingPanipuri;
		qtyMasala = passingMasala;
	}
	void purchase(int buyingMaggie, int buyingDosa, int buyingPouches, int buyingPanipuri, int buyingMasala){
		
		if (buyingMaggie >= qtyMaggie)
			qtyMaggie = qtyMaggie - buyingMaggie;
		else 
			qtyMaggie = qtyMaggie - buyingMaggie;
		
		if (buyingDosa >= qtyDosa)
			qtyDosa = qtyDosa - buyingDosa;
		else 
			qtyDosa = qtyDosa - buyingDosa;
		
		if (buyingPouches >= qtyPouches)
			qtyPouches = qtyPouches - buyingPouches;
		else 
			qtyPouches = qtyPouches - buyingPouches;
		
		if (buyingPanipuri >= qtyPanipuri)
			qtyPanipuri = qtyPanipuri - buyingPanipuri;
		else 
			qtyPanipuri = qtyPanipuri - buyingPanipuri;
		
		if (buyingMasala >= qtyMasala)
			qtyMasala = qtyMasala - buyingMasala;
		else 
			qtyMasala = qtyMasala - buyingMasala;
			
	}
	
	void outOfStock(){
		if (qtyMaggie < 0)
			System.out.println("Maggie is out of stock");
		if (qtyDosa < 0)
			System.out.println("Dosa out of stock");
		if (qtyPouches < 0)
			System.out.println("Pouches out of stock");
		if (qtyPanipuri < 0)
			System.out.println("Panipuri out of stock");
		if (qtyMasala < 0)
			System.out.println("Masala out of stock");
		
	}
		

	void availInStock(){
		if (qtyMaggie > 0)
			System.out.println("remaining maggie is  " + qtyMaggie);
		else 
			System.out.println("Customer has purchased all the maggie as he was asking extra " + (-1)*qtyMaggie + " Maggie");
			
		if (qtyDosa >=0)
			System.out.println("remaining Dosa is  " + qtyDosa);
		else 
			System.out.println("Customer has purchased all the Dosa as he was asking extra " + (-1)*qtyDosa + " Dosa");
			
		if (qtyPouches >=0)
			System.out.println("remaining Pouches is  " + qtyPouches);
		else 
			System.out.println("Customer has purchased all the Pouches as he was asking extra " + (-1)*qtyPouches + " Pouches");
			
		if (qtyPanipuri >=0)
			System.out.println("remaining Panipuri is  " + qtyPanipuri);
		else 
			System.out.println("Customer has purchased all the Panipuri as he was asking extra " + (-1)*qtyPanipuri + " Panipuri");
			
		if (qtyMasala >=0)
			System.out.println("remaining Masala is  " + qtyMasala);
		else 
			System.out.println("Customer has purchased all the Masala as he was asking extra " + (-1)*qtyMasala + " Masala");
		}
	
	
	public static void main(String[] args)
	{
		Shop shop = new Shop();
		
		shop.setInStock(50,43, 39, 43, 73);
		System.out.println("Items which are Available in Shop are: " + "\n" + shop.qtyMaggie +  " Maggie "+ shop.qtyDosa + " Dosa " + shop.qtyPouches + " Pouches " + shop.qtyPanipuri + " Panipuri " + shop.qtyMasala + " Masala " );
		shop.purchase(57,66, 30, 25, 787 );
		System.out.println("Items which are out of Stock");
		System.out.println("-------------------- " );
		shop.outOfStock();
		System.out.println("Items Now Available  after Purchasing are" );
		System.out.println("-------------------- " );
		shop.availInStock();
		

	}
	
	
}



	