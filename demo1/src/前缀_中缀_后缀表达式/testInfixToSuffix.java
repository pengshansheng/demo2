package 前缀_中缀_后缀表达式;

import java.util.Scanner;

public class testInfixToSuffix {
	//测试
	//中缀表达式转换为后缀表达式
	public static void main(String[] args) {
		    String input;
		    System.out.println("Enter infix:");
		    Scanner scanner = new Scanner(System.in);
		    input = scanner.nextLine();
		    InfixToSuffix in = new InfixToSuffix(input);
		    MyCharStack my = in.doTrans();
		    my.displayStack();

	}
}
