package str;

/**
 * @Author: Sy
 * @Date: 2025/6/25 - 06 - 25 - 13:29
 * @Description: str
 * @Version: 1.0
 */
public class Stringbuilder1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("我是一个小胖");
		//1.增
		sb.append("子");
		System.out.println(sb);
		//2.删
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(0,2);
		System.out.println(sb);
		//3.改
		sb.replace(0,1,"是的");
		System.out.println(sb);
		sb.insert(0,"<UNK>");
		System.out.println(sb);
		sb.setCharAt(1,'艹');
		System.out.println(sb);
		//4.查
		System.out.println(sb.charAt(4));
	}
}
