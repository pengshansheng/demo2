package 远程部署RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says,'Hey'";
	}
	public static void main(String[] args) {
		int a=1;
		int i=2;
		int b=3;
		System.out.print(a);
		System.out.println("("+Integer.toBinaryString(a)+")");
		i=1|-1;
		System.out.print(i>>>1);
		System.out.println("("+Integer.toBinaryString(i)+")");
		String ass="1234";
		System.out.println(String.join("1","s","3","asdaf阿萨德"));
	}

}
