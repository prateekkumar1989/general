package general;

import java.util.Iterator;
import java.util.List;

public class GenericDemonstratorIterator<T> implements Iterator<T> {
	
	private List<T> array;
	private int current;
	
	public GenericDemonstratorIterator(GenericDemonstrator<T> genericDemonstrator) {
		this.array = genericDemonstrator.getArray();
		current = -1;
	}

	@Override
	public boolean hasNext() {
		return (current < array.size()-1 ? true : false);
	}

	@Override
	public T next() {
		return array.get(++current);
	}

}
