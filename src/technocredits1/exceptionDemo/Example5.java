package technocredits1.exceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example5 {
	
	void m1(int num, String className) {
		String path = "D://mmk/abc.txt";
		File file = new File(path);
		try {
			FileInputStream input = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Class.forName(className); // Example2
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Example5().m1(1,"Maulik");
	}
}
