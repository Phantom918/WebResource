/*
 * 
 * 文件名：VO.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：
 * 修改人：肖崇高
 * 修改时间：2014年3月21日
 * 修改内容：
 */
 
package cn.picc.model;

import java.lang.reflect.Method;

/**
 * 基础类（要解析Excel的实体需要继承该抽象类）
 * @author 肖崇高
 * @version 1.0, 2014年3月21日
 */
public abstract class ExcelObject {

	/**
	 * 错误信息
	 */
	private String errorMsg;
	
	/**
     * 通过属性名设置属性值
     * @param name
     * @param value
     */
    @SuppressWarnings("unchecked")
    public  void putValue(String name,Object value){
        Class c = this.getClass();
        Class v = value.getClass();
        try{
            Method m = c.getMethod("set"+name, new Class[]{v});
            m.invoke(this, new Object[]{value});
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * 返回属性名对应的值
     * @param name
     * @return 属性名对应的值
     */
    @SuppressWarnings("unchecked")
    public Object outValue(String name){
        Class c = this.getClass();
        Object o =null;
        try{
            Method m = c.getMethod("get"+name, new Class[]{});
            o = m.invoke(this, new Object[]{});
        }catch(Exception e){
            e.printStackTrace();
        }
        return o;
    }

	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
