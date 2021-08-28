package santosh;
class coding_Test1 {
 
    int getSumOfDigits(String inputArray){
        int sum = 0;
		for (int i=0;i<inputArray.length();i++) {
        if (Character.isDigit(inputArray.charAt(i))){
        sum +=Character.getNumericValue(inputArray.charAt(i));
         
        }
        }
 
        return sum;
    }
	int getSumOfnumInArray(String[] input){
		int totalSum=0;
		for(int i=0;i<input.length;i++)
		totalSum += getSumOfDigits(input[i]);
		return totalSum;
	}
	
 
    public static void main(String[] args)
    {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        coding_Test1 t1=new coding_Test1();
        String[] inputArray = {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
        System.out.println("Total Sum of all digits available in String aaray is="+t1.getSumOfnumInArray(inputArray));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
 
