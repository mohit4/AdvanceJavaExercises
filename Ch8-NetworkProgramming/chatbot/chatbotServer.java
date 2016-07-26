import java.io.*;
import java.net.*;

public class chatbotServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(10007);
		Socket sock = server.accept();
		//input to server
		BufferedReader input = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		//output from server
		PrintStream output = new PrintStream(sock.getOutputStream());
		//input from user from server side
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(true) {
			line = input.readLine();
			if(line.equals("Bye"))
				break;
			System.out.println("Client : "+line);
			System.out.print("Server: ");
			line = br.readLine();
			output.println(line);
		}
		server.close();
		sock.close();
		input.close();
		output.close();
		br.close();
	}
}