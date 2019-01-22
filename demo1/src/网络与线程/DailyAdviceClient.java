package 网络与线程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class DailyAdviceClient implements Runnable{
	@Override
	public void run() {
		go();
	}
	public void go(){
		try {
			Thread.sleep(1000);
			System.out.println("线程二");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doMore();
	}
	
	public void doMore(){
		System.out.println("运行1");
	}
	public static void main(String[] args) {
		DailyAdviceClient threadJob=new DailyAdviceClient();
		Thread t=new Thread(threadJob);
		//线程在没有start()之前，只是个Thread事例，并不是真正的线程
		t.start();
		try {
			t.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//客户端与服务器的应用通过Socket连接来沟通
		
		try {
			Socket chatSocket=new Socket("127.0.0.1",5000);
			PrintWriter writer=new PrintWriter(chatSocket.getOutputStream());
			InputStreamReader streamReader=new InputStreamReader(chatSocket.getInputStream());
			BufferedReader reader=new BufferedReader(streamReader);
			String advice=reader.readLine();
			System.out.println(advice);
			writer.print("222");
			writer.println("1111111111111");
			chatSocket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
	//内部类
//	class ThreeTestDrice{
//		
//	}