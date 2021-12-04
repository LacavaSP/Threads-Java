package com.semaforo;

public class SinalVermelho implements Runnable{


	@Override
	public void run() {


		try {
			System.out.println("--------------");
			System.out.println("Sinal Vermelho");
			System.out.println("--------------");
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
