package Questions;

public class MultiThreading2 {

	public static void main(String[] args) {
		Multi03 mt = new Multi03();
		Thread t1= new Thread(mt);    
		Thread t2= new Thread(mt);    
       t1.start();
       t2.start();
	}

}
class Multi03 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<10;i++) {
			try {
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread  is running" + i);
		}
		
	}}