package com.tique.taque;

public class ThreadTiqueTaque implements Runnable {

	TiqueTaque tt;
	final int Num = 5;
	Thread t = new Thread();
	public ThreadTiqueTaque(String nome, TiqueTaque tt) {
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
	}

	@Override
	public void run() {
		if (t.getName().equalsIgnoreCase("Tique")) 
		{
			for (int i=0; i<Num ;i++) {
				tt.tique(true);
			}
			tt.tique(false);
		}else {
			for (int i=0; i<Num ;i++) {
				tt.taque(true);
			}
			tt.taque(false);
		}
	}
}
