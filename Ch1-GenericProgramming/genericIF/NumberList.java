public class NumberList<T> implements IList<T> {
	private T[] datastore;
	private int size,pos;

	public NumberList(int numE) {
		size = numE;
		pos=0;
		datastore=(T[]) new Object[size];
	}

	public void add(T element) {
		datastore[pos]=element;
		++pos;
	}

	public T get(int n) {
		return datastore[n];
	}
}
