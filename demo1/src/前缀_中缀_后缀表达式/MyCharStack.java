package 前缀_中缀_后缀表达式;

import java.util.Arrays;

public class MyCharStack {
	 private char[] array;
	    private int maxSize;
	    private int top;
	     
	    public MyCharStack(int size){
	        this.maxSize = size;
	        array = new char[size];
	        top = -1;
	    }
	     
	    //压入数据
	    public void push(char value){
	        if(top < maxSize-1){
	            array[++top] = value;
	        }
	    }
	     
	    //弹出栈顶数据
	    public char pop(){
	        return array[top--];
	    }
	     
	    //访问栈顶数据
	    public char peek(){
	        return array[top];
	    }
	     
	    //查看指定位置的元素
	    public char peekN(int n){
	        return array[n];
	    }
	     
	    //为了便于后面分解展示栈中的内容，我们增加了一个遍历栈的方法(实际上栈只能访问栈顶元素的)
	    public void displayStack(){
	        System.out.print("Stack(bottom-->top):");
	        for(int i = 0 ; i < top+1; i++){
	            System.out.print(peekN(i));
	            System.out.print(' ');
	        }
	        System.out.println("");
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
			MyCharStack other = (MyCharStack) obj;
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
			return "MyCharStack [array=" + Arrays.toString(array) + ", maxSize=" + maxSize + ", top=" + top + "]";
		}
	    
	    
}
