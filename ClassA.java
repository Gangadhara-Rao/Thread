package Threads;

public class ClassA  implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("runnable interface");
		}
	}
	public static void main(String[] args) {
		ClassA a= new ClassA();
		Thread t1= new Thread(a);
		Thread t2 = new Thread();
		t1.start();
		
		System.out.println("this is main method calling to thread ");
	}

}
