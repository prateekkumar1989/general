package general;

public class TestMem {
	
	private TestMem testmem;
	private static int counter = 0;
	
	public TestMem() {
		System.out.println("Static counter: " + counter++);
		testmem = new TestMem();
	}
	//This should recursively keep creating objects until we overflow. It does overflow.
}
