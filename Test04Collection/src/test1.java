import java.util.*;

/**
 * @Author: Sy
 * @Date: 2025/6/25 - 06 - 25 - 14:30
 * @Description: PACKAGE_NAME
 * @Version: 1.0
 */
public class test1 {
	public static void main(String[] args) {
		System.out.println("--------");
		Collection col = new ArrayList();
		col.add(1);
		System.out.println(col);
		System.out.println("--------");
		List list = Arrays.asList(new Integer[]{111,232,323});
		col.addAll(list);
		System.out.println(col);
		boolean isRemove = col.remove(111);
		System.out.println(isRemove);
		col.add(18);
		col.add(12);
		col.add(11);
		col.add(17);
		col.add("abc");
		col.add(9.8);
		System.out.println(col);
		System.out.println("--------");
		//1.增强for循环
		for(Object o : col) {
			System.out.println(o);
		}
		System.out.println("--------");
		//2.Iterator
		Iterator i = col.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());}
	}
}
