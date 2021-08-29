package pranita;

public class SumOfDigitPresentInString {

	int getSumOfDigitsInString(String input) {
        int sum = 0;
        for (int index = 0; index < input.length(); index++) {
            if (Character.isDigit(input.charAt(index))) {
                sum += Character.getNumericValue(input.charAt(index));
            }
        }
        return sum;
    }

 

    int getSumOfDigitsInStringArray(String[] arr) {
        int arrayDigitSum = 0;
        for (int index = 0; index < arr.length; index++) {
            arrayDigitSum += getSumOfDigitsInString(arr[index]);
        }
        return arrayDigitSum;
    }

 

    public static void main(String[] args) {
        SumOfDigitPresentInString sumOfDigitPresentInString = new SumOfDigitPresentInString();
        String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
        for (int index = 0; index < input.length; index++)
            break;
        System.out.print("Sum of digit in array is " + sumOfDigitPresentInString.getSumOfDigitsInStringArray(input));
    }
}