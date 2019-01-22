package 栈;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
	  public static void main(String[] args) {
	        MyStack stack = new MyStack(3);
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        System.out.println(stack.peek());
	        while(!stack.isEmpty()){
	            System.out.println(stack.pop());
	        }
	        Stack s=new Stack();
	         
	    }
	
	private int[] array;
    private int maxSize;
    private int top;
     
    public MyStack(int size){
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }
     
    //压入数据
    public void push(int value){
        if(top < maxSize-1){
            array[++top] = value;
        }
    }
     
    //弹出栈顶数据
    public int pop(){
        return array[top--];
    }
     
    //访问栈顶数据
    public int peek(){
        return array[top];
    }
     
    //判断栈是否为空
    public boolean isEmpty(){
        return (top == -1);
    }
     
    //判断栈是否满了
    public boolean isFull(){
        return (top == maxSize-1);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		result = prime * result + maxSize;
		result = prime * result + top;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		if (maxSize != other.maxSize)
			return false;
		if (top != other.top)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyStack [array=" + Arrays.toString(array) + ", maxSize=" + maxSize + ", top=" + top + "]";
	}
    
    
}
