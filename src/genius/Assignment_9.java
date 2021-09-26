package genius;

public class Assignment_9 {
	
	static int maggieqn;
	static int dosaqn;
	static int oilPouchesqn;
	static int panipuriqn;
	static int masalaqn;
	
    void setInitialQuantity(int setMaggieQuantity, int setDosaQuantity, int setOilPouchesQuantity, int panipuriQuantity, int masalaQuantity) {
    	Assignment_9.maggieqn = setMaggieQuantity;
    	Assignment_9.dosaqn = setDosaQuantity;
    	Assignment_9.oilPouchesqn = setOilPouchesQuantity;
    	Assignment_9.panipuriqn = panipuriQuantity;
    	Assignment_9.masalaqn = masalaQuantity;
    	
    }
    
    void  buyMaggie(int quantity) {
    	if(quantity>Assignment_9.maggieqn)
    		System.out.println("Item not available in the demaded quantity");
		else
			Assignment_9.maggieqn = Assignment_9.maggieqn - quantity;
    }
    
    void  buyDosa(int quantity) {
    	if(quantity>Assignment_9.dosaqn)
    		System.out.println("Item not available in the demaded quantity");
		else
			Assignment_9.dosaqn = Assignment_9.dosaqn - quantity;
    }
    
    void  buyOilPouches(int quantity) {
    	if(quantity>Assignment_9.oilPouchesqn)
    		System.out.println("Item not available in the demaded quantity");
		else
			Assignment_9.oilPouchesqn = Assignment_9.oilPouchesqn - quantity;
    }
    
    void  buyPanipuri(int quantity) {
    	if(quantity>Assignment_9.panipuriqn)
    		System.out.println("Item not available in the demaded quantity");
		else
			Assignment_9.panipuriqn = Assignment_9.panipuriqn - quantity;
    }
	
	void  buyMasala(int quantity) {
    	if(quantity>Assignment_9.masalaqn)
    		System.out.println("Item not available in the demaded quantity");
		else
			Assignment_9.masalaqn = Assignment_9.masalaqn - quantity;
    }
    
    void outOfStockitems() {
    	if(Assignment_9.maggieqn<=0) 
    		System.out.println("Maggie is out of stock");
    	if(Assignment_9.dosaqn<=0)
    		System.out.println("Dosa is out of stock");
    	if(Assignment_9.oilPouchesqn<=0)
    		System.out.println("Oil Pouches is out of stock");
    	if(Assignment_9.panipuriqn<=0)
    		System.out.println("Panipuri is out of stock");
    	if(Assignment_9.masalaqn<=0)
    		System.out.println("Masala is out of stock");
    }
    
    void availableItems() {
    	if(Assignment_9.maggieqn>0) 
    		System.out.println("Maggie is available and quantity of maggie packets is "+maggieqn);
    	if(Assignment_9.dosaqn>0)
    		System.out.println("Dosa is available and quantity of Dosa packets is "+dosaqn);
    	if(Assignment_9.oilPouchesqn>0)
    		System.out.println("Oil Pouches is available and quantity of Oil Pouches packets is "+oilPouchesqn);
    	if(Assignment_9.panipuriqn>0)
    		System.out.println("Panipuri is available and quantity of Panipuri packets is "+panipuriqn);
    	if(Assignment_9.masalaqn>0)
    		System.out.println("Masala is available and quantity of Masala packets is "+masalaqn);
    }
    
	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.setInitialQuantity(50,43,39,43,73);
		assignment_9.buyMaggie(48);
		assignment_9.buyDosa(43);
		assignment_9.buyOilPouches(39);
		assignment_9.buyPanipuri(40);
		assignment_9.buyMasala(63);
		assignment_9.outOfStockitems();
		assignment_9.availableItems();
		

	}

}
