package amol_Pawar;

public class Assignment_9 {

	static int maggie;
	static int dosa;
	static int pouches;
	static int panipuri;
	static int masalas;

	void setQuantity(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalasQ) {
		maggie = maggieQ;
		dosa = dosaQ;
		pouches = pouchesQ;
		panipuri = panipuriQ;
		masalas = masalasQ;
	}

	void getOrderDetails(int maggiePackate, int setDosa, int pouchesP, int panipuriP, int masalaP) {

		if (maggie > 0) {
			if (maggiePackate <= maggie) {
				maggie = maggie - maggiePackate;

			} else {
				System.out.println("Dont have sufficient quantity of maggie.Requested maggie is " + maggiePackate
						+ " but available qauntity is " + maggie);
				maggiePackate = 0;

			}
		} else {
			System.out.println(" Maggie is out of stock");
			maggiePackate = 0;
		}

		if (dosa > 0) {
			if (setDosa <= dosa) {
				dosa = dosa - setDosa;

			} else {
				System.out.println("Dont have sufficient quantity of Dosa.Requested dosa is " + setDosa
						+ " but available qauntity is " + dosa);
				setDosa = 0;
			}
		} else {
			System.out.println(" Dosa is out of stock");
			setDosa = 0;
		}

		if (pouches > 0) {
			if (pouchesP <= pouches) {
				pouches = pouches - pouchesP;

			} else {
				System.out.println("Dont have sufficient quantity of pouches.Requested pouches is " + pouchesP
						+ " but available qauntity is " + pouches);
				pouchesP = 0;
			}
		} else {
			System.out.println("Pouches is out of stock");
			pouchesP = 0;

		}

		if (panipuri > 0) {
			if (panipuriP <= panipuri) {
				panipuri = panipuri - panipuriP;

			} else {
				System.out.println("Dont have sufficient quantity of panipuri.Requested panipuri is " + panipuriP
						+ " but available qauntity is " + panipuri);
				panipuriP = 0;
			}
		} else {
			System.out.println("Panipuri is out of stock");
			panipuriP = 0;
		}

		if (masalas > 0) {
			if (masalaP <= masalas) {
				masalas = masalas - masalaP;

			} else {
				System.out.println("Dont have sufficient quantity of masala.Requested masala is " + masalaP
						+ " but available qauntity is " + masalas);

				masalaP = 0;
			}
		} else {
			System.out.println("Masalas is out of stock");
			masalaP = 0;
		}
		System.out.println("Hello sir, we served you total : " + maggiePackate + " maggie," + setDosa + " dosa,"
				+ panipuriP + " panipuri," + pouchesP + " pouches, " + masalaP + " Masala ");
	}

	void availableStock() {
		if (maggie > 0) {
			System.out.println("Available stock of maggie is " + maggie);
		}
		if (dosa > 0) {
			System.out.println("Available stock of Dosa is " + dosa);
		}
		if (pouches > 0) {
			System.out.println("Available stock of pouches is " + pouches);
		}
		if (panipuri > 0) {
			System.out.println("Available stock of panipuri is " + panipuri);
		}
		if (masalas > 0) {
			System.out.println("Available stock of masalas is " + masalas);
		}
	}

	void outOfStock() {
		if (maggie <= 0) {
			System.out.println("Maggie is out of stock ");
		}
		if (dosa <= 0) {
			System.out.println("Dosa is out of stock ");
		}
		if (pouches <= 0) {
			System.out.println("Pouches is out of stock ");
		}
		if (panipuri <= 0) {
			System.out.println("Panipuri is out of stock ");
		}

		if (masalas <= 0) {
			System.out.println("Masalas is out of stock ");
		}
	}

	public static void main(String[] args) {

		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.setQuantity(50, 43, 39, 43, 0);
		assignment_9.getOrderDetails(50, 10, 10, 44, 78);

		System.out.println("------Product which are in stock --------- ");
		// assignment_9.getOrderDetails(40,10);
		assignment_9.availableStock();
		System.out.println("------Product which are in not in stock --------- ");
		assignment_9.outOfStock();
	}
}
/*
 * Assignment - 9 : 11th Aug'2021 Create a system (Shop) which maintains each
 * item's quantity.
 * 
 * a. Initial stocks of Maggie: 50 Maggie packets b. Initial stocks of Dosa : 43
 * packets c. Initial stocks of pouches : 39 oil packets d. Initial stocks of
 * panipuri : 43 packets e. Initial stocks of masala’s : 73 packets.
 * 
 * Expectation: 1) Only one Customer came for shopping, he picked different
 * items with different quantities, print "running out of stock" message if a
 * particular item is sold out otherwise deduct requested quantity from total
 * quantity. 2) Create a method which shows only those item which is
 * "Out of stock". 3) Create a method which shows only those item which is
 * "Available in stock" & respective quantities.
 * 
 */