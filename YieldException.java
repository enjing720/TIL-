package kr.co.multicampus2;

public class YieldException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(3000);
		}catch (InterruptedException e) {}
		threadA.work = false;
		
		try {Thread.sleep(3000);
		}catch (InterruptedException e) {}
		threadA.work = true;
		
		try {Thread.sleep(3000);
		}catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
 