package sameer;

public class Assignment9 {
	int maggieAvailableQty;
	int dosaAvailableQty;
	int pouchesAvailableQty;
	int panipuriAvailableQty;
	int masalaAvailableQty;

	void inStockQty(int magQty, int dsQty, int pchQty, int panQty, int mslQty) {
		maggieAvailableQty = magQty;
		dosaAvailableQty = dsQty;
		pouchesAvailableQty = pchQty;
		panipuriAvailableQty = panQty;
		masalaAvailableQty = mslQty;
	}

	void orderQuantity(int maggieOrderQty, int dosaOrderQty, int pochesOrderQty, int panipuriOrderQty,
			int masalaOrderQty) {
		if (maggieOrderQty <= maggieAvailableQty) {
			int reamainingQty = maggieAvailableQty - maggieOrderQty;
			System.out.println("Maggie is available in the stock");
			System.out.println("Maggie quantity available in the stock is :" + reamainingQty);
		} else {
			System.out.println("Maggie running out of stock");
		}
		if (dosaOrderQty <= dosaAvailableQty) {
			int reamainingQty = dosaAvailableQty - dosaOrderQty;
			System.out.println("Dosa is available in the stock");
			System.out.println("Dosa quantity available in the stock is :" + reamainingQty);
		} else {
			System.out.println("Dosa running out of stock");
		}
		if (pochesOrderQty <= pouchesAvailableQty) {
			int reamainingQty = pouchesAvailableQty - pochesOrderQty;
			System.out.println("Pouches are available in the stock");
			System.out.println("Pouches quantity available in the stock are :" + reamainingQty);
		} else {
			System.out.println("Pouches running out of stock");
		}
		if (panipuriOrderQty <= panipuriAvailableQty) {
			int reamainingQty = panipuriAvailableQty - panipuriOrderQty;
			System.out.println("Panipuri is available in the stock");
			System.out.println("Panipuri quantity available in the stock is :" + reamainingQty);
		} else {
			System.out.println("Panipuri running out of stock");
		}
		if (masalaOrderQty <= masalaAvailableQty) {
			int reamainingQty = masalaAvailableQty - masalaOrderQty;
			System.out.println("Masala is available in the stock");
			System.out.println("Masala quantity available in the stock is :" + reamainingQty);
		} else {
			System.out.println("Masala running out of stock");
		}

	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.inStockQty(50, 43, 39, 43, 73);
		assignment9.orderQuantity(60, 35, 45, 20, 60);
		
	}
}
