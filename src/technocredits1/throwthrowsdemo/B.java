package technocredits1.throwthrowsdemo;

import java.beans.IntrospectionException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;

public class B {
	B b = null;

	void m2() throws ArrayIndexOutOfBoundsException, InterruptedException {
		System.out.println("In B M2");
		try {
			m3();
		}finally {
			System.out.println("Finally");
			int[] arr = {10,20};
			System.out.println(arr[2]);
		}
		System.out.println("10");
		b.m3();
	}
	
	void m3() throws InterruptedException {
		System.out.println("In m3");
		int x = 10/0;
		System.out.println(x);
		Thread.sleep(3000);
	}
	
	void m4() {
		try{
			System.out.println("1");
			
		}catch(Exception e) {
		
		}
	}
}





