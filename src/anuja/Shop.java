package anuja;

class Shop{
	
	int maggie=50;
	int panip=43;
	int dosa=43; 
	int pouches=39;
	int masala=73;
	int count1,count2,count3,count4,count5=0;
	
	void setQuantityreq(int magq,int ppq,int dq,int poq,int masq) {
		if (magq<=maggie ){
			maggie=maggie-magq;
			count1++;
			availableInStock(magq,ppq,dq,poq,masq);
			count1--;
		}
		else{
			outofStock(magq,ppq,dq,masq,poq);
		}
		
		if(ppq<=panip){
			panip=panip-ppq;
			availableInStock(magq,ppq,dq,poq,masq);
		}
		 else{
			 count2++;
			 outofStock( magq, ppq,dq,masq,poq);
			 count2--;
		}
		if(dq<=dosa){
			dosa=dosa-dq;
			count3++;
			availableInStock(magq,ppq,dq,poq,masq);
			count3--;
		}
		 else {
			 count3++;
			 outofStock( magq, ppq,dq,masq,poq);
			 count3--;
		 }
		 if(poq<=pouches){
			pouches=pouches-poq;
			count4++;
			availableInStock(magq,ppq,dq,poq,masq);
			count4--;
		}
		 else {
			 count4++;
			 outofStock( magq, ppq,dq,masq,poq);
			 count4--;
		 }
		 if(masq<=masala){
			masala=masala-masq;
			count5++;
			availableInStock(magq,ppq,dq,poq,masq);
			count5--;
		}
		 else {
			 count5++;
			 outofStock( magq, ppq,dq,masq,poq);
			 count5--;
		 }
	}
		
	void outofStock(int magq,int ppq,int dq, int masq,int poq) {
		if(magq>maggie ) {
			System.out.println("Maggie Running out of stock");
			}
		if(ppq<panip) {
			System.out.println("PaniPuri Running out of stock");
			}
		if(dq>dosa) {
			System.out.println("Dosa Running out of stock");
			}
		if(poq>pouches) {
			System.out.println("Pouches Running out of stock");
			}
		if(masq>masala) {
			System.out.println("Masala Running out of stock");
			}
		}

	void availableInStock(int magq,  int ppq,int  dq,int poq,int masq){
		if(magq<maggie && count1==1) {
		System.out.println("Quantities of maggie left are "+ maggie);
		}
		if(ppq<panip && count2==1) {
		System.out.println("Quantities of Panipuri left are "+ panip);
		}
		if(dq<dosa && count3==1) {
		System.out.println("Quantities of Dosa left are "+ dosa);
		}
		if(poq<pouches && count4==1) {
		System.out.println("Quantities of Pouches left are "+ pouches);
		}
		if(masq<masala && count5==1) {
		System.out.println("Quantities of Masala left are "+ masala);
		}
	}
	
	public static void main(String args[]){
		Shop shop=new Shop();
		System.out.println("Customer");
		shop.setQuantityreq(111,2,13,4,180);
		//shop.outOfStock();
		//shop.availableInStock();
	}
}
