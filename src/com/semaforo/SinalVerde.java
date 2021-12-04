package com.semaforo;

public  class SinalVerde implements Runnable {


	@Override
	public void run() {


		try {
			System.out.println("-----------");
			System.out.println("Sinal Verde");
			System.out.println("-----------");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
