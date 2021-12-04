package com.semaforo;

import java.util.function.UnaryOperator;

public class Semaforo {
	private	static SinalVerde sv = new SinalVerde();
	private	static SinalAmarelo sa = new SinalAmarelo();
	private	static SinalVermelho svv = new SinalVermelho();
	private	int signal = 0;

	public static void main(String[] args) throws InterruptedException {

		while(true) {
			
			sv.run();
			sa.run();
			svv.run();
			Thread.sleep(1000);
	 
		}

	}

}
