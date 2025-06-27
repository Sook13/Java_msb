import java.util.Vector;

/**
 * @Author: Sy
 * @Date: 2025/6/26 - 06 - 26 - 14:41
 * @Description: PACKAGE_NAME
 * @Version: 1.0
 */
public class Vector1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.toString());
		System.out.println(v.get(0));
	}
}
