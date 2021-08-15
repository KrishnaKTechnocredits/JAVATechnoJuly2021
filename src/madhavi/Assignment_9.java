package madhavi;

public class Assignment_9 {
	int totalMaggieCount;
	int totalDosaCount;
	int toalPouchesCount;
	int totalMasaleCount;
	int totalPanipuriCount;

	void setAvailableStock(int maggie, int dosa, int oilpouches, int panipuri, int masale) {
		totalMaggieCount = maggie;
		totalDosaCount = dosa;
		toalPouchesCount = oilpouches;
		totalPanipuriCount = panipuri;
		totalMasaleCount = masale;

	}

	void showOutOfStockItems() {

		if (totalMaggieCount == 0) {
			System.out.println("Maggie - Out of Stock");
		}
		if (totalDosaCount == 0) {
			System.out.println("Dosa - Out of Stock");
		}
		if (toalPouchesCount == 0) {
			System.out.println("Oil - Out of Stock");
		}
		if (totalPanipuriCount == 0) {
			System.out.println("Panipuri - Out of Stock");
		}
		if (totalMasaleCount == 0) {
			System.out.println("Masale - Out of Stock");
		}
	}

	void showAvailableInStockItems() {
		if (totalMaggieCount > 0) {
			System.out.println("Maggie Packets Available - " + totalMaggieCount);
		}
		if (totalDosaCount > 0) {
			System.out.println("Dosa Packets Available - " + totalDosaCount);
		}
		if (toalPouchesCount > 0) {
			System.out.println("Oil Packets Available - " + toalPouchesCount);
		}
		if (totalPanipuriCount > 0) {
			System.out.println("Panipuri Packets Available - " + totalPanipuriCount);
		}
		if (totalMasaleCount > 0) {
			System.out.println("Masale Packets Available - " + totalMasaleCount);
		}

	}

	void purchasedItems(int maggieUnits, int dosaUnits, int oilPouchUnits, int paniPuriUnits, int masaleUnits) {
		System.out.println("**********Items Ordered**********");
		System.out.println("Maggie-" + maggieUnits + "\n" + "Dosa- " + dosaUnits + "\n" + "Oil- " + oilPouchUnits + "\n"
				+ "Panipuri- " + paniPuriUnits + "\n" + "Masala- " + masaleUnits);

		// Purchase Maggie
		if (totalMaggieCount >= maggieUnits) {
			totalMaggieCount = totalMaggieCount - maggieUnits;
		} else if (maggieUnits > totalMaggieCount && totalMaggieCount != 0) {
			System.out.println("Only " + totalMaggieCount + " Maggie Packets available in stock");
		} else if (totalMaggieCount == 0) {
			System.out.println("Maggie Packets running out of stock");
		}

		// Purchase Dosa
		if (totalDosaCount >= dosaUnits) {
			totalDosaCount = totalDosaCount - dosaUnits;
		} else if (dosaUnits > totalDosaCount && totalDosaCount != 0) {
			System.out.println("Only " + totalDosaCount + " Dosa Packets available in stock");
		} else if (totalDosaCount == 0) {
			System.out.println("Dosa Packets running out of stock");
		}

		// Purchase oil packets
		if (toalPouchesCount >= oilPouchUnits) {
			toalPouchesCount = toalPouchesCount - oilPouchUnits;
		} else if (oilPouchUnits > toalPouchesCount && toalPouchesCount != 0) {
			System.out.println("Only " + toalPouchesCount + " Oil Packets available in stock");
		} else if (toalPouchesCount == 0) {
			System.out.println("Oil Packets running out of stock");
		}

		// Purchase Panipuri
		if (totalPanipuriCount >= paniPuriUnits) {
			totalPanipuriCount = totalPanipuriCount - paniPuriUnits;
		} else if (paniPuriUnits > totalPanipuriCount && totalPanipuriCount != 0) {
			System.out.println("Only " + toalPouchesCount + " Panipuri Packets available in stock");
		} else if (totalPanipuriCount == 0) {
			System.out.println("Panipuri Packets running out of stock");
		}

		// Purchase Masala
		if (totalMasaleCount >= masaleUnits) {
			totalMasaleCount = totalMasaleCount - masaleUnits;
		} else if (masaleUnits > totalMasaleCount && totalMasaleCount != 0) {
			System.out.println("Only " + totalMasaleCount + " Masala Packets available in stock");
		} else if (totalMasaleCount == 0) {
			System.out.println("Masala Packets running out of stock");
		}

	}

	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.setAvailableStock(50, 43, 39, 43, 73);
		System.out.println("**********Available Items in the Shop *************");
		assignment_9.showAvailableInStockItems();
		assignment_9.purchasedItems(50, 40, 35, 40, 75);
		System.out.println("**********Available Stock After Purchase ***********");
		assignment_9.showAvailableInStockItems();
		System.out.println("**********Out of Stock Items After Purchase*********");
		assignment_9.showOutOfStockItems();
	}
}
