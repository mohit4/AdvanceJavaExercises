//program to perform bubble sort
import java.io.*;

public class BubbleSort {

		static void bubblesort(int[] arr) {

				for(int i=0;i<arr.length-1;i++)
						for(int j=i+1;j<arr.length;j++)
								if(arr[j]<arr[i])
								{
									int t = arr[i];
									arr[i] = arr[j];
									arr[j] = t;
								}

		}

		public static void main(String[] args) {

				int n; //to be entered by the user
				BufferedReader br;

				try {
						br = new BufferedReader(new InputStreamReader(System.in));
						n = Integer.parseInt(br.readLine());
						int[] arr = new int[n];
						for(int i=0;i<n;i++)
								arr[i] = Integer.parseInt(br.readLine());
						//finally we call bubblesort
						bubblesort(arr);
						//printing the array
						for(int i=0;i<n;i++)
								System.out.print(arr[i]+" ");
						System.out.println();
				}
				catch(IOException except)
				{
						System.out.println("Error in input");
				}
		}
}
