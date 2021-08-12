package ramkrishna;

public class SystemShop {

	static int maggie;
	static int dosa;
	static int pouches;
	static int panipuri;
	static int masala;

	void setQuantity(int qMaggie, int qDosa, int qPouches, int qPanipuri, int qMasala) {

		maggie = qMaggie;
		dosa = qDosa;
		pouches = qPouches;
		panipuri = qPanipuri;
		masala = qMasala;

	}

	void getOrderDetails(int oMaggie, int oDosa, int oPouches, int oPanipuri, int oMasala) {

		if (maggie > 0) {
			if (oMaggie <= maggie) {
				maggie = maggie - oMaggie;

			} else {
				System.out.println("\"Don't have sufficient quanity of maggie. The quantity you have requested is \"\n"
						+ "						+ maggieOrder + \" And the Available Quantity is \" + maggie);\n"
						+ "				maggieOrder = 0;\n" + "");
			}
		} else {
			System.out.println("Maggie is out of stock.");
			oMaggie = 0;

		}

		if (dosa > 0) {
			if (oDosa <= dosa) {
				dosa = dosa - oDosa;

			} else {
				System.out.println("Dont have sufficient quantity of Dosa.The quantity you have requested is " + oDosa
						+ " And the Available Quantity is " + dosa);
				oDosa = 0;
			}
		} else {
			System.out.println(" Dosa is out of stock");
			oDosa = 0;
		}

//	}

	if (pouches > 0) {
		if (oPouches <= pouches) {
			pouches = pouches - oPouches;

		} else {
			System.out.println("Dont have sufficient quantity of pouches.The quantity you have requested is "
					+ oPouches + " And the Available Quantity is " + pouches);
			oPouches = 0;
		}
	} else {
		System.out.println("Pouches is out of stock");
		oPouches = 0;

	}

	if (panipuri > 0) {
		if (oPanipuri <= panipuri) {
			panipuri = panipuri - oPanipuri;

		} else {
			System.out.println("Dont have sufficient quantity of panipuri.The quantity you have requested is "
					+ oPanipuri + " And the Available Quantity is " + panipuri);
			oPanipuri = 0;
		}
	} else {
		System.out.println("Panipuri is out of stock");
		oPanipuri = 0;
	}

	if (masala > 0) {
		if (oMasala <= masala) {
			masala = masala - oMasala;

		} else {
			System.out.println("Dont have sufficient quantity of masala.The quantity you have requested is "
					+ oMasala + " And the Available Quantity is " + oMasala);

			oMasala = 0;
		}
	} else {
		System.out.println("Masalas is out of stock");
		oMasala = 0;
	}
	System.out.println(" Hi, we have served you total : " + oMaggie + " maggie," + oDosa + " dosa,"
			+ oPouches + "pouches ," + oPanipuri + " panipuri, " + oMasala + " Masala ");
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
	if (masala > 0) {
		System.out.println("Available stock of masalas is " + masala);
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

	if (masala <= 0) {
		System.out.println("Masalas is out of stock ");
	}
}


	public static void main(String[] args) {

		SystemShop systemshop = new SystemShop();
		systemshop.setQuantity(50, 43, 39, 43, 73);
		systemshop.getOrderDetails(50, 3, 9, 3, 3);
		systemshop.availableStock();
		systemshop.outOfStock();

	}
}
