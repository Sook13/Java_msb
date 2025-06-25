package str;

/**
 * @Author: Sy
 * @Date: 2025/6/25 - 06 - 25 - 14:22
 * @Description: str
 * @Version: 1.0
 */
public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("我是一只牛");
		//1.增
		System.out.println(sb.append("!"));
		//2.删
		System.out.println(sb.deleteCharAt(0));
		//3.改
		System.out.println(sb.replace(0, 1, "^(*￣(oo)￣)^"));
		//4.查
		System.out.println(sb.charAt(0));
	}
}
