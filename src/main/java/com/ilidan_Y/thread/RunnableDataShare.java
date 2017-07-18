package com.ilidan_Y.thread;

public class RunnableDataShare implements Runnable {

	private String name;
	private int count = 5;
	public RunnableDataShare(String name) {
		this.name = name;
	}
	public void run() {
		
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName() +" "+count--);
			try {
				Thread.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
