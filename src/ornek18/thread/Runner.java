package ornek18.thread;

public class Runner {
	public static void main(String[] args) {
		 Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread 1 sayaç : " +i);
				}
				
			}
		});
		 Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread 2 sayaç : " +i);
				}
			}
		});
		 System.out.println("Program Baþladý");
		 t1.start();
		 t2.start();
		 System.out.println("Program bitti");
	}

}
