package com.ilidan_Y.thread;

/**
 * 
* @ClassName: ThreadSleep2 
* @Description: 测试sleep 
* @author ilidan_Y
* @date 2017年7月17日 下午6:32:30 
*
 */
public class ThreadSleep2  extends Thread{
	
	private String name;
	
	public ThreadSleep2(String name) {
		super(name);
		this.name = name;
	}
	
	public void run() {
		System.out.println("子线程："+Thread.currentThread().getName()+"线程开始！");
		for(int i=0; i<5; i++){
			System.out.println("子线程："+name+" "+i);
			try {
				Thread.sleep((long)Math.random()*10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"线程结束！");
	}

}
