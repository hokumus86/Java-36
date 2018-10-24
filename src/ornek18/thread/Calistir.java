package ornek18.thread;

public class Calistir {
	
	public static void main(String[] args) {
		System.out.println("Program Baþladý");
		ThreadRunner t1 = new ThreadRunner("Thread 1");
		ThreadRunner t2 = new ThreadRunner("Thread 2");
		
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("bekleme sona erdi");
		t2.start();
		System.out.println("Program bitti");
	}

}
