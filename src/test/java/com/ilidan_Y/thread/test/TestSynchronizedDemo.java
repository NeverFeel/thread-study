package com.ilidan_Y.thread.test;

import com.ilidan_Y.thread.SynchronizedDemo;

/**
 * 
* @ClassName: TestSynchronizedDemo 
* @Description: 测试
* @author ilidan_Y
* @date 2017年7月19日 下午2:16:24 
*
 */
public class TestSynchronizedDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		SynchronizedDemo t1 = new SynchronizedDemo("A",c,a);
		SynchronizedDemo t2 = new SynchronizedDemo("B",a,b);
		SynchronizedDemo t3 = new SynchronizedDemo("C",b,c);
		t1.start();
		Thread.sleep(100);//确保ABC顺序执行
		t2.start();
		Thread.sleep(100);
		t3.start();
		Thread.sleep(100);
	}

}
