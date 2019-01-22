package 网络与线程;

import java.util.ArrayList;
import java.util.Comparator;

public class TestSyncTest {
	public static void main(String[] args) {
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.start();
		b.start();
		ArrayList list = new ArrayList();
		list.sort((Comparator) list);
	}
}
