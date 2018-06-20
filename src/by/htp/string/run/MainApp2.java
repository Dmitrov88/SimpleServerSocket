package by.htp.string.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("resourses/sample.txt");
			if (!f.exists()) {
				f.createNewFile();
			}
			InputStream is = new FileInputStream(f);
			int bytes = is.available();
			System.out.println("availiable: " + bytes);
			
			OutputStream os = new FileOutputStream(f);
			os.write("Hello World".getBytes());
			
			bytes = is.available();
			System.out.println("available: " + bytes);
			
			int b= 0;
			while((b = is.read())>-1) {
				System.out.print((char)b);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		OutputStream os;
		
		Reader reader;
		Writer writer;

	}

}
