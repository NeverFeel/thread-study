package com.ilidan_Y.thread;

/**
 * 
 * @ClassName: RunnableInnerClass
 * @Description: 测试方法中的匿名线程
 * @author ilidan_Y
 * @date 2017年7月18日 下午1:34:21
 *
 */
public class RunnableInnerClass {

	private String getName(final String name) {//必须指定局部变量为final，
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello, " + name+"!");
			}
		}).start();

		return name;
	}

}
