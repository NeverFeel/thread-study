package com.ilidan_Y.thread.test;

import com.ilidan_Y.thread.ThreadSleep;

/**
 * 
* @ClassName: TestThreadSleep 
* @Description: TODO 
* @author ilidan_Y
* @date 2017年7月17日 下午4:04:13 
*
 */
public class TestThreadSleep {
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep("A");
		ThreadSleep t2 = new ThreadSleep("B");
		t1.start();
		t2.start();
	}
}
