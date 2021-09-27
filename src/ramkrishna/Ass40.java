package ramkrishna;

public class Ass40 {

	void getNumbersFromString(String str){
 		String arr[]=new String[str.length()];
 		arr=str.split(" ");
 		for(int index=0;index<arr.length;index++){
 			try{
 				int num=Integer.parseInt(arr[index]);
 				System.out.println(num);
 			}
 		catch(NumberFormatException ne){
 				
 			}
 		}
 	}

 	public static void main(String[] args){
 		Ass40 numbrtstring = new Ass40();
 		numbrtstring.getNumbersFromString("I have 5 years and 3 months of exp");
 		numbrtstring.getNumbersFromString("I have 15 years and 9 months of exp");
 	}
 }
