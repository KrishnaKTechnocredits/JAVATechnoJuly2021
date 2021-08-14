package chandani;

class Assignment9{
	
	int maggieCnt;
	int dosaCnt;
	int  pouchesCnt;
	int panipuriCnt;
	int masalaCnt;
	
	  void setStockDetails(int maggieQty, int dosaQty, int pouchesQty, int panipuriQty,int masalaQty){
		maggieCnt = maggieQty ;
		dosaCnt = dosaQty;
		pouchesCnt = pouchesQty;
		panipuriCnt = panipuriQty;
		masalaCnt = maggieQty;
	}
	
	void maggieinStockorNot(String item,int maggieAmt){
		
		maggieCnt = maggieCnt - maggieAmt;
		if(maggieCnt <= 0){
			outOfStock(item);
		}else
			inStock(item,maggieCnt);
		}
		
	void dosainStockorNot(String item,int dosaAmt){
		
		dosaCnt = dosaCnt - dosaAmt;
		if(dosaCnt <= 0){
			outOfStock(item);
		}else
			inStock(item,dosaCnt);
		}
		
	void pouchesinStockorNot(String item,int pouchesAmt){
		
		pouchesCnt = pouchesCnt - pouchesAmt;
		if(pouchesCnt <= 0){
			outOfStock(item);
		}else
			inStock(item,pouchesCnt);
		}
	
	void panipuriinStockorNot(String item,int panipuriAmt){
		
		panipuriCnt = panipuriCnt - panipuriAmt;
		if(panipuriCnt <= 0){
			outOfStock(item);
		}else
			inStock(item,panipuriCnt);
		}
		
	void masalainStockorNot(String item,int masalaAmt){
		
		maggieCnt = masalaCnt - masalaAmt;
		if(masalaCnt <= 0){
			outOfStock(item);
		}else
			inStock(item,masalaCnt);
		}
	
	void outOfStock(String item1){			
		System.out.println(item1+" is running out of stock");	
	}
	
	void inStock(String item1,int count){
		
		System.out.println("Stock is available for " +item1 + ", Remaining " +item1+ " is " +count);

	}

	public static void main (String[] args){
		Assignment9 assignment9 = new Assignment9();
		assignment9.setStockDetails(50,43,39,43,73);
		assignment9.maggieinStockorNot("Maggie",30);
		assignment9.dosainStockorNot("Dosa",42);
		assignment9.pouchesinStockorNot("Dosa",42);
		assignment9.panipuriinStockorNot("Panipuri",30);
		assignment9.panipuriinStockorNot("Panipuri",10);
		assignment9.maggieinStockorNot("masala",70);
	}
}
