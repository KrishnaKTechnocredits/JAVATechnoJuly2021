package chandani.Interview1Program2;

import java.util.Arrays;

public class InterviewProgram2 {
	
	void isAnagram(String str1, String str2){
		String s1 = str1;
		String s2 = str2;
		char[] sc1 = s1.toLowerCase().toCharArray();
        char[] sc2 = s2.toLowerCase().toCharArray();
        
        boolean status = true;
 
        if(s1.length() != s2.length()){
            status = false;
        }else {
 
            Arrays.sort(sc1);
            System.out.println(sc1);
            Arrays.sort(sc2);
            System.out.println(sc2);
            status = Arrays.equals(sc1, sc2);
        }
        if(status){
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
	
	public static void main(String[] args){
		InterviewProgram2 interview2 = new InterviewProgram2();
		String str1 = "Chandni";
		String str2 = "hancndi";
		interview2.isAnagram(str1,str2);
		
	}

}
