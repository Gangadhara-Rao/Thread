package Threads;

public class MultiThread1 extends Thread{
	public void run() {
		for(int i=2;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			System.out.println("thread working"+i+"  "+Thread.currentThread().getName()+"    "+Thread.currentThread().getPriority()+"   "+Thread.currentThread().isDaemon());
		}
		
	}

	public static void main(String[] args) {
		Thread t1= new MultiThread1();
		
		t1.setName("t1");
		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);
		//t1.setDaemon(true);
		
		
		

	}

}
