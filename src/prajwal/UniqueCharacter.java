package prajwal;

import java.util.Scanner;

public class UniqueCharacter {

//print unique characters from user defined string
void uniqueChar(String input) {
for(int index=0; index<input.length(); index++) {
if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index)))
System.out.println(input.charAt(index));
			}
	}

public static void main(String[] args) {
UniqueCharacter unique = new UniqueCharacter();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter word: ");
String word = scanner.next();
unique.uniqueChar(word);
scanner.close();
	}

	}