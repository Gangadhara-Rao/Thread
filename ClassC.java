package Threads;

public class ClassC {
	public void run() {
		for(int j=1;j<=5;j++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
			System.out.println("thread startd==>"+j+Thread.currentThread().getName());
		}
	}

}
