package ornek18.thread;

public class ThreadRunner extends Thread {

	private String name = "";

	public ThreadRunner(String ad) {

		this.name = ad;

	}

	@Override
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Thread " + name + " baþladý");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + name + " " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
