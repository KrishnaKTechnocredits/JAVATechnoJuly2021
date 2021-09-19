package gauravk.Test_6;
/*
Test - 6 : 10th Sep'2021
Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h										[time taken: 9 minutes]
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is
output : techno										[time taken: 12 minutes]

*/
import java.util.Arrays;
public class FindNonRepeatingWordFromString {
    
    void findingRepeatingWord(String str){
        String[] s1 = str.split(" ");
        //System.out.println(Arrays.toString(s1));
        int checker =0;
        for(int i=0; i<s1.length; i++){
          String word = s1[i];
          if(str.indexOf(s1[i])==str.lastIndexOf(s1[i])){
            System.out.println("The first unique word is "+s1[i]);
            checker++;
            break;
          }
        }
        if(checker==0)
        	System.out.println("All words are repeating.");
    }
    
    public static void main(String[] args) {
        String input = "hi this is techno gm credits this hi is";
        new FindNonRepeatingWordFromString().findingRepeatingWord(input);
    }
}