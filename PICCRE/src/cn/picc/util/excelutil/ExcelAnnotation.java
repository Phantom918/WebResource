package cn.picc.util.excelutil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标示生成Excel时是否生成,//该注解只能用在成员变量上 
 * @author criss
 *
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD) 
public @interface ExcelAnnotation {

	boolean unChecked()  default  false;
    
}
