package rushikesh;

public class BankSwitch {
	private int amounthdfc=1000,amounticici=1000,amountbob=1000,amountsbi=1000;
	private int creditCount,debitCount;
	private int hdfcCC,iciciCC,bobCC,sbiCC,hdfcDC,iciciDC,bobDC,sbiDC;
	
	void creditAcc(int amount,String input) {
		creditCount++;
		switch(input) {
			case "hdfc":
			case "HDFC":
			{
				hdfcCC++;
				amounthdfc+=amount;
				System.out.println("Amount in HDFC bank after credit is "+amounthdfc);
				break;
			}
			case "icici":
			case "ICICI":
			{
				iciciCC++;
				amounticici+=amount;
				System.out.println("Amount in ICICI bank after credit is "+amounticici);
				break;
			}
			case "bob":
			case "BOB":
			{
				bobCC++;
				amountbob+=amount;
				System.out.println("Amount in BOB bank after credit is "+amountbob);
				break;
			}
			case "sbi":
			case "SBI":
			{
				sbiCC++;
				amountsbi+=amount;
				System.out.println("Amount in SBI bank after credit is "+amountsbi);
				break;
			}
			default:
				System.out.println("Invalid Bank");
		}
	}
	
	void debitAcc(int amount,String input) {
		debitCount++;
		switch(input) {
		
			case "hdfc":
			case "HDFC":
			{	
				hdfcDC++;
				amounthdfc-=amount;
				System.out.println("Amount in HDFC bank after debit is "+amounthdfc);
				break;
			}
			case "icici":
			case "ICICI":
			{
				iciciDC++;
				amounticici-=amount;
				System.out.println("Amount in ICICI bank after debit is "+amounticici);
				break;
			}
			case "bob":
			case "BOB":
			{
				bobDC++;
				amountbob-=amount;
				System.out.println("Amount in BOB bank after debit is "+amountbob);
				break;
			}
			case "sbi":
			case "SBI":
			{
				sbiDC++;
				amountsbi-=amount;
				System.out.println("Amount in SBI bank after debit is "+amountsbi);
				break;
			}
			default:
				System.out.println("Invalid Bank");
		}
	}
	
	void getTotalBaln() {
		int totalBal=amounthdfc+amounticici+amountbob+amountsbi;
		System.out.println("Total balance including all banks are "+totalBal);
	}
	
	void getCreditDebitCount(){
		System.out.println("Total Credit and Debit Count are "+creditCount+" & "+debitCount);
	}
	
	void getSepCC() {
		System.out.println("Credit Count in banks are: HDFC "+hdfcCC+" ICICI "+iciciCC+" BOB "+bobCC+" SBI "+sbiCC);
	}
	
	void getSepDC() {
		System.out.println("Debit Count in banks are: HDFC "+hdfcDC+" ICICI "+iciciDC+" BOB "+bobDC+" SBI "+sbiDC);
	}
	
	public static void main(String[] args) {
		BankSwitch bankSwitch=new BankSwitch();
		bankSwitch.creditAcc(500,"hdfc");
		bankSwitch.debitAcc(500,"ICICI");
		bankSwitch.getTotalBaln();
		bankSwitch.getCreditDebitCount();
		bankSwitch.getSepCC();
		bankSwitch.getSepDC();
	}
	
}
