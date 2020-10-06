package algoritmo;

public class AlgoritmoPeterson{
	
	private int vez;
	private boolean[] flag = new boolean[2];
	
	public AlgoritmoPeterson(int vez, boolean[] flag) {
		this.vez = vez;
		this.flag = flag;
	}
	
	public void processoUm() {
		flag[0] = true;
		vez = 1;
		
		while (vez == 1 && flag[1]);
		System.out.println("---> Processo 1 est� na zona cr�tica <---");
		
		
		flag[0] = false;
		System.out.println("---> Processo 1 saiu da zona cr�tica <---");
	
	}
	
	public void processoDois() {
		flag[1] = true;
		vez = 0;
		
		while (vez == 0 && flag[0]);
			System.out.println("---> Processo 2 est� na zona cr�tica <---");
		
		
		flag[1] = false;
		System.out.println("---> Processo 2 saiu da zona cr�tica <---");
		
	}

}
