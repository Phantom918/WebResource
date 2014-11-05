package cn.hnne.hs.utils;

import java.text.SimpleDateFormat;

public class DateFormatUtil {
	
	private static DateFormatUtil instance;
	
	private SimpleDateFormat simpleDateFormat;
	
	private DateFormatUtil() {
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public static DateFormatUtil newInstance() {
		if (instance == null) {
			synchronized (DateFormatUtil.class) {
				if (instance == null) {
					instance = new DateFormatUtil();
				}
			}
		}
		return instance;
	}

	public SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}

}
