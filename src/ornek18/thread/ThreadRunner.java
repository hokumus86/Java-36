package ornek18.thread;

public class ThreadRunner  implements Runnable{

	private String name="";
	public ThreadRunner(String ad) {
	
		this.name=ad;
		
	}
	public void run() {
		
		System.out.println("Thread "+ name + " ba�lad�");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread "+ name + " "+ i);
		}
	}

}
