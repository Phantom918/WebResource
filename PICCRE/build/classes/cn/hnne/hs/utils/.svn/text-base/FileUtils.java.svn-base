/*
 * 文件名：FileUtils.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：文件操作工具类
 * 修改人：马周易
 * 修改时间：2013年8月21日
 * 修改内容：新增
 */
package cn.hnne.hs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Random;

/**
 * 文件操作工具类
 * 
 * @author 马周易
 * @version 1.0, 2013年8月21日
 */
public class FileUtils {

	/**
	 * 生成随机文件名
	 * 
	 * @return 随机生成的文件名
	 */
	public static String generateRandomFileName() {
		String RandomFilename = "";
		Random rand = new Random();// 生成随机数
		int random = rand.nextInt();

		Calendar calCurrent = Calendar.getInstance();
		int intDay = calCurrent.get(Calendar.DATE);
		int intMonth = calCurrent.get(Calendar.MONTH) + 1;
		int intYear = calCurrent.get(Calendar.YEAR);
		String now = String.valueOf(intYear) + "_" + String.valueOf(intMonth)
				+ "_" + String.valueOf(intDay) + "_";

		RandomFilename = now
				+ String.valueOf(random > 0 ? random : (-1) * random) + ".";

		return RandomFilename;
	}

	/**
	 * excel:D0CF11E0A1B11AE10000000000000000
	 * rar:526172211A0700CF907300000D000000 zip:504B0304140000000800D272F4423F81
	 * doc:D0CF11E0A1B11AE10000000000000000
	 */

	public final static String OFFICE = "D0CF11E0";
	public final static String XOFFICE = "504B0304";

	// public final static String DOC="D0CF11E0A1B11AE10000000000000000";

	// 根据16位校验检查文件
	@SuppressWarnings("resource")
	public static boolean checkFileIsOFFICE(File file) {
		FileInputStream input;
		try {
			input = new FileInputStream(file);
			byte[] bt = new byte[16];
			input.read(bt);
			if (OFFICE.equals(printHexString(bt).substring(0, 8))
					|| XOFFICE.equals(printHexString(bt).substring(0, 8))) {
				return true;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	// 将指定byte数组以16进制的形式转换成String
	public static String printHexString(byte[] b) {
		String str = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			str += hex.toUpperCase();
		}
		return str;

	}

	/**
	 * 将fromFile 写到 toFile
	 * 
	 * @param toFile
	 * @param fromFile
	 */
	@SuppressWarnings("resource")
	public static boolean writeFile2Disk(File toFile, File fromFile) {
		// 自动创建目录
		File parent = toFile.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		// 创建一个输出流
		OutputStream os = null;
		InputStream is = null;
		try {
			is = new FileInputStream(fromFile);
			os = new FileOutputStream(toFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return false;
			// throw new FileNotFoundException("文件没有找到，请检查上传路径");
		}
		// 设置缓存
		byte[] buffer = new byte[1024];
		int length = 0;
		// 读取myFile文件输出到toFile文件中
		try {
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	/**
	 * 将中文字符串转码
	 * @param string 中文字符串
	 * @return 转码为ISO8859-1编码字符串
	 */
	public static String getCNString(String string) {
		try {
			string = new String(string.getBytes(), "ISO8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return string;
	}

}
