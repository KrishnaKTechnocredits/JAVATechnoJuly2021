/* Assignment - 2 : 2nd Aug'21

*Create a class called Bank having 3 methods and one instance variable.
- expected operations - debitAmount, creditAmount, displayBalanace.
- variable balance to hold current balance.
- create only one object and call methods multiple times   */

package arti_K.Assignment_1_5;

class Bankoperations{

	int bankBalance = 10000;

	void creditAmount(int amount){
		bankBalance = bankBalance + amount;
		System.out.println("Balance after crediting amount : "+bankBalance);
	}
	
	void debitAmount(int amount){
		bankBalance = bankBalance - amount;
		System.out.println("Balance after debiting amount  : "+bankBalance);
	}
	
	void display(){
		System.out.println("Current balance is : "+bankBalance);
	}
	
	public static void main(String[] args){
		Bankoperations bankoperations = new Bankoperations();
		bankoperations.creditAmount(2000);
		System.out.println("--------------------------------------------------------");
		bankoperations.creditAmount(3000);
		System.out.println("--------------------------------------------------------");
		bankoperations.debitAmount(7000);
		System.out.println("--------------------------------------------------------");
		bankoperations.display();
	}
}