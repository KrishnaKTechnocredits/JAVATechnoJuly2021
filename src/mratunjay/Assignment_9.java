package mratunjay;

public class Assignment_9 {

	static int StocksOfMaggie;
	static int StocksOfDosa;
	static int StocksOfPouches;
	static int StocksOfPanipuri;
	static int StocksOfMasalas;

	void SetInitialStock(String StockName, int InitialQuantity) {

		if (StockName.equals("Maggie"))
		StocksOfMaggie = InitialQuantity;
		else if (StockName.equals("Dosa"))
		StocksOfDosa = InitialQuantity;
		else if (StockName.equals("Pouches"))
		StocksOfPouches = InitialQuantity;
		else if (StockName.equals("Panipuri"))
		StocksOfPanipuri = InitialQuantity;
		else 
		StocksOfMasalas = InitialQuantity;
	}

	void DeductRequestedQuantityFromTotalQuantity(String ItemName, int QuantityOrdered) {
		
		if (ItemName.equals("Maggie") && StocksOfMaggie > 0){
			System.out.println("Total Available stock of Maggie: " + StocksOfMaggie);
			System.out.println("Ordered quantity: " + QuantityOrdered);
			if(QuantityOrdered <= StocksOfMaggie) {
			StocksOfMaggie = StocksOfMaggie - QuantityOrdered;
		    System.out.println("Remaining stock of Maggie: " + StocksOfMaggie); 
		    }  
		    else
			System.out.println("Ordered quantity "+QuantityOrdered+" of Maggie is not available," +"current available quantity is: "+StocksOfMaggie);
		}  
		else if (ItemName.equals("Maggie") && StocksOfMaggie <= 0)
			System.out.println("Maggie running out of stock: " + StocksOfMaggie);
    

		if (ItemName.equals("Dosa") && StocksOfDosa > 0){
			System.out.println("Total Available stock of Dosa: " + StocksOfDosa);
			System.out.println("Ordered quantity: " + QuantityOrdered);
			if(QuantityOrdered <= StocksOfDosa) {
				StocksOfDosa = StocksOfDosa - QuantityOrdered;
		    System.out.println("Available stock of Dosa: " + StocksOfDosa); 
		    }  
		    else
			System.out.println("Ordered quantity "+QuantityOrdered+" of Dosa is not available," +"current available quantity is: "+StocksOfDosa);
		}  
		else if (ItemName.equals("Dosa") && StocksOfDosa <= 0)
			System.out.println("Dosa running out of stock: " + StocksOfDosa);
}
	

	void OutOfStock() {

		if (StocksOfMaggie <= 0 && StocksOfDosa <= 0 && StocksOfPouches <= 0 && StocksOfPanipuri <= 0)
			System.out.println("All the items are out of stock: " + StocksOfMaggie + "," + StocksOfDosa + ","
					+ StocksOfPouches + "," + StocksOfPanipuri);

	}
	
	void AvailableItemsAndQuantity() {

		if (StocksOfMaggie > 0)
		System.out.println("Stock of Maggie: " + StocksOfMaggie);
		if (StocksOfDosa > 0)
		System.out.println("Stock of Dosa: " + StocksOfDosa);		
		if (StocksOfPouches > 0)
		System.out.println("Stock of Pouches: " + StocksOfPouches);	
		if (StocksOfPanipuri > 0)
		System.out.println("Stock of PaniPuri: " + StocksOfPanipuri);
		if (StocksOfMasalas > 0)
			System.out.println("Stock of Masalas: " + StocksOfMasalas);
}

	public static void main(String[] args) {

		Assignment_9 A_9 = new Assignment_9();
		A_9.SetInitialStock("Maggie",50);
		A_9.SetInitialStock("Dosa",43);
		A_9.SetInitialStock("Pouches",0);
		A_9.SetInitialStock("Panipuri",0);
		A_9.SetInitialStock("Masalas",0);
		A_9.DeductRequestedQuantityFromTotalQuantity("Maggie", 20);
		A_9.DeductRequestedQuantityFromTotalQuantity("Maggie", 20);
		A_9.DeductRequestedQuantityFromTotalQuantity("Maggie", 15);
		System.out.println("============DOSA===========================================================");
		A_9.DeductRequestedQuantityFromTotalQuantity("Dosa", 20);
		A_9.DeductRequestedQuantityFromTotalQuantity("Dosa", 10);
		A_9.DeductRequestedQuantityFromTotalQuantity("Dosa", 15);
		A_9.OutOfStock();
		System.out.println("============Order from available stock and quantity=========================");
		A_9.AvailableItemsAndQuantity();
		A_9.DeductRequestedQuantityFromTotalQuantity("Maggie", 10);
		A_9.DeductRequestedQuantityFromTotalQuantity("Dosa", 13);
		A_9.OutOfStock();
	}

}
