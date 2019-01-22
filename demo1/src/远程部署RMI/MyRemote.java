package 远程部署RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	//每个远程调用都会被认为是有风险的，这样声明会强迫客户端要注意到这件事
	//返回值会通过网络传送，所以必须是Serializable,
	//1.创建远程接口
	public String sayHello() throws RemoteException;
	//2.实现远程接口
	
}
