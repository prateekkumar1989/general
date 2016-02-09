package general;

import java.util.*;

public class GenericDemonstrator<T> implements Iterable<T>{

	private List<T> array;
	
	public GenericDemonstrator(int size) {
		//array = (T[]) new Object[size];
		array = new ArrayList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return new GenericDemonstratorIterator<T>(this);
	}

	public List<T> getArray() {
		return array;
	}

	public void setArray(List<T> array) {
		this.array = array;
	}

	public void add(T i) {
		array.add(i);
	}

	@Override
	public String toString() {
		return "GenericDemonstrator array=" + array;
	}

}
