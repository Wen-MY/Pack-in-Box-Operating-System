import java.util.concurrent.Semaphore;

public class Packer implements Runnable {
	private Semaphore packer;
	private Semaphore label;

	public Packer(Semaphore pack, Semaphore label) {
		this.packer = pack;
		this.label = label;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			try {
				packer.acquire();
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			System.out.println("Packer: Box-" + (++count) + " packed");
			label.release();

		}
	}
}
