package Questions;

public class MultiThreading {

	public static void main(String[] args)  {
	Multi01 mt1 = new Multi01();
	Multi02 mt2 = new Multi02();
	Thread t1 = new Thread(mt1);
	Thread t2 = new Thread(mt2);
	t1.start();
	
	t2.start();

	}

}
class Multi01 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread First is running" + i);
		}
		
	}}
class Multi02 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Thread Second is running" + i);
		}
		
		
	}}