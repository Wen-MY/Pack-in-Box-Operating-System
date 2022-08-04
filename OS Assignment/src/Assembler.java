//import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
public class Assembler implements Runnable{
//	private BlockingQueue<Integer> ifFull;
	private Semaphore pack;


	public Assembler(Semaphore packer) {
		pack=packer;
	}
	@Override
	public void run() {
		int count=0;
		for(int i=1;i<=6;i++) {
			System.out.println("Assembler: waiting for components");
			System.out.println("Assembler: Product-"+i+" completed.");
			
			//increase product storage
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(count%6==0) {
			//send signal to packer inform there is 6 product ready to be pack
			pack.release();
		}
	}

}
