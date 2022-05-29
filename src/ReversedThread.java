/********************************************** 
Workshop # 9
Course: JAC433
Last Name:Yang
First Name:Shuqi
ID:132162207
Section:NBB 
This assignment represents my own work in accordance with Seneca Academic Policy. 
Signature 
Date:2022-04-06
**********************************************/ 
public class ReversedThread {
	static int count = 50;
	public static void main(String[] args) {
		recursiveThread();
	}
	
	public static void recursiveThread() {
		if(count > 0) {
			count--;
			Thread t = new Thread(new Runnable() {				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					recursiveThread();
					System.out.println("Hello from " + Thread.currentThread().getName());	
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}		
			});
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


//Thread t1 = new Thread(new Runnable() {
//
//	@Override
//	public synchronized void run() {						
//		// TODO Auto-generated method stub
//		Thread t2 = new Thread(new Runnable() {
//			@Override
//			public synchronized void run() {
//				Thread t3 = new Thread(new Runnable() {						
//					@Override
//					public synchronized void run() {
////							try {
////								wait();
////							} catch (InterruptedException e) {
////								// TODO Auto-generated catch block
////								e.printStackTrace();
////							}
//							System.out.println("hello from 3" + Thread.currentThread().getName());
//							notify();						
//					}						
//				});
//				t3.start();					
////				try {
////					wait();
////				} catch (InterruptedException e) {
////					e.printStackTrace();
////				}
//				System.out.println("hello from 2" + Thread.currentThread().getName());
//				notify();
//			}
//			
//		});
//		t2.start();
////		try {
////			wait();
////		} catch (InterruptedException e) {
////			e.printStackTrace();
////		}
//		System.out.println("hello from 1" + Thread.currentThread().getName());
//	}		
//});
//t1.start();		