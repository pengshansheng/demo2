package java核心技术卷1;

public class 对象与类 {
	public static int id=1;
	
	private int nextId;

	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}
	public static void main(String[] args) {
		对象与类 a1=new 对象与类();
		对象与类 a2=new 对象与类();
		System.out.println(a1.id);
		a1.id=3;
		System.out.println(a2.id);
	}
}
