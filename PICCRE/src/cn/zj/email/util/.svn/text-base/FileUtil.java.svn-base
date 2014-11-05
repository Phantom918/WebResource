package cn.zj.email.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.activation.MimetypesFileTypeMap;

/**
 * 文件处理类
 * @author Criss
 *
 */
public class FileUtil {

	private FileUtil(){}
	
	
	/**
	 * 将文件解析成byte数组
	 * @param file
	 * @return
	 */
	public final static byte[] parseFileToByteArray(File file){
		InputStream input = null;
		ByteArrayOutputStream byteOut= null;
		byte[] result = null;
		try{
			byte[] data = new byte[1024];
			input = new FileInputStream(file);
			byteOut= new ByteArrayOutputStream();
			int i;   
	        while ((i = input.read(data)) != -1) {   
	        	byteOut.write(data, 0, i);   
	        }
	        result = byteOut.toByteArray();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				input.close();
				byteOut.close();
			} catch (IOException e) {
			}
		}
		
		return result;
	}
	
	/**
	 * 将多文件解析成byte数组
	 * @param files
	 * @return
	 */
	public final static List<byte[]> parseFilesToByteDateSource(List<File> files){
		List<byte[]> result= new ArrayList<byte[]>();
		for(int i=0;i<files.size();i++){
			result.add(parseFileToByteArray(files.get(i)));
		}
		return result;
	}
	
	/**
	 * 获取文件的MIME编码
	 * @param file
	 * @return
	 */
	public final static String getMimeType(File file){
		return MimetypesFileTypeMap.getDefaultFileTypeMap().getContentType(file);
	}
	
	/**
	 * 获取多文件的MIME编码
	 * @param files
	 * @return
	 */
	public final static List<String> getMimeTypes(List<File> files){
		List<String> result= new ArrayList<String>();
		for(int i=0;i<files.size();i++){
			result.add(getMimeType(files.get(i)));
		}
		return result;
	}
	
	/**
	 * 返回多文件的类型
	 * @param files
	 * @return
	 */
	public final static List<String> getFileTypes(List<File> files){
		List<String> result= new ArrayList<String>();
		for(int i=0;i<files.size();i++){
			result.add(FileTypeUtil.getFileType(files.get(i)));
		}
		return result;
	}
	
	/**
	 * 返回多文件的文件名
	 * @param files
	 * @return
	 */
	public final static List<String> getFileNames(List<File> files){
		List<String> result= new ArrayList<String>();
		for(int i=0;i<files.size();i++){
			result.add(files.get(i).getName());
		}
		return result;
	}


}
