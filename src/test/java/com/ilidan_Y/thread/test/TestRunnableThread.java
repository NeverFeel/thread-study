package com.ilidan_Y.thread.test;

import com.ilidan_Y.thread.RunnableThread;

/**
 * 
* @ClassName: TestRunnableThread 
* @Description: 测试
* @author ilidan_Y
* @date 2017年7月17日 下午5:16:01 
*
 */
public class TestRunnableThread {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableThread("C"));
		Thread t2 = new Thread(new RunnableThread("D"));
		t1.start();
		t2.start();
	}

}
