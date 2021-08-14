// Assignment 9  DATE: 08/11/2021
package deepakkankhar;

public class Assignment9 {
	static int maggieCnt;
	static int dosaCnt;
	static int oilPouchesCnt;
	static int paniPuriCnt;
	static int masalasCnt;
	
	String item1="Maggie";
	String item2="Dosa";
	String item3="Oil Pouches";
	String item4="Panipuri";
	String item5="Masalas";
	
	static void setStocks(int maggieCnt1, int dosaCnt1, int oilPouchesCnt1, int paniPuriCnt1, int masalasCnt1) {
		maggieCnt=maggieCnt1;
		dosaCnt=dosaCnt1;
		oilPouchesCnt=oilPouchesCnt1;
		paniPuriCnt=paniPuriCnt1;
		masalasCnt=masalasCnt1;
	}
	
	void purchaseMaggie(int quantity) {
		maggieCnt=maggieCnt-quantity;
		if(maggieCnt>=quantity) {
			inStock(item1, maggieCnt);
		}else
			outOfStock(item1);
	}
	
	void purchaseDosa(int quantity) {
		dosaCnt=dosaCnt-quantity;
		if(dosaCnt>=quantity) {
			inStock(item2, dosaCnt);
		}else
			outOfStock(item2);
	}
	
	void purchaseOil(int quantity) {
		oilPouchesCnt=oilPouchesCnt-quantity;
		if(oilPouchesCnt>=quantity) {
			inStock(item3, oilPouchesCnt);
		}else
			outOfStock(item3);
	}
	
	void purchasePanipuri(int quantity) {
		paniPuriCnt=paniPuriCnt-quantity;
		if(paniPuriCnt>=quantity) {
			inStock(item4, paniPuriCnt);
		}else
			outOfStock(item4);
	}
	
	void masalas(int quantity) {
		masalasCnt=masalasCnt-quantity;
		if(masalasCnt>=quantity) {
			inStock(item5, maggieCnt);
		}else
			outOfStock(item5);
	}
		
	void outOfStock(String item) {
		System.out.println(item+" is running out of stock");
	}
	
	void inStock(String item, int remainingCount) {
		System.out.println("Remaining count of "+item+": "+remainingCount);
	}
	
	public static void main(String[] args) {
		Assignment9.setStocks(50, 43, 39, 43, 73);
		Assignment9 obj1=new Assignment9();
		
		obj1.purchaseMaggie(10);
		obj1.purchaseDosa(20);
		obj1.purchaseOil(40);
		obj1.purchasePanipuri(30);
		obj1.masalas(20);
	}
}
