package com.ilidan_Y.thread.test;

import com.ilidan_Y.thread.ThreadSleep2;

/**
 * 
* @ClassName: TestThreadSleep2 
* @Description: 测试sleep；
* @author ilidan_Y
* @date 2017年7月17日 下午6:32:58 
*
 */
public class TestThreadSleep2 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"线程开始！");
		ThreadSleep2 t1 = new ThreadSleep2("A");
		ThreadSleep2 t2 = new ThreadSleep2("B");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"线程结束！");
	}
	
}
