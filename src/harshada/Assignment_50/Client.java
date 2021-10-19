package harshada.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		BuilderClientProgram b1 = new BuilderClientProgram("harshada", "1234a", 101, 10000);
		BuilderClientProgram b2 = new BuilderClientProgram("Mandhare", "1234a", 100, 10000);
		BuilderClientProgram b3 = new BuilderClientProgram("aditya", "4321b", 101, 12000);
		BuilderClientProgram b4 = new BuilderClientProgram("harshada", "5678c", 102, 000);
		BuilderClientProgram b5 = new BuilderClientProgram("techno", "8765d", 103, 7000);

		ArrayList<BuilderClientProgram> setOfBuilders = new ArrayList<BuilderClientProgram>();
		setOfBuilders.add(b1);
		setOfBuilders.add(b2);
		setOfBuilders.add(b3);
		setOfBuilders.add(b4);
		setOfBuilders.add(b5);
		
		Collections.sort(setOfBuilders);
		
		System.out.println(setOfBuilders);
	}
}
