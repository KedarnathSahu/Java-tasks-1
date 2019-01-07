public class ThreadClassDemo{
	public static void main(String[] args){
	MyThread th=new MyThread();
	MyThread th1=new MyThread();

	//th.setPriority(Thread.MAX_PRIORITY);
	th.setName("Thread-1");
	th.start();
/*	try{
               th.join();
	}catch(InterruptedException e){
        	e.printStackTrace();
        }*/

	//th1.yield();
	th1.setName("Thread-2");
        th1.start();

	}
}

class MyThread extends Thread{
	public void run(){
	for(int i=1;i<=5;i++){
		System.out.println(i+" Name: "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority()+" ID: "+Thread.currentThread().getId());

		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}
	}
}
