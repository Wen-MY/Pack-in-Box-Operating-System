import java.util.concurrent.Semaphore;
public class Main {
	public static void main(String [] args) {
		Semaphore semComponentA=new Semaphore(0,true);
		Semaphore semComponentB=new Semaphore(0,true);
		Semaphore semPack =new Semaphore(0,true);
		Semaphore semLabel= new Semaphore(0,true);
		//Thread thread=new Thread(new Component_A(),"com_A");
		//thread.start();
		Component_A a=new Component_A(semComponentA);
		Component_B b=new Component_B(semComponentB);
		Assembler ass=new Assembler(semPack,semComponentA,semComponentB);
		Packer pack=new Packer(semPack,semLabel);
		Labeller label=new Labeller(semLabel);
		new Thread(a).start();
		new Thread(b).start();
		new Thread(ass).start();
		new Thread(pack).start();
		new Thread(label).start();
	}

	//Hi wenxuan

}
