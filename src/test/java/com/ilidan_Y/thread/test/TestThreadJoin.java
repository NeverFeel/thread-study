package com.ilidan_Y.thread.test;

import com.ilidan_Y.thread.ThreadJoin;

/**
 * 
* @ClassName: TestThreadJoin 
* @Description: join 测试
* @author ilidan_Y
* @date 2017年7月18日 下午1:06:21 
*
 */
public class TestThreadJoin {
	public static void main(String[] args) {
		//主线程开始
		System.out.println("main线程开始");
		ThreadJoin t1 = new ThreadJoin("A");
		ThreadJoin t2 = new ThreadJoin("B");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//主线程结束
		System.out.println("main线程开始");
	}
}
