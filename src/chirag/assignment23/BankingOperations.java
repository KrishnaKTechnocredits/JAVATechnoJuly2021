package chirag.assignment23;

public class BankingOperations {

	static int totalDbitCount;
	static int totalCreditCount;
	int sbiBalance = 13000,iciciBalance=15000,hdfcBalance=18000,axisBalance=12000;
	int sbiDebit,sbiCredit,iciciDebit,iciciCredit,hdfcDebit,hdfcCredit,axisDebit,axisCredit;
	int totalSbiDebitCount,totalSbiCreditCount,totalIciciDebitCount,totalIciciCreditCount,totalHdfcDebitCount,totalHdfcCreditCount,
	totalAxisDebitCount,totalAxisCreditCount;
	
	void processData(String bankOperations,String bName,int bankDebitCredit) {
		int amount = bankDebitCredit;
		String operations = bankOperations;
		String bankName = bName;
		
		switch (operations) {
		case "debit":{
			switch (bankName) {
			
			case "SBI": 
				sbiBalance=sbiBalance - amount;
				totalSbiDebitCount++;
				totalDbitCount++;
				break;
				
			case "ICICI": 
				iciciBalance = iciciBalance - amount;
				totalIciciDebitCount++;
				totalDbitCount++;
				break;
				
			case "HDFC":
				hdfcBalance = hdfcBalance - amount;
				totalHdfcDebitCount++;
				totalDbitCount++;
				break;
				
			case "AXIS":
				axisBalance = axisBalance - amount;
				totalAxisDebitCount++;
				totalDbitCount++;
				break;
				
			default:
				System.out.println("Invalid details");
				
			}
			}
		break;
		
		case "credit":{
			switch (bankName) {
			
			case "SBI":
				sbiBalance = sbiBalance - amount;
				totalSbiCreditCount++;
				totalCreditCount++;
				break;
				
			case "ICICI":
				iciciBalance = iciciBalance - amount;
				totalIciciCreditCount++;
				totalCreditCount++;
				break;
				
			case "HDFC":
				hdfcBalance = hdfcBalance - amount;
				totalHdfcCreditCount++;
				totalCreditCount++;
				break;
				
			case "AXIS":
				axisBalance = axisBalance - amount;
				totalAxisCreditCount++;
				totalCreditCount++;
				break;

			default:
				System.out.println("Invalid details");
			}
			break;
		}
		default:
			System.out.println("Invalid operation");
		}
		}
	void displayBalance() {
		int totalBalance = sbiBalance + iciciBalance + hdfcBalance + axisBalance;
		System.out.println("Total Blanace : "+totalBalance);
		System.out.println("------------------------------");
	}
	void displayTotalDebitAndCredit() {
		System.out.println("Total debit : "+totalDbitCount);
		System.out.println("------------------------------");
		System.out.println("Total credit : "+totalCreditCount);
		System.out.println("------------------------------");
	}
	void totalDisplayDebitCredit() {
		System.out.println("Total Debit : "+totalDbitCount);
		System.out.println("Total Credit : "+ totalCreditCount);
	}
	void individualBankDebitOperations() {
		System.out.println("SBI bank debit operations : "+totalSbiDebitCount);
		System.out.println("ICICI bank debit operations : "+totalIciciDebitCount);
		System.out.println("HDFC bank debit operations : "+totalHdfcDebitCount);
		System.out.println("AXIS bank debit operations : "+totalAxisDebitCount);
		System.out.println("------------------------------");
	}
	void individualBankCreditOperations() {
		System.out.println("SBI bank credit operations : "+totalSbiCreditCount);
		System.out.println("ICICI bank credit operations : "+totalIciciCreditCount);
		System.out.println("HDFC bank credit operations : "+totalHdfcCreditCount);
		System.out.println("AXIS bank credit operations : "+totalAxisCreditCount);
	}
	public static void main(String[] args) {
		BankingOperations bankingOperations = new BankingOperations();
		bankingOperations.processData("debit", "SBI",3000);
		bankingOperations.processData("credit","SBI",1000);
		bankingOperations.processData("debit","ICICI",1500);
		bankingOperations.processData("credit","ICICI",700);
		bankingOperations.processData("debit","HDFC",500);
		bankingOperations.processData("credit","HDFC",1200);
		bankingOperations.processData("debit","AXIS",1300);
		bankingOperations.processData("credit","AXIS",1100);
		bankingOperations.processData("debit","SBI",650);
		bankingOperations.processData("debit","SBI", 780);
		bankingOperations.displayBalance();
		bankingOperations.displayTotalDebitAndCredit();
		bankingOperations.processData("debit","HDFC",200);
		bankingOperations.processData("credit","ICICI",100);
		bankingOperations.processData("debit","ICICI",880);
		bankingOperations.processData("credit","AXIS",600);
		bankingOperations.processData("debit","AXIS",900);
		bankingOperations.processData("credit","SBI",1100);
		bankingOperations.processData("debit","SBI",200);
		bankingOperations.individualBankDebitOperations();
		bankingOperations.individualBankCreditOperations();
	}
	}
