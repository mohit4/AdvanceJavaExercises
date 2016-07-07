import java.util.*;
import java.io.*;

public class Convert {

		static String binary(int number) {
				final int base = 2;
				Stack digits = new Stack();
				do {
						digits.push(number%base);
						number/=base;
				}while(number!=0);
				//now pop out and insert into string
				String bits = "";
				while(!digits.empty())
				{
						bits+=digits.peek();
						digits.pop();
				}
				return bits;
		}

		public static void main(String[] args)
		{
				int num;
				BufferedReader br = null;

				System.out.println("Enter a no : ");
				try {
						br=new BufferedReader(new InputStreamReader(System.in));
						num = Integer.parseInt(br.readLine());
						System.out.println("Binary of "+num+" is "+binary(num));
				}
				catch(IOException e)
				{
						System.out.println("Input Error!");
				}
		}
}
