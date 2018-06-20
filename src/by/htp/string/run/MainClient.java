package by.htp.string.run;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		
		try {
				
		Socket clientSocket = new Socket("localhost", 9696);
		
	//	PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
    //  writer.println("Hello Server!");
		int k = 1;
		String replacement = "Hello";
		
		// TODO read from scaner
		
		OutputStream out = clientSocket.getOutputStream();
		
		byte[] kBuffer = Integer.toString(k).getBytes();
		out.write(kBuffer.length);
		out.write(kBuffer);
		
		byte[] rBuffer = replacement.getBytes();
		out.write( rBuffer.length);
		out.write( rBuffer);

	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}