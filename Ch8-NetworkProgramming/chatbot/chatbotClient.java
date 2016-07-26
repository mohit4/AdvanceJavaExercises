import java.io.*;
import java.net.*;

public class chatbotClient {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1",10007);
		//input to client from server
		BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
		//output from client
		PrintStream output = new PrintStream(client.getOutputStream());
		//input from user's side
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(true) {
			System.out.print("Client : ");
			line = br.readLine();
			output.println(line);
			line = input.readLine();
			System.out.println("Server : "+line);
			if(line.equals("Bye"))
				break;
		}
		client.close();
		input.close();
		output.close();
		br.close();
	}
}