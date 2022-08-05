
//import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class Assembler implements Runnable {
//	private BlockingQueue<Integer> ifFull;
	private Semaphore pack;
	private Semaphore semA;
	private Semaphore semB;

	public Assembler(Semaphore packer, Semaphore semA, Semaphore semB) {
		this.semA = semA;
		this.semB = semB;
		pack = packer;
	}

	@Override
	public void run() {
		int count = 0;
		for (int i = 1;;i++) {
			try {
//				System.out.println("Assembler: waiting for components");
				semA.acquire();
				semB.acquire();
				Thread.sleep(2000);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}

			System.out.println("Assembler: Product-" + i + " completed.");
			count++;
			// increase product storage
			if (count % 6 == 0) {
				// send signal to packer inform there is 6 product ready to be pack
				pack.release();
			}
		}
	}

}
