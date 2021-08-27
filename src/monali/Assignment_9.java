package monali;

/*Assignment - 9 : 11th Aug'2021
Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/
class Assignment_9 {

	static int maggieQuantity;
	static int dosaQuantity;
	static int pouchesQuantity;
	static int panipuriQuantity;
	static int masalaQuantity;

	void setInitialQuantity(int maggieQty, int dosaQty, int pouchesQty, int panipuriQty, int masalaQty) {
		maggieQuantity = maggieQty;
		dosaQuantity = dosaQty;
		pouchesQuantity = pouchesQty;
		panipuriQuantity = panipuriQty;
		masalaQuantity = masalaQty;
	}

	void outOfStock() {
		System.out.println("Running out of stock");
	}

	void availableInStock(int orderedMaggieQty, int orderedDosaQty, int orderedPouchesQty, int orderedPanipuriQty,
			int orderedMasalaQty) {
		if (orderedMaggieQty <= maggieQuantity) {
			maggieQuantity = maggieQuantity - orderedMaggieQty;
			System.out.println("Available in stock " + maggieQuantity);
		} 
		else if(orderedMaggieQty>maggieQuantity) {
			System.out.println("Sorry!!!!---we have maggi in stock is only : " + maggieQuantity);
		}
			else
			outOfStock();

		if (orderedDosaQty <= dosaQuantity) {
			dosaQuantity = dosaQuantity - orderedDosaQty;
			System.out.println("Available in stock " + dosaQuantity);
		}
		else if(orderedDosaQty>dosaQuantity) {
			System.out.println("Sorry!!!!---we have dosa in stock is only : " + dosaQuantity);
		}else
			outOfStock();

		if (orderedPouchesQty <= pouchesQuantity) {
			pouchesQuantity = pouchesQuantity - orderedPouchesQty;
			System.out.println("Available in stock " + pouchesQuantity);
		} 
		else if(orderedPouchesQty>dosaQuantity) {
			System.out.println("Sorry!!!!---we have dosa in stock is only : " + dosaQuantity);
		}else
			outOfStock();

		if (orderedPanipuriQty <= panipuriQuantity) {
			panipuriQuantity = panipuriQuantity - orderedPanipuriQty;
			System.out.println("Available in stock " + panipuriQuantity);
		}else if(orderedPanipuriQty>dosaQuantity) {
			System.out.println("Sorry!!!!---we have Panipuri in stock is only : " + panipuriQuantity);
		} else
			outOfStock();

		if (orderedMasalaQty <= masalaQuantity) {
			masalaQuantity = masalaQuantity - orderedMasalaQty;
			System.out.println("Available in stock " + masalaQuantity);
		}else if(orderedMasalaQty>dosaQuantity) {
			System.out.println("Sorry!!!!---we have Masala in stock is only : " + masalaQuantity);
		} else
			outOfStock();

	}

	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.setInitialQuantity(50, 43, 39, 43, 73);
		assignment_9.availableInStock(30, 70, 29, 88, 0);
	}
}
