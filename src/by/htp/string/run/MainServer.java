package by.htp.string.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class MainServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		try {
			System.out.println("Server started:");
			/*ServerSocket */ 
			serverSocket = new ServerSocket(9696);
			Socket clientSocket = serverSocket.accept();
			
			System.out.println("Client connected:");
			
			
			InputStream is = clientSocket.getInputStream();
			
			int kSize = is.read();
			byte[] kData = new byte[kSize];
			is.read(kData);
			System.out.println("Data recieved: " + Arrays.toString(kData));
						
			int rSize = is.read();
			byte[] rData = new byte[rSize];
			is.read(rData);
			System.out.println("Data recieved: " + Arrays.toString(rData));
			
			int k = Integer.parseInt(new String(kData));
			String replacement = new String(rData);
			System.out.println("k "+ k);
			System.out.println("replacemnt " + replacement);
		
		
			File file = new File("resourses/sample.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] fileBytes = fileInputStream.readAllBytes();
			String fileString = new String(fileBytes);
			
			System.out.println("fileString "+ fileString);
			
			
			OutputStream os = clientSocket.getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			
			
		//	writer.print("HTTP/1.1 200 \r\n");
		//	writer.print("Content-Type: text/html\r\n");
		//	writer.print("Connection closed");

			
		//	writer.print("\r\n");
		//	writer.print("<html><head></head><body><h1>Hello User!</h1></body></html>");
			
		    } catch (IOException e) {
				e.printStackTrace();
			} finally {
				serverSocket.close();
			}
		}

	

}
