package 序列化和文件的输入_输出;

import java.io.Serializable;

public class demo1 implements Serializable{
	String username;
	transient String currentID;//标记这个变量不需要序列化
	//如果要序列化程序能跳过某个实例变量，就把它标记成transient的变量
	public static void main(String[] args) {
		
	}
}
