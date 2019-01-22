package 队列;

public class MyQueueTest {
	
	public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);//queArray数组数据为[1,2,3]
        //查看对头数据
        System.out.println("添加前"+queue.toString());
        System.out.println(queue.peekFront()); //1
        queue.remove();//queArray数组数据为[null,2,3]
        System.out.println("删除头部"+queue.toString());
        System.out.println(queue.peekFront()); //2
        
        queue.insert(4);//queArray数组数据为[4,2,3]
        queue.insert(5);//队列已满,queArray数组数据为[4,2,3]
        System.out.println("删除后插入"+queue.toString());
    }
	
}
