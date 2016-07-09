//program to implement selection sort

public class selsort {

		static void printarr(int[] arr)
		{
				for(int i=0;i<arr.length;i++)
						System.out.print(arr[i]+" ");
				System.out.println();
		}

		static void selectionSort(int[] arr) {

				int l = arr.length;
				int i,j,min;
				for(i=0;i<l-1;i++)
				{
						min=i;
						//find minimum in rest of the array
						for(j=i+1;j<l;j++)
							if(arr[j]<arr[min])
								min=j;
						//swap the min value with current
						if(min!=i)
						{
							int t = arr[min];
							arr[min] = arr[i];
							arr[i] = t;
						}
				}
		}

		public static void main(String[] args)
		{
				int[] arr = {89,45,23,76,12,99};
				printarr(arr);
				selectionSort(arr);
				printarr(arr);
		}
}

