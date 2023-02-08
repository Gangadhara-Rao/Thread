package Threads;

public class MultiThread extends Thread {
	public void run() {
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println("thread started");
			}
			
		}
	}

	public static void main(String[] args) {
		Thread t1= new MultiThread();
		t1.start();

	}

}
