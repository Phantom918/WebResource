package cn.zj.email;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cn.zj.email.util.ListToHtmlTable;

public class TestDemo {
	static List<File> files = new ArrayList<File>();
	public static void main(String[] args) {
		files.add(new File("D:/BaiduYunDownload/SkyUI4.1汉化版.7z"));
		SendEmailFactory.setDebug(true);
		SendEmailFactory.setServer("smtp.gmail.com", "587");
		//files.add(new File("E:/GFW/���Ĳ���test1.txt"));
		//files.add(new File("D:/Criss/Desktop/PICCHR-database/Ȩ��ģ����ݿ��.xlsx"));
		//demo1();
		//demo2();
		demo3();
		//demo4();
		//demoHt();
	}
	public static String demoHt(){
		List<String> title = new ArrayList<String>();
		title.add("标题1");
		title.add("标题2");
		title.add("标题3");
		
		List<String> content1 = new ArrayList<String>();
		content1.add("content1");
		content1.add("content2");
		content1.add("content3");
		List<String> content2 = new ArrayList<String>();
		content2.add("content1");
		content2.add("content2");
		content2.add("content3");
		List<String> content3 = new ArrayList<String>();
		content3.add("content1");
		content3.add("content2");
		content3.add("content3");
		List<List<?>> content = new ArrayList<List<?>>();
		content.add(content1);
		content.add(content2);
		content.add(content3);
		return new ListToHtmlTable(title, content).getTableText();
	}

	public static void demo1(){
		long start = System.currentTimeMillis();
		System.out.println(
		SendEmailFactory
		.sendComprehensiveURLEmail(
				"yangyuancan.hnne@gmail.com", 
				"yang2684513",
				"面向兑现", 
				"<h1>中文添加系列是</h1>", 
				"http://www.baidu.com",
				"阿斯顿发布", 
				files,
				null,
				"734825675@qq.com","nakyyang@sina.com","nakyyang@gmail.com"));
		System.out.println(System.currentTimeMillis() - start);
	}
	public static void demo2() {
		SendEmailFactory
				.sendUrlEmail(
						"yangyuancan.hnne@gmail.com",
						"yang2684513",
						"手机日",
						"添加",
						"http://zhidao.baidu.com/link?url=lLX9P2iuz4noJUrFYDdvyuZPZrsIAirA9LIzwRHrCTRJ80IEsNPiBa_ObwwHEHe41DhSwaiZpJw_s5I3HC7TR_",
						"广告给你的思考南京",
						"nakyyang@gmail.com");
	}

	public static void demo3() {
		SendEmailFactory
				.sendAttachmentEmail(
						"yangyuancan.hnne@gmail.com",
						"yang2684513",
						"但是发放",
						demoHt(),
						"gbk",
						files,
						"734825675@qq.com","nakyyang@sina.com","nakyyang@gmail.com");
	}

	public static void demo4() {
		SendEmailFactory.simpleSendEmail("yangyuancan.hnne@gmail.com",
				"yang2684513", "���Ա���2", "���ǲ���2", "gbk","nakyyang@gmail.com");
	}


}
