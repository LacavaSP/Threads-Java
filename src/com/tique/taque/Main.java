package com.tique.taque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

		try {
			tique.t.join();
			taque.t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();}

	}

}
