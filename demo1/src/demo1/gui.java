package demo1;
import javax.swing.*;
public class gui {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JButton button=new JButton("go go go");
		//这一行程序会在window关闭时把程序结束掉
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//把button 加到frame的pane上
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
