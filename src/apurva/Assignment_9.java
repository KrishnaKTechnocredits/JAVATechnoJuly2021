package apurva;

public class Assignment_9 {

	static int maggie = 50;
	static int dosa = 43;
	static int pouches = 39;
	static int panipuri = 43;
	static int masala = 73;

	void outOfStock() {
		if (maggie <= 0) {
			System.out.println("1.Maggie is out of stock");
		}
		if (dosa <= 0) {
			System.out.println("2.Dosa is out of stock");
		}
		if (pouches <= 0) {
			System.out.println("3.pouches is out of stock");
		}
		if (panipuri <= 0) {
			System.out.println("4.panipuri is out of stock");
		}
		if (masala <= 0) {
			System.out.println("5.masala is out of stock");
		}
		System.out.println("***********************************************");

	}

	void availableStock() {
		if (maggie > 0) {
			System.out.println("1. Maggie is Available with quantity: " + maggie);
		}

		if (dosa > 0) {
			System.out.println("2. Dosa is Available with quantity: " + dosa);
		}

		if (pouches > 0) {
			System.out.println("3. Pouch are Available with quantity: " + pouches);
		}

		if (panipuri > 0) {
			System.out.println("4. Panipuri is Available with quantity: " + panipuri);
		}

		if (masala > 0) {
			System.out.println("5. Masala is Available with quantity: " + masala);
		}
		System.out.println("***********************************************");
	}

	void purchaseItems(int maggieQuantity, int dosaQuantity, int pouchesQuantity, int panipuriQuantity,
			int masalaQuantity) {
		if (maggie < maggieQuantity) {
			System.out.println("Maggie is out of stock");
		} else {
			maggie = maggie - maggieQuantity;
			System.out.println("Total quantity of Maggie purchased: " + maggieQuantity);
			System.out.println("Available quantity of maggie is: " + maggie);
		}
		if (dosa < dosaQuantity) {
			System.out.println("dosa is out of stock");
		} else {
			dosa = dosa - dosaQuantity;
			System.out.println("Total quantity of dosa purchased: " + dosaQuantity);
			System.out.println("Available quantity of dosa is: " + dosa);
		}

		if (pouches < pouchesQuantity) {
			System.out.println("pouches is out of stock");
		} else {
			pouches = pouches - pouchesQuantity;
			System.out.println("Total quantity of pouch purchased: " + pouchesQuantity);
			System.out.println("Available quantity of pouch are: " + pouches);
		}

		if (panipuri < panipuriQuantity) {
			System.out.println("panipuri is out of stock");
		} else {
			panipuri = panipuri - panipuriQuantity;
			System.out.println("Total quantity of panipuri purchased: " + panipuriQuantity);
			System.out.println("Available quantity of panipuri is: " + panipuri);
		}

		if (masala < masalaQuantity) {
			System.out.println("masala is out of stock");
		} else {
			masala = masala - masalaQuantity;
			System.out.println("Total quantity of masala purchased: " + masalaQuantity);
			System.out.println("Available quantity of masala is: " + masala);
		}
		System.out.println("***********************************************");
	}

	public static void main(String[] a) {
		System.out.println("              Shop              ");
		Assignment_9 assign = new Assignment_9();
		System.out.println("---User1 purchase details and remaining quantity---" + "\n");
		assign.availableStock();
		assign.purchaseItems(50, 30, 12, 5, 10);

		Assignment_9 assign1 = new Assignment_9();
		System.out.println("---User 2 purchase details and remaining quantity---" + "\n");
		assign1.outOfStock();
		assign1.availableStock();
		assign1.purchaseItems(20, 20, 17, 5, 70);

	}

}