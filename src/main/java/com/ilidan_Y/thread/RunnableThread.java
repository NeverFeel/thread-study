package com.ilidan_Y.thread;

/**
 * 
* @ClassName: RunnableThread 
* @Description: 实现Runnable接口
* @author ilidan_Y
* @date 2017年7月17日 下午5:16:06 
*
 */
public class RunnableThread implements Runnable {

	private String name;
	public RunnableThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println(name+" "+i);
			try {
				Thread.sleep((long)Math.random()*10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
