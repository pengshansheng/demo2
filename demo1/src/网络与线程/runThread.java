package 网络与线程;

public class runThread implements Runnable{
	public static void main(String[] args) {
		runThread runner=new runThread();
		Thread at=new Thread(runner);
		Thread bt=new Thread(runner);
		at.setName("aaaaaaaa1");
		bt.setName("bbbbbbbb1");
		at.start();
		bt.start();
		
	}
	@Override
	public void run() {
		for (int i = 0; i <1024 ; i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name);
		}
		
	}

}
