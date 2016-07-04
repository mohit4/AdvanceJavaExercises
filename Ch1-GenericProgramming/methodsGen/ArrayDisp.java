public class ArrayDisp {

	static <T> void Display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "mohit";
		names[1] = "amit";
		names[2] = "mayank";
		names[3] = "lavi";
		names[4] = "poply";
		Display(names);
		Integer[] numb = new Integer[] {1,2,3,4,5};
		System.out.println();
		Display(numb);
	}
}
