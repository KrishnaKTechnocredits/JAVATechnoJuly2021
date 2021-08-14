
package prerana;
public class Assignment9 {

	static int maggie;
	static int dosa;
	static int pouches;
	static int panipuri;
	static int masalas;

	void setQuantity(int maggieQty, int dosaQty, int pouchesQty, int panipuriQty, int masalasQty) {
		maggie = maggieQty;
		dosa = dosaQty;
		pouches = pouchesQty;
		panipuri = panipuriQty;
		masalas = masalasQty;
	}

	void getOrderDetails(int maggieP, int setDosa, int pouchesP, int panipuriP, int masalaP) {

		if (maggie > 0) {
			if (maggieP <= maggie) {
				maggie = maggie - maggieP;

			} else {
				System.out.println("available quantity is " + maggieP + " insufficient is " + maggie);
				maggieP = 0;

			}
		} else {
			System.out.println(" Maggie is out of stock");
			maggieP = 0;
		}

		if (dosa > 0) {
			if (setDosa <= dosa) {
				dosa = dosa - setDosa;

			} else {
				System.out.println("available quantity is " + setDosa
						+ " insufficient  is " + dosa);
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
				System.out.println("available quantity is " + pouchesP
						+ " Insufficient is" + pouches);
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
				System.out.println("available quantity is " + panipuriP
						+ " insufficient is" + panipuri);
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
				System.out.println("available quantity is " + masalaP
						+ " insufficient is " + masalas);

				masalaP = 0;
			}
		} else {
			System.out.println("Masalas is out of stock");
			masalaP = 0;
		}
		System.out.println("total stock are" + maggieP + " maggie," + setDosa + " dosa,"
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

		Assignment9 a = new Assignment9();
		a.setQuantity(50, 43, 39, 43, 0);
		a.getOrderDetails(50, 10, 10, 44, 78);
		a.availableStock();
		a.outOfStock();
	}
}
