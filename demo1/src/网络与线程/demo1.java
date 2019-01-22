package 网络与线程;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class demo1 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSock=new ServerSocket(5000);
		Socket sock=new Socket("192.168.0.181",4242);
		Socket sock1=serverSock.accept();
		
		
	}

}
