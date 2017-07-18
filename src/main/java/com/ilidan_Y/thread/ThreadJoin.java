package com.ilidan_Y.thread;

/**
 * 
* @ClassName: ThreadJoin 
* @Description: 
* join 主线程等待子线程的终止，
* 也就是在子线程调用了join()方法后面的代码，
* 只有等到子线程结束了才能执行。
* @author ilidan_Y
* @date 2017年7月18日 下午1:01:15 
*
 */
public class ThreadJoin extends Thread {

	private int count = 5;
	private String name;
	public ThreadJoin(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name+"运行开始");
		for(int i=0; i<5; i++){
			System.out.println(name+" "+count--);
		}
		System.out.println(name+"运行结束");
	}
}
