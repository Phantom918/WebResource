package cn.hnne.pagination;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象工厂
 * @author 马周易
 *
 */
public class BeanFactory {

	private static BeanFactory instance;

	/**
	 * 对象集合，用于减少使用反射的次数
	 */
	private Map<String, Object> beans = new HashMap<String, Object>();

	private BeanFactory() {
	}

	/**
	 * 获得工厂单例
	 */
	public static BeanFactory newInstance() {
		if (instance == null) {
			synchronized (BeanFactory.class) {
				if (instance == null) {
					instance = new BeanFactory();
				}
			}
		}
		return instance;
	}
	
	/**
	 * 获得对象
	 * @param className
	 * @return
	 */
	public Object getBean(String className) {
		Object bean = beans.get(className);
		if (bean == null) {
			try {
				bean = Class.forName(className).newInstance();
				beans.put(className, bean);
			} catch (Exception e) {
				throw new RuntimeException("找不到类" + className, e);
			}
		}
		return bean;
	}

}
