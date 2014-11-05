/*
 * 文件名：WebUtils.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：WEB层工具类
 * 修改人：马周易
 * 修改时间：2013年8月16日
 * 修改内容：新增
 */
package cn.hnne.hs.utils;


/**
 * WEB层工具类
 * @author 马周易
 * @version 1.0, 2013年8月16日
 */
public class WebUtils {

	/**
	 * 将null对象转换为空字符串
	 * 因为前台表单使用的是空字符串而不是null，所以在分页组件中必须进行转换
	 * @param obj 被转换的对象
	 * @return 如果对象为null，返回空字符串，否则返回原对象
	 */
	public static Object null2empty(Object obj) {
		if (obj == null) {
			return "";
		}
		
		return obj;
	}
	
	/**
	 * 判断字符串是否为null或空字符串
	 * @param str 被判断的字符串
	 * @return 判断结果
	 */
	public static boolean isEmpty(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}
}
