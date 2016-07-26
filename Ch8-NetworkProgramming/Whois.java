import java.io.*;
import java.net.*;

public class Whois {
	public static void main(String[] args) throws Exception {
		//server name and port name
		Socket sock = new Socket("whois.internic.net",43);
		InputStream input = sock.getInputStream();
		OutputStream output = sock.getOutputStream();
		String strng = "infiniteskills.com\n";
		byte buffer[] = strng.getBytes();
		output.write(buffer);
		int ch;
		while((ch=input.read())!=-1) {
			System.out.print((char)ch);
		}
		sock.close();
	}
}