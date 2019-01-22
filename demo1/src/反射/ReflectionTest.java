package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {
	@Test
    public static void testClass() {
       Class clazz = null;
     //1.得到Class对象
       clazz = Person.class;
     //2.返回字段的数组
       Field[] fields = clazz.getDeclaredFields();
       
       System.out.println();  //插入断点
    }
	
	public static void main(String[] args) throws ClassNotFoundException {
		//1、通过对象调用 getClass() 方法来获取,通常应用在：比如你传过来一个 Object
		//类型的对象，而我不知道你具体是什么类，用这种方法
		Person p1 = new Person();
		Class c1 = p1.getClass();
		//2、直接通过 类名.class 的方式得到,该方法最为安全可靠，程序性能更高
		//这说明任何一个类都有一个隐含的静态成员变量 class
		Class c2 = Person.class;
		//3、通过 Class 对象的 forName() 静态方法来获取，用的最多，
		// 但可能抛出 ClassNotFoundException 异常
		Class c3 = Class.forName("反射.Person");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//获得类完整的名字
		String className=c2.getName();
		System.out.println(className);
		//获得类的public 类型的属性
		Field[] field=c2.getFields();
		for (Field field2 : field) {
			System.out.println("public类型的属性"+field2.getName());
		}
		//获得类的所有属性。包括私有的
		Field [] allFields = c2.getDeclaredFields();
		for(Field field3 : allFields){
		    System.out.println("所有属性,包括私有的:"+field3.getName());
		}
		//获得类的public类型的方法。这里包括 Object 类的一些方法
		Method [] methods = c2.getMethods();
		for(Method method : methods){
		    System.out.println("获得类的public类型的方法"+method.getName());//work waid equls toString hashCode等
		}
	}
}
