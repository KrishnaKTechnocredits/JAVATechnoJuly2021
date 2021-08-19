package arti_G;
//Assignment9
public class Shop {

	int initialStocksMaggie;
	int initialStocksDosa;
	int initialStocksOilPouches;
	int initialStocksPanipuri;
	int initialStocksMasala;

	void setQuantity(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalasQ) {
		initialStocksMaggie = maggieQ;
		initialStocksDosa = dosaQ;
		initialStocksOilPouches = pouchesQ;
		initialStocksPanipuri = panipuriQ;
		initialStocksMasala = masalasQ;
	}

	void getOrderDetails(int maggiePacket, int dosaPacket, int oilPouches, int panipuriPacket, int masalaPacket) {

		if (initialStocksMaggie > 0) {
			if (maggiePacket <= initialStocksMaggie) {
				initialStocksMaggie = initialStocksMaggie - maggiePacket;

			} else {
				System.out.println(
						"Running out of stock " + maggiePacket + " but available qauntity is " + initialStocksMaggie);

			}
		} else {
			System.out.println(" Maggie is out of stock");

		}

		if (initialStocksDosa > 0) {
			if (dosaPacket <= initialStocksDosa) {
				initialStocksDosa = initialStocksDosa - dosaPacket;

			} else {
				System.out.println(
						"Running out of stock " + dosaPacket + " but available qauntity is " + initialStocksDosa);

			}
		} else {
			System.out.println(" Dosa is out of stock");

		}

		if (initialStocksOilPouches > 0) {
			if (oilPouches <= initialStocksOilPouches) {
				initialStocksOilPouches = initialStocksOilPouches - oilPouches;

			} else {
				System.out.println(
						"Running out of stock " + oilPouches + " but available qauntity is " + initialStocksOilPouches);

			}
		} else {
			System.out.println("Pouches is out of stock");

		}

		if (initialStocksPanipuri > 0) {

			if (panipuriPacket <= initialStocksPanipuri) {
				initialStocksPanipuri = initialStocksPanipuri - panipuriPacket;
			} else {
				System.out.println("Running out of stock " + panipuriPacket + " but available qauntity is "
						+ initialStocksPanipuri);
			}
		} else {
			System.out.println("Panipuri is out of stock");
		}

		if (initialStocksMasala > 0) {
			if (masalaPacket <= initialStocksMasala) {
				initialStocksMasala = initialStocksMasala - masalaPacket;

			} else {
				System.out.println(
						"Running out of stock " + masalaPacket + " but available qauntity is " + initialStocksMasala);
			}
		} else {
			System.out.println("Masalas is out of stock");
		}
		System.out.println("Dear Customer, we have these quantity and no. of items: " + maggiePacket + " Maggie,"
				+ dosaPacket + " Dosa," + panipuriPacket + " Panipuri," + oilPouches + " Oil Pouches, " + masalaPacket
				+ " Masala ");
	}

	void stockAvailable() {
		if (initialStocksMaggie > 0) {
			System.out.println("Available stock of Maggie is " + initialStocksMaggie);
		}
		if (initialStocksDosa > 0) {
			System.out.println("Available stock of Dosa is " + initialStocksDosa);
		}
		if (initialStocksDosa > 0) {
			System.out.println("Available stock of OilPouches is " + initialStocksOilPouches);
		}
		if (initialStocksPanipuri > 0) {
			System.out.println("Available stock of Panipuri is " + initialStocksPanipuri);
		}
		if (initialStocksMasala > 0) {
			System.out.println("Available stock of Masala's is " + initialStocksMasala);
		}
	}

	void outOfStock() {
		if (initialStocksMaggie <= 0) {
			System.out.println("Maggie is out of stock ");
		}
		if (initialStocksDosa <= 0) {
			System.out.println("Dosa is out of stock ");
		}
		if (initialStocksOilPouches <= 0) {
			System.out.println("Oil Pouches is out of stock ");
		}
		if (initialStocksPanipuri <= 0) {
			System.out.println("Panipuri is out of stock ");
		}

		if (initialStocksMasala <= 0) {
			System.out.println("Masala's is out of stock ");
		}
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setQuantity(50, 43, 39, 43, 73);
		shop.getOrderDetails(50, 55, 35, 43, 90);
		System.out.println("*********************************************");
		System.out.println("Products which are Available :-");
		shop.stockAvailable();
		System.out.println("*********************************************");
		System.out.println("Product which are Out of stock");
		shop.outOfStock();
	}
}