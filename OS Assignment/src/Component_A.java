
public class Component_A implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.println("Components-A: "+"Unit-"+i+" produced");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
