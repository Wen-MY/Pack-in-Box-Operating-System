import java.util.concurrent.Semaphore;
public class Packer implements Runnable{
	private Semaphore packer;
	private Semaphore label;
	
	public Packer(Semaphore pack,Semaphore label) {
		this.packer=pack;
		this.label=label;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		try {
			packer.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("6 units into a box");
		label.release();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	//if product storage =6 then pack 1 box
	public void clear_block_queue() {
		
	}

}
