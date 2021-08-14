package chandani;

class Assignment9Updated{
	
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
	
	void purchaseinStockorNot(int maggieAmt,int dosaAmt,int pouchesAmt,int panipuriAmt, int masalaAmt ){
		
		if(maggieAmt > maggieCnt)
			maggieCnt = maggieCnt - maggieAmt;	
		
		if(dosaAmt > dosaCnt)
			dosaCnt = dosaCnt - dosaAmt;
			
		if(pouchesAmt > pouchesCnt)
			pouchesCnt = pouchesCnt - pouchesAmt;
							
		if(panipuriAmt > panipuriCnt)
			panipuriCnt = panipuriCnt - panipuriCnt;
		
		if(masalaAmt > masalaCnt)
			masalaCnt = masalaCnt - masalaAmt;
			
	}
	
	void outOfStock(){
		
		if (maggieCnt <= 0)
		System.out.println("Maggie is running out of stock");
		
		if (dosaCnt <= 0)
		System.out.println("Dosa is running out of stock");
		
		if (pouchesCnt <= 0)
		System.out.println("Oil pouches is running out of stock");
		
		if (panipuriCnt <= 0)
		System.out.println("Panipuri is running out of stock");
		
		if (masalaCnt <= 0)
		System.out.println("Masala is running out of stock");
	}
	
	void inStock(){
		
		if (maggieCnt > 0)
		System.out.println("Maggie is available in stock");
		
		if (dosaCnt > 0)
		System.out.println("Dosa is available in stock");
		
		if (pouchesCnt > 0)
		System.out.println("Oil pouches is available in stock");
		
		if (panipuriCnt > 0)
		System.out.println("Panipuri is available in stock");
		
		if (masalaCnt > 0)
		System.out.println("Masala is available in stock");

	}

	public static void main (String[] args){
		Assignment9Updated assignment9Updated = new Assignment9Updated();
		assignment9Updated.setStockDetails(50,43,39,43,73);
		assignment9Updated.purchaseinStockorNot(30, 42, 42, 50, 75);
		System.out.println("Out of stock items are : \n ------- ");
		assignment9Updated.outOfStock();
		System.out.println("Items available in stock are :  \n ------- ");
		assignment9Updated.inStock();
	}
}
