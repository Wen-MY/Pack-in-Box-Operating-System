import java.util.concurrent.Semaphore;
public class Labeller implements Runnable{
	private Semaphore label;
	
	public Labeller(Semaphore label) {
		this.label=label;
	}
	

	@Override
	public void run() {
		try {
			label.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Box is labelled");
		
	}
	//if packer signal the label as box
	

}
