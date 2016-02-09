package general;

public class Finally {
	public static String lem() {
		System.out.println("lem");
		return "return from lem";
	}
	
	public static String foo() {
		int x = 1;
		int y = 5;
		try
		{
			System.out.println("start try");
			int b = y / x;
			System.out.println("end try");
			return "returned from try";
		} catch (Exception ex) {
			System.out.println("catch");
			return lem() + " | returned from catch";
		} finally {
			System.out.println("finally");	
			//return "finally block"; //if this is there, the return from try/catch won't be called
		}
	}
	
	public static void bar() {
		System.out.println("start bar");
		String v = foo();
		System.out.println(v);
		System.out.println("end bar");
	}
	
	public static void main(String[] args) {
		bar();
	}

}
