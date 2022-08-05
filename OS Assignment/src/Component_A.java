import java.util.concurrent.Semaphore;

public class Component_A implements Runnable{
	private Semaphore semA;
	public Component_A(Semaphore semA) {
		this.semA=semA;
	}
	
	@Override
	public void run() {
		
		for(int i=1;;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Components-A: "+"Unit-"+i+" produced");
			semA.release();
		}
	}

}
