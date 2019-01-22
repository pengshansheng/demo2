package demo1;

import java.util.Arrays;

public class demo3 {
	enum ARR{TRUE,FALSE,qq,ww,e33};
	public static void main(String[] args) {
		/*JFrame frame=new JFrame();
		JButton button=new JButton("go go go");
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
		gui d=new gui();*/
		String a="hello";
		int index=a.offsetByCodePoints(0, 3);
		System.out.println(index);
		System.out.println(a.codePointAt(index));
		char[] arr=a.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
    public void testClass() {
       Class clazz = null;
    }
}
