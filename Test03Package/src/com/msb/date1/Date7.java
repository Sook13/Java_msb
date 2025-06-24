package com.msb.date1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

/**
 * @Author: Sy
 * @Date: 2025/6/24 - 06 - 24 - 16:43
 * @Description: com.msb.date1
 * @Version: 1.0
 */
public class Date7 {
	public static void main(String[] args) {
		//方式一 预定标准格式 ISO_LOCAL_DATE
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		//dtf 可以实现LocalDateTime 和 String的转换
		LocalDateTime now = LocalDateTime.now();
		String str = dtf.format(now);
		System.out.println(str);
		//String -->LocalDateTime
		TemporalAccessor parse = dtf.parse(str);
		System.out.println(parse);
		//方式二 本地化相关的格式 oflocalizedDateTime()
		//FormatStyle.LONG 2025年6月24日 下午04时56分39秒
		//FormatStyle.MEDIUM 2025-6-24 16:57:31
		//FormatStyle.SHORT 25-6-24 下午4:57

		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		//LocalDateTime -->String
		LocalDateTime now2 = LocalDateTime.now();
		String str2 = dtf2.format(now2);
		System.out.println(str2);
		//String -->LocalDateTime
		TemporalAccessor parse2 = dtf2.parse(str2);
		System.out.println(parse2);
		//方式三 自定义格式ofPattern
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd & HH:mm:ss");
		LocalDateTime now3 = LocalDateTime.now();
		//LocalDateTime -->String
		String str3 = dtf3.format(now3);
		System.out.println(str3);
		//String -->LocalDateTime
		TemporalAccessor parse3 = dtf3.parse(str3);
		System.out.println(parse3);

	}


}
