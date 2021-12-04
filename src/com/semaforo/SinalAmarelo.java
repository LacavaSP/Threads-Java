package com.semaforo;

public class SinalAmarelo implements Runnable {


	@Override
	public void run() {


		try {
			System.out.println("-------------");
			System.out.println("Sinal Amarelo");
			System.out.println("-------------");
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

