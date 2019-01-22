package java核心技术卷1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo1 {
	
	public static void main(String[] args) {
		//获取当前项目work工作路径
		String dir = System.getProperty("user.dir");
		int[] arr= {1,2,3,4,5,6,7};
		int[] arr1= {7};
		arr1=arr;
		System.out.println(Arrays.equals(arr1,arr));
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 19)));
		int[][] magicSquare ={
				{16, 3, 2, 13}, 
				{5, 10, 11, 8},
				{9, 6, 7, 12},
				{4, 15, 14, 1}
		};
		List<String> list=new ArrayList<String>();
		list.add("aasd");
		list.add("aasd1");
		list.add("aasd2");
		list.add("aasd3");
		list.add("aasd4");
		list.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------------");
		String a="1";
		StringBuffer c=new StringBuffer();
		a="2";
		c.append("1");
		c.append(" ");
		c.append("2");
		System.out.println(a.hashCode());
		int[] arr4= {1,2,3,4,3,12,5};
		String ars="----"+Arrays.toString(arr4);
		System.out.println(ars);
		ArrayList<String> lis=new ArrayList<>();
		lis.add("323");
		lis.add("423");
		

	}
	public static double max (double... values)
	{
	double largest = Double.MAX_VALUE;
	for (double v : values) if (v > largest) largest = v;
	return largest;
	}
}
