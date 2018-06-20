package by.htp.string.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) {
		try {
			File f = new File("r/sample.txt");
			if (!f.exists()) {
				f.createNewFile();
			}
			BufferedReader br = new BufferedReader(new FileReader(f));
			System.out.println("1");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			throw new NullPointerException();
		} finally {
			
			System.out.println("finally");
		}
		System.out.println("2");
		// TODO Auto-generated method stub
		// Throwable th;
		// Exception ex;
		// Error er;
		// RuntimeException re;
		//
		//// String s = null;
		//// System.out.println("5");
		//// try {
		//// System.out.println("4");
		//// doSmth(s);
		//// System.out.println("3");
		//// }catch(Throwable t) {
		//// System.out.println("Inccorect value");
		//// }
		// System.out.println("1");
		// }
		//
		// public static void doSmth(String s) throws Throwable {
		//
		// s.charAt(15);
		//
		// throw new Throwable("Some problems") ;
		//
	}

}