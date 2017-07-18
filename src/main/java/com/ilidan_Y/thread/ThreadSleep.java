package com.ilidan_Y.thread;

/**
 * 
* @ClassName: ThreadSleep 
* @Description: TODO 
* @author ilidan_Y
* @date 2017年7月17日 下午4:00:58 
*
 */
public class ThreadSleep extends Thread {

	private String name;
	public ThreadSleep(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(name+"运行："+i);
			try {
				Thread.sleep((long)Math.random()*10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
