
public class Component_B implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.println("Components-B: "+"Unit-"+i+" produced");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
