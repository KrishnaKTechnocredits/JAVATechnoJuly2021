// Bank Assignment Day 3
package harshada;
class Bank{
	
	float currentBalance=10000;
	
	void credit(float depositeAmout){
		currentBalance=currentBalance+depositeAmout;
		//System.out.println("Updated Balance after deposte is = "+currentBalance);
	}
	
	void debit(float debitAmout){
		currentBalance=currentBalance-debitAmout;
		//System.out.println("Updated Balance after deposte is = "+currentBalance);
	}
	
	void display(){
		System.out.println("Updated Balance after deposte/debit is = "+currentBalance);
	}
	
	public static void main(String[] a){
		Bank bank=new Bank();
		bank.credit(2000);
		bank.display();
		bank.debit(8000);
		bank.display();
		bank.credit(1000);
		bank.display();
		bank.debit(5000);
		bank.display();
		bank.credit(200000);
		bank.display();
	}
}