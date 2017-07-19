package com.ilidan_Y.thread;

/**
 * 
 * @ClassName: SynchronizedDemo
 * @Description: Synchronized测试demo
 * @author ilidan_Y
 * @date 2017年7月19日 上午11:19:01
 *
 */
public class SynchronizedDemo extends Thread {

	private String name;
	private Object prev;
	private Object self;

	public SynchronizedDemo(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	/*
	 *A b a
	 *B c b
	 *C a c 
	 */
	public void run() {
		int count = 10;
		while (count > 0) {
			System.out.println(count+"进入第一层同步块："+name);
			synchronized (prev) {//b 
				System.out.println(count+"进入第二层同步块："+name);
				synchronized (self) {//a	
					System.out.println(name);
					count--;
					/*
					 * 当执行notify/notifyAll方法时，
					 * 会唤醒一个处于等待该对象锁的线程，
					 * 然后继续往下执行，直到执行完
					 * 退出对象锁锁住的区域（synchronized修饰的代码块）
					 * 后再释放锁。
					 */
					self.notify();
					System.out.println("线程"+name+"的"+self+"锁被释放");
				}//a	
				try {
					/*
					 * 当线程执行wait()时，会把当前的
					 * 锁释放，然后让出CPU，当前线程
					 * 进入等待状态。
					 */
					prev.wait();//b	
					System.out.println("线程"+name+"的"+prev+"锁被释放");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
