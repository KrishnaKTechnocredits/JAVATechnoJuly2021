package devendra_c;

public class A9_Shop {
	static int maggieUnits, dosaUnits, oilPouchUnits, paniPuriUnits, masalaPackUnits;
	String customerName;
	int customerID;

	/*Pick up transactions*/
	void itemPickUp(int maggieNos, int dosaNos, int oilNos, int panipuriNos, int masalaNos) {
		if (maggieNos > A9_Shop.maggieUnits) {
			System.out.print("Maggie packets running out soon. ");
			System.out.println("Only " + A9_Shop.maggieUnits + " Maggie packets are available");
		} else
			A9_Shop.maggieUnits = A9_Shop.maggieUnits - maggieNos;

		if (dosaNos > A9_Shop.dosaUnits) {
			System.out.print("Dosa packets running out soon. ");
			System.out.println("Only " + A9_Shop.dosaUnits + " Dosa packets are available");
		} else
			A9_Shop.dosaUnits = A9_Shop.dosaUnits - dosaNos;

		if (oilNos > A9_Shop.oilPouchUnits) {
			System.out.print("Oil pouches running out soon. ");
			System.out.println("Only " + A9_Shop.oilPouchUnits + " Oil pouches are available");
		} else
			A9_Shop.oilPouchUnits = A9_Shop.oilPouchUnits - oilNos;

		if (panipuriNos > A9_Shop.paniPuriUnits) {
			System.out.print("Panipuri packets running out soon. ");
			System.out.println("Only " + A9_Shop.paniPuriUnits + " Panipuri packets are available");
		} else
			A9_Shop.paniPuriUnits = A9_Shop.paniPuriUnits - panipuriNos;

		if (masalaNos > A9_Shop.masalaPackUnits) {
			System.out.print("Masala packets running out soon. ");
			System.out.println("Only " + A9_Shop.masalaPackUnits + " Masala packets are available");
		} else
			A9_Shop.masalaPackUnits = A9_Shop.masalaPackUnits - masalaNos;

	}

	/*Initial stock quantity*/
	static void setInitialQuantity(int maggieCount, int dosaCount, int oilCount, int panipuriCount, int masalaCount) {
		A9_Shop.maggieUnits = maggieCount;
		A9_Shop.dosaUnits = dosaCount;
		A9_Shop.oilPouchUnits = oilCount;
		A9_Shop.paniPuriUnits = panipuriCount;
		A9_Shop.masalaPackUnits = masalaCount;
	}

	/*Out of stock status*/
	static void showOutofStockStatus() {
		if (A9_Shop.maggieUnits == 0)
			System.out.println("The Maggie packets are out of stock");
		if (A9_Shop.dosaUnits == 0)
			System.out.println("The Dosa packets are out of stock");
		if (A9_Shop.oilPouchUnits == 0)
			System.out.println("The Oil pouches are out of stock");
		if (A9_Shop.paniPuriUnits == 0)
			System.out.println("The Panipuri packets are out of stock");
		if (A9_Shop.masalaPackUnits == 0)
			System.out.println("The Masala packets are out of stock");

	}

	/*current quantity*/
	static void showCurrentStockStatus() {
		System.out.println("Currently only " + A9_Shop.maggieUnits + " Maggie packs left.");
		System.out.println("Currently only " + A9_Shop.dosaUnits + " Dosa packs left.");
		System.out.println("Currently only " + A9_Shop.oilPouchUnits + " Oil pouch left.");
		System.out.println("Currently only " + A9_Shop.paniPuriUnits + " Panipuri packs left.");
		System.out.println("Currently only " + A9_Shop.masalaPackUnits + " Masala packs left.");
	}

	void setCustomerDetails(String custName, int custID) {
		customerName = custName;
		customerID = custID;
	}

	public static void main(String[] args) {
		A9_Shop shop9 = new A9_Shop();
		shop9.setCustomerDetails("Deven D C", 540);
		A9_Shop.setInitialQuantity(50, 43, 39, 43, 73);
		shop9.itemPickUp(25, 5, 13, 32, 21);
		A9_Shop.showOutofStockStatus();
		shop9.itemPickUp(13, 12, 9, 18, 29);
		A9_Shop.showOutofStockStatus();
		shop9.itemPickUp(51, 44, 40, 44, 74);
		A9_Shop.showCurrentStockStatus();
	}
}