import java.util.concurrent.Semaphore;
public class Main {
	public static void main(String [] args) {
		Semaphore packer =new Semaphore(0,true);
		Semaphore labeller= new Semaphore(0,true);
		//Thread thread=new Thread(new Component_A(),"com_A");
		//thread.start();
		Component_A a=new Component_A();
		Component_B b=new Component_B();
		Assembler ass=new Assembler(packer);
		Packer pack=new Packer(packer,labeller);
		Labeller label=new Labeller(labeller);
		new Thread(a).start();
		new Thread(b).start();
		new Thread(ass).start();
		new Thread(pack).start();
		new Thread(label).start();		
		
	}

}
