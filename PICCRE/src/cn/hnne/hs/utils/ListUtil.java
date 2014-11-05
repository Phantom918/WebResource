package cn.hnne.hs.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * List工具类
 * @author criss
 *
 */
public class ListUtil {

	/**
	 * 将逗号分隔的整数字符串转换为List集合
	 * @param str 逗号分隔的整数字符串
	 * @return 转换后的整数集合
	 */
	public static List<Integer> stringToList(String str) {
		List<Integer> list = new ArrayList<Integer>();
		if ("".equals(str.trim())) {
			
		} else if (str.indexOf(",") == -1) {
			list.add(Integer.valueOf(str));
		} else {
			for (String id : str.split(",")) {
				list.add(Integer.parseInt(id));
			}
		}
		return list;
	}
	
	/**
	 * 将pix分隔的数字符串转换为List集合
	 * @param str 逗号分隔的整数字符串
	 * @param pix 分隔符号
	 * @return 转换后的BigDecimal集合
	 */
	public static List<BigDecimal> stringBigDecimalToList(String str,String pix) {
		List<BigDecimal> list = new ArrayList<BigDecimal>();
		if ("".equals(str.trim())) {
			
		} else if (str.indexOf(pix) == -1) {
			list.add(BigDecimal.valueOf(Long.parseLong(str)));
		} else {
			for (String id : str.split(pix)) {
				list.add(BigDecimal.valueOf(Long.parseLong(id)));
			}
		}
		return list;
	}
}
