/*Create a system (Shop) which maintains each item's quantity.

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

package nasir;

public class ShopSystem {
	int maggieCount;
	int dosaCount;
	int oilPacketsCount;
	int panipuriCount;
	int masalaCount;

	public void Stocks(int maggie, int dosa, int oilPackets, int panipuri, int masala) {
		maggieCount = maggie;
		dosaCount = dosa;
		oilPacketsCount = oilPackets;
		panipuriCount = panipuri;
		masalaCount = masala;

	}

	public void availableStocks(int maggieOrder, int dosaOrder, int oilPacketsOrder, int panipuriOrder,
			int masalaOrder) {
		System.out.println("Maggie Packets");
		if (maggieOrder < maggieCount) {
			
			int remainingQuantity = maggieCount - maggieOrder;
			System.out.println("Maggies are available in stock");
			System.out.println("After selling remaining stock is " + remainingQuantity);
			

		} else if (maggieOrder >= maggieCount) {
			System.out.println("out of stock");
			System.out.println("running out of stock");
			
		} 
		System.out.println("Dosa Packets");
		if (dosaOrder < dosaCount) {
			
			int remainingQuantity = dosaCount - dosaOrder;
			System.out.println("Dosas are available in stock");
			System.out.println("After selling remaining stock is " + remainingQuantity);
		} else if (dosaOrder >= dosaCount) {
			System.out.println("out of stock");
			System.out.println("running out of stock");
		} 
		System.out.println("Oil Packets");
		if (oilPacketsOrder < oilPacketsCount) {
			
			int remainingQuantity = oilPacketsCount - oilPacketsOrder;
			System.out.println("Oil Pouches are available in stock");
			System.out.println("After selling remaining stock is " + remainingQuantity);
		} else if (oilPacketsOrder >= oilPacketsCount) {
			System.out.println("out of stock");
			System.out.println("running out of stock");
		} 
		System.out.println("Panipuri Packets");
		if (panipuriOrder < panipuriCount) {
			
			int remainingQuantity = panipuriCount - panipuriOrder;
			System.out.println("Panipuries are available in stock");
			System.out.println("After selling remaining stock is " + remainingQuantity);
		} else if (panipuriOrder >= panipuriCount) {
			System.out.println("out of stock");
			System.out.println("running out of stock");
		}
		System.out.println("Masala Packets");
		if (masalaOrder <= masalaCount) {
			
			int remainingQuantity = masalaCount - masalaOrder;
			System.out.println("Masalas are available in stock");
			System.out.println("After selling remaining stock is " + remainingQuantity);
		} else if (masalaOrder >= masalaCount) {
			System.out.println("out of stock");
			System.out.println("running out of stock");
		} 
	}

	public static void main(String[] args) {
		ShopSystem shopSystem = new ShopSystem();
		shopSystem.Stocks(80, 90, 100, 50, 70);
		shopSystem.availableStocks(70, 100, 45, 5, 4);

	}

}
