package inheritance;

public class Runner {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		a.i = 5;
		a.j = 10;
		//a.k = 20; //error
		
		b.i = 5;
		b.j = 10;
		b.k = 20;
		
		a.show();
		b.show();
		
		a = b;
		//a.k = 1; //error
		a.show();
		b.show();
		
		b = (B) a; //technically not valid since the casting is doing funny things
		//cannot even compile above without casting so irrelevant
		b.i = b.j = b.k = 25;
		b.show();
	}

}
