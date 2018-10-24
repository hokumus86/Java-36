package testquiz;

public class Runner {
	
	public static void ClassTest(A temp){
		temp.Test();
	}
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		ClassTest(b);
		ClassTest(c);
		
	}

}
