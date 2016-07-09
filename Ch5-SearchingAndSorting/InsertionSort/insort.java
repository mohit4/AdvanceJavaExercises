//program to implement insertion sort

public class insort {

		static void printArr(int[] arr) {
				for(int i=0;i<arr.length;i++)
						System.out.print(arr[i]+" ");
				System.out.println();
		}

		//algo for insertion sort
		static void insertSort(int[] arr) {
				int key,i,j;
				for(i=0;i<arr.length;i++) {
						key = arr[i];
						j=i-1;
						while(j>=0 && arr[j]>key)
						{
							arr[j+1]=arr[j];
							j=j-1;
						}
						arr[j+1]=key;
				}
		}

		public static void main(String[] args)
		{
				int[] arr = {76,34,23,90,55,10,3,89};
				printArr(arr);
				insertSort(arr);
				printArr(arr);
		}
}
