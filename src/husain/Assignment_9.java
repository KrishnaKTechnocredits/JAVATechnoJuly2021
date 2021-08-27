package husain;

public class Assignment_9 {

	int maggieStock;
	int dosaStock;
	int oilStock;
	int puriStock;
	int masalaStock;

	void setInitialStock(int magiAmt, int dosaAmt, int oilAmt, int puriAmt, int masalaAmt) {
		maggieStock = magiAmt;
		dosaStock = dosaAmt;
		oilStock = oilAmt;
		puriStock = puriAmt;
		masalaStock = masalaAmt;
	}

	void purchaseMaggie(int magiAmt) {

		if (maggieStock == 0) {
			outOfStock("Maggie");
		} else if (magiAmt > maggieStock) {
			System.out.println("Maggie is running out of stock as quantity requested is more than available stock");
		} else {
			inStock("Maggie");
			maggieStock -= magiAmt;
			System.out.println("After purchase, there are " + maggieStock + " packets of Maggie remaining");
		}

	}

	void purchaseDosa(int dosaAmt) {

		if (dosaStock == 0) {
			outOfStock("Dosa");
		} else if (dosaAmt > dosaStock) {
			System.out.println("Dosa is running out of stock as quantity requested is more than available stock");
		} else {
			inStock("Dosa");
			dosaStock -= dosaAmt;
			System.out.println("After purchase, there are " + dosaStock + " packets of Dosa remaining");
		}

	}

	void purchaseOil(int oilAmt) {

		if (oilStock == 0) {
			outOfStock("Oil");
		} else if (oilAmt > oilStock) {
			System.out.println("Oil is running out of stock as quantity requested is more than available stock");
		} else {
			inStock("Oil");
			oilStock -= oilAmt;
			System.out.println("After purchase, there are " + oilStock + " packets of Oil remaining");
		}

	}

	void purchasePuri(int puriAmt) {

		if (puriStock == 0) {
			outOfStock("Puri");
		} else if (puriAmt > puriStock) {
			System.out.println("Puri is running out of stock as quantity requested is more than available stock");
		} else {
			inStock("Puri");
			puriStock -= puriAmt;
			System.out.println("After purchase, there are " + puriStock + " packets of Puri remaining");
		}

	}

	void purchaseMasala(int masalaAmt) {

		if (masalaStock == 0) {
			outOfStock("Masala");
		} else if (masalaAmt > masalaStock) {
			System.out.println("Masala is running out of stock as quantity requested is more than available stock");
		} else {
			inStock("Masala");
			masalaStock -= masalaAmt;
			System.out.println("After purchase, there are " + masalaStock + " packets of Masala remaining");
		}

	}

	void outOfStock(String item) {

		if (item.equalsIgnoreCase("Maggie"))
			System.out.println(item + " is out of stock");
		else if (item.equalsIgnoreCase("Dosa"))
			System.out.println(item + " is out of stock");
		else if (item.equalsIgnoreCase("Oil"))
			System.out.println(item + " is out of stock");
		else if (item.equalsIgnoreCase("Puri"))
			System.out.println(item + " is out of stock");
		else if (item.equalsIgnoreCase("Masala"))
			System.out.println(item + " is out of stock");

	}

	void inStock(String item) {
		if (item.equalsIgnoreCase("Maggie"))
			System.out.println("There are " + maggieStock + " packets of " + item + " available.");
		else if (item.equalsIgnoreCase("Dosa"))
			System.out.println("There are " + dosaStock + " packets of " + item + " available.");
		else if (item.equalsIgnoreCase("Oil"))
			System.out.println("There are " + oilStock + " packets of " + item + " available.");
		else if (item.equalsIgnoreCase("Puri"))
			System.out.println("There are " + puriStock + " packets of " + item + " available.");
		else if (item.equalsIgnoreCase("Masala"))
			System.out.println("There are " + masalaStock + " packets of " + item + " available.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_9 obj = new Assignment_9();
		obj.setInitialStock(50, 43, 39, 43, 73);
		obj.purchaseMaggie(51);
		obj.purchaseDosa(40);
		obj.purchaseOil(39);
		obj.purchaseOil(2);
		obj.purchasePuri(44);
		obj.purchaseMasala(70);
	}

}
