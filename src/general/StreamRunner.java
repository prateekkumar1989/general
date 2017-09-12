package general;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamRunner {

	public void launch() {
		
		ArrayList<Integer> myList = new ArrayList<>( );
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		System.out.println("Original list: " + myList);
		
		Stream<Integer> myStream = myList.stream();
		Optional<Integer> minVal = myStream.min(Integer::compare);
		
		/*//alternate ways to provide an interface reference
		 * Optional<Integer> minVal = myStream.min( (m,n) -> m-n );
		 * Optional<Integer> minVal = myStream.min(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		 */
		if(minVal.isPresent()) System.out.println("Minimum value: " + minVal.get());
		
		myStream = myList.stream(); 
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if(maxVal.isPresent()) System.out.println("Maximum value: " + maxVal.get());

		Stream<Integer> sortedStream = myList.stream().sorted();
		System.out.print("Sorted stream: "); 
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
		System.out.print("Odd values: ");
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		oddVals = myList.stream().filter( (n) -> (n % 2) == 1).filter((n) -> n > 5);
		System.out.print("Odd values greater than 5: ");
		oddVals.forEach((n) -> System.out.print(n + " ") );
		System.out.println();
		
		Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
		if(productObj.isPresent())
		System.out.println("Product as Optional: " + productObj.get());
		int product = myList.parallelStream().reduce(1, (a,b) -> a*b);
		System.out.println("Product as int: " + product);
		
		Double doubleStream = myList.stream().map((a) -> Math.sqrt(a)).reduce(1.0, (a,b) -> a*b);
		System.out.println("Product of square roots: " + doubleStream);
		
	}

}
