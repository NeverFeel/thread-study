package com.ilidan_Y.thread.test;

import com.ilidan_Y.thread.RunnableDataShare;

/**
 * 
* @ClassName: TestRunnableDataShare 
* @Description: 测试runnable数据是否共享
* @author ilidan_Y
* @date 2017年7月17日 下午5:47:10 
*
 */
public class TestRunnableDataShare {
	
	public static void main(String[] args) {
		//数据共享
//		RunnableDataShare rds = new RunnableDataShare("A");
//		Thread t1 = new Thread(rds);
//		Thread t2 = new Thread(rds);
//		t1.start();
//		t2.start();
		//数据不共享
		RunnableDataShare rds = new RunnableDataShare("A");
		RunnableDataShare rds2 = new RunnableDataShare("B");
		Thread t1 = new Thread(rds,"t1");
		Thread t2 = new Thread(rds2,"t2");
		t1.start();
		t2.start();
	}

}
