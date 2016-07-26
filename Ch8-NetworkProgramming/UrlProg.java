//working with url :)
import java.net.*;
import java.io.*;

public class UrlProg{
	public static void main(String[] args) throws Exception {
		
		//when using a url we've to define its object	
		URL theURL = new URL("http://www.google.co.in");

		System.out.println("Basic info");
		System.out.println();

		//getProtocol method shows the protocol type http or tcp/ip
		System.out.println("Protocol: "+theURL.getProtocol());
		//get port shows the port no
		System.out.println("Port: "+theURL.getPort());
		//getHost shows the host
		System.out.println("Host: "+theURL.getHost());
		
		//showing the html data
		//we fetch the data after establishing the connection using
		//a URLConnection object
		URLConnection theConn = theURL.openConnection();
		int contentLen = theConn.getContentLength();
		int c;	//to store the characters as we read them
		//if there's content
		if (contentLen!=0)
		{
			System.out.println("Content: ");
			System.out.println();
			InputStream urlInput = theConn.getInputStream();
			while((c=urlInput.read())!=-1) {
				System.out.print((char)c);
			}
			urlInput.close();
		}
		else
			System.out.println("No content!");
	}
}
