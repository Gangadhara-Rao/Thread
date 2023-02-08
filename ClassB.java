package Threads;

public class ClassB extends Thread {
	public void run() {
		for(int i=1;i<4;i++) {
			System.out.println("run method");
		}
		
	}

	public static void main(String[] args) {
		ClassB b= new ClassB();
		b.start();
	   System.out.println("java");
		
	}

}
