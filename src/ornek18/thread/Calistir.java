package ornek18.thread;

public class Calistir {
	
	public static void main(String[] args) {
		System.out.println("Program Baþladý");
		ThreadRunner t1 = new ThreadRunner("Thread 1");
		ThreadRunner t2 = new ThreadRunner("Thread 2");
		t1.run();
		t2.run();
		System.out.println("Program bitti");
	}

}
