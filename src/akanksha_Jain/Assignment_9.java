/* Assignment - 9 : 11th Aug'2021
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

package akanksha_Jain;

public class Assignment_9 {
	static int iniMagQ, iniDosaQ, iniOilPouchesQ, iniPanipuriQ, iniMasalaQ;
	
	void setInitialQuantity(int magQ, int dosaQ, int oilPouchesQ, int panipuriQ, int masalaQ) {
		iniMagQ = magQ;
		iniDosaQ = dosaQ;
		iniOilPouchesQ = oilPouchesQ;
		iniPanipuriQ = panipuriQ;
		iniMasalaQ = masalaQ;
	}
	
	void purchaseItems(int purMagQ, int purDosaQ, int purOilPouchesQ, int purPanipuriQ, int purMasalaQ) {
		if (iniMagQ > 0 || iniDosaQ > 0 || iniOilPouchesQ > 0 || iniPanipuriQ > 0 || iniMasalaQ > 0) {
			iniMagQ = iniMagQ - purMagQ;
			iniDosaQ = iniDosaQ - purDosaQ;
			iniOilPouchesQ = iniOilPouchesQ - purOilPouchesQ;
			iniPanipuriQ = iniPanipuriQ - purPanipuriQ;
			iniMasalaQ = iniMasalaQ - purMasalaQ;
		}
		if (iniMagQ == 0)
			System.out.println("Running out of stock: Maggie");
		if (iniDosaQ == 0)
			System.out.println("Running out of stock: Dosa");
		if (iniOilPouchesQ == 0)
			System.out.println("Running out of stock: Oil Pouches");
		if (iniPanipuriQ == 0)
			System.out.println("Running out of stock: Panipuri");
		if (iniMasalaQ == 0)
			System.out.println("Running out of stock: Masala");
	}
	
	void outOfStock() {
		if (iniMagQ == 0)
			System.out.println("Out of stock: Maggie");
		if (iniDosaQ == 0)
			System.out.println("Out of Stock: Dosa");
		if (iniOilPouchesQ == 0)
			System.out.println("Out of Stock: Oil Pouches");
		if (iniPanipuriQ == 0)
			System.out.println("Out of Stock: Panipuri");
		if (iniMasalaQ == 0)
			System.out.println("Out of Stock: Masala");
	}
	
	void availableInStock() {
		System.out.println("List of items available in stock:-");
		if (iniMagQ > 0)
			System.out.println("Maggie: " + iniMagQ);
		if (iniDosaQ > 0)
			System.out.println("Dosa: " + iniDosaQ);
		if (iniOilPouchesQ > 0)
			System.out.println("Oil Pouches: " + iniOilPouchesQ);
		if (iniPanipuriQ > 0)
			System.out.println("Panipuri: " + iniPanipuriQ);
		if (iniMasalaQ > 0)
			System.out.println("Masala: " + iniMasalaQ);
	}
	
	public static void main(String[] args) {
		Assignment_9 assignment_9_1 = new Assignment_9();
		assignment_9_1.setInitialQuantity(50, 43, 39, 43, 73);
		assignment_9_1.purchaseItems(20, 30, 39, 43, 50);
		assignment_9_1.outOfStock();
		assignment_9_1.availableInStock();
	}
}
