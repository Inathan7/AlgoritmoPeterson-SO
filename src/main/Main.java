package main;

import algoritmo.AlgoritmoPeterson;

public class Main {
	
	public static void main(String[] args) {
		
		int vez = 1;
		boolean[] flag = new boolean[2];
		flag[0] = false;
		flag[1] = false;
		
		AlgoritmoPeterson algoritmo = new AlgoritmoPeterson(vez, flag);
		
		algoritmo.processoUm();
		algoritmo.processoDois();
		
//		flag[0] = false;
//		flag[1] = false;
		
//		vez = 1;
		
//		processoUm();
//		processoDois();
	}

}
