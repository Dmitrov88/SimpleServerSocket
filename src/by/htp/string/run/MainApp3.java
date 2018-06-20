package by.htp.string.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class MainApp3 {

	public static void main(String[] args) {
		
		
			File f =new File("resourses/sample.txt");
			if(!f.exists()) {
				try {
				f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
			}
		}
			byteStreamWorker(f);
			charStreamWorker(f);
			
	}
	
	public static void bufferCharStreamWorker(File f) {
		try (Reader reader = new FileReader(f);
		BufferedReader br = new BufferedReader(reader);) {
			
			System.out.println("-------------");
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void charStreamWorker(File f) {
		try {
			
            Reader reader = new FileReader(f);
			char[] array = new char [1024];
			reader.read(array);
			
			System.out.println(new String(array));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void byteStreamWorker(File f) {
			try (InputStream is = new FileInputStream(f);
			         OutputStream os=new FileOutputStream(f, true);){
				
			
				
			
			int bytes=is.available();
			System.out.println("available "+bytes);
			
			
			byte[] data = "Hello World".getBytes();
			os.write(data);
			
			bytes =is.available();
			System.out.println("available: "+bytes);
			
			int b=0;
			while((b = is.read()) > -1) {
				System.out.print((char) b);
			}
								
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}