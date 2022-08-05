import java.util.concurrent.Semaphore;
public class Labeller implements Runnable{
	private Semaphore semLabel;
	
	public Labeller(Semaphore semLabel) {
		this.semLabel=semLabel;
	}
	

	@Override
	public void run() {
		int count=0;
		while(true) {
		try {
			semLabel.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Labeller: Box-"+(++count)+" labelled");
		
	}
	}
	//if packer signal the label as box
	

}
