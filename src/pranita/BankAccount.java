//Assignment 5
package pranita;

class BankAccount{

   void setDetails(String username,String password ,int bankaccountnumber){
   
       System.out.println("Username is :"+username); 
	   System.out.println("Password is :"+password);
	   System.out.println("Bank account no is :"+bankaccountnumber);
   
   
   }
   
   void updatePassword(String password){
	   System.out.println("Updated password is :"+password);
	   
   }
   
   void displayInfo(String username,String password ,int bankaccountnumber){
       System.out.println("Username is :"+ username); 
	   System.out.println("Updated Password is :" +password);
	   System.out.println("Bank account no is :" +bankaccountnumber);
   
   }
   
   public static void main(String[] a){
   BankAccount bankAccount=new BankAccount();
   bankAccount.setDetails("Pranita waghmare","Pranita@123",34567);
   bankAccount.updatePassword("Prani@24");
   bankAccount.displayInfo("Pranita waghmare","Prani@24",34567);
   }
  
}  




