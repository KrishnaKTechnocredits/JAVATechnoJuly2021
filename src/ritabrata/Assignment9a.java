package ritabrata;

public class Assignment9a {
	static int countMaggie, countDosa, countOil, countPanipuri, countMasala;

	static void initialQuantity(int maggie, int dosa, int oil, int panipuri, int masala) {
		countMaggie=maggie;
		countDosa=dosa;
		countOil=oil;
		countPanipuri= panipuri;
		countMasala= masala;	
	}
	static void availability() {
		if (countMaggie>0)
			System.out.println("Maggie is available, total quantity is: "+countMaggie);
		else
			System.out.println("Maggie not available");
		if (countDosa>0)
			System.out.println("Dosa is available, total quantity is: "+countDosa);
		else
			System.out.println("Dosa not available");
		if (countOil>0)
			System.out.println("Oil pouch is available, total quantity is: "+countOil);
		else
			System.out.println("Oil pouch not available");
		if (countPanipuri>0)
			System.out.println("Panipuri is available, total quantity is: "+countPanipuri);
		else
			System.out.println("Panipuri not available");
		if (countMasala>0)
			System.out.println("Chat Masala is available, total quantity is: "+countMasala);
		else
			System.out.println("Chat Masala not available");
	}
	static void outOfStock() {
		if(countMaggie==0)
			System.out.println("Maggie is out of stock, sorry for the inconvenience");
		if(countDosa==0)
			System.out.println("Dosa is out of stock, sorry for the inconvenience");
		if(countPanipuri==0)
			System.out.println("Panipuri is out of stock, sorry for the inconvenience");
		if(countOil==0)
			System.out.println("Oil pouch is out of stock, sorry for the inconvenience");
		if(countMasala==0)
			System.out.println("Masala is out of stock, sorry for the inconvenience");
	}
	static void sales(int maggie, int dosa, int oil, int panipuri, int masala) {
		if(countMaggie>=0 && countDosa>=0  && countOil>=0 && countPanipuri>0 && countMasala>=0) {
			if(countMaggie>maggie)
				countMaggie= countMaggie-maggie;
			else
				System.out.println("Maggie is running out of stock");
			if(countDosa>dosa)
				countDosa= countDosa-dosa;
			else
				System.out.println("Dosa is running out of stock");
			if(countOil>oil)
				countOil= countOil-oil;
			else
				System.out.println("Oil pouch is running out of stock");
			if(countPanipuri>panipuri)
				countPanipuri= countPanipuri-panipuri;
			else
				System.out.println("Panipuri is running out of stock");
			if(countMasala>masala)
				countMasala= countMasala-masala;
			else
				System.out.println("Masala is running out of stock");
		}
		else
			System.out.println("Items not available as per demand");
	}
	
	public static void main(String[] args) {
		Assignment9a.initialQuantity(50, 60, 70, 200, 50);
		Assignment9a.sales(30, 50, 30, 150, 30);
		Assignment9a.outOfStock();
		Assignment9a.availability();
		Assignment9a.sales(20, 10, 20, 45, 2);
		Assignment9a.availability();
		Assignment9a.outOfStock();

	}
}
