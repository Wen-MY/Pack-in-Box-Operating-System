import java.util.concurrent.Semaphore;

public class Component_B implements Runnable{
	private Semaphore semB;
	public Component_B(Semaphore semB) {
		this.semB=semB;
	}
	
	@Override
	public void run() {
		for(int i=1;;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Components-B: "+"Unit-"+i+" produced");
			semB.release();
		}
	}

}
