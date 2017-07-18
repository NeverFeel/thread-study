package com.ilidan_Y.thread;

/**
 * 
* @ClassName: ThreadDataShare 
* @Description: 采用继承自Thread类，不适合资源共享
* @author ilidan_Y
* @date 2017年7月17日 下午5:26:44 
*
 */
public class ThreadDataShare extends Thread {

	private int count=5;
	private String name;
	public ThreadDataShare(String name) {
		this.name =name;
	}
	
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(name +"  count="+ count-- );
			try {
				Thread.sleep((long)Math.random()*10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
