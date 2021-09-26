package technocredits1.stringDemo;

public class Example10 {

	public static void main(String[] args) {
		String str = "tttgggEZch1n9oc:r1e^di1ts.%";
		
		String output = str.replaceAll("[^a-z]", "");
		System.out.println(output);
	}
}

// [^\\d] --> to remove all non numberic characters
// [\\d] --> to remove all numberic characters
// [^-+.^:,%] --> to remove all characters except special chars
// [-+.^:,%;] --> to remove all special characters
// [a-z] -> to remove all lowercase characters
// [^A-Z] -> to remove all characters expect caps letters

//