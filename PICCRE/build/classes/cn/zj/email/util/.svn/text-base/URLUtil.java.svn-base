package cn.zj.email.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 网络请求处理类
 * @author Criss
 *
 */
public class URLUtil {

	private URLUtil(){}
	
	/**
	 * 获取网络请求内容,将其转换为String字符串
	 * @param urlStr
	 * @return
	 * @throws IOException 
	 */
	public final static byte[] getUrl(String urlStr) throws IOException{
		URL url = null; 
		InputStream input =null;
		ByteArrayOutputStream bo = null;
		byte[] result = null;
		try{
			url = new URL(urlStr);
			input = url.openStream();  
			bo = new ByteArrayOutputStream();
			byte[] data = new byte[1024];
	        int i;   
	        while ((i = input.read(data)) != -1) {   
	            bo.write(data, 0, i);   
	        }   
	        result = bo.toByteArray();
	        bo.reset();   
		}catch(IOException ie){
			throw new RuntimeException(ie);
		}finally{
	        try {
				input.close();
				bo.close();
			} catch (IOException e) {
			}
		}

		return result;
	}
	
	/**
	 * 获取页面的编码格式
	 * @param urlStr
	 * @return
	 * @throws IOException
	 */
	public final static String getHtmlEncode(String urlStr) throws IOException{
		String htmlContent = new String(getUrl(urlStr)).toLowerCase();
		String[] split =  htmlContent.split("head");
		StringBuffer neContent = new StringBuffer();
		for(int i=0;i<split.length;i++){
			if(split[i].contains("content-type")){
				neContent.append(split[i]);
			}
		}
		String content = null;
		content = neContent.substring(neContent.indexOf("charset"));
		content = content.replace("\"", "\'");
		content = content.substring(content.indexOf("=")+1, content.indexOf("'"));
		return content;
	}
}
