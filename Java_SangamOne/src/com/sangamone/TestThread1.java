package com.sangamone;

public class TestThread1 extends Thread {
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.print(" 1 ");
		}
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		TestThread1 td1=new TestThread1();
		td1.start();
	}

}
