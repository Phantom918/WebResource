package cn.zj.email;

import java.io.File;
import java.util.List;

import cn.zj.email.model.Email;
import cn.zj.email.model.UserAuthenticator;
import cn.zj.email.util.URLUtil;


public class SendEmailFactory {

	private static EmailSender emailSender;
	
	private SendEmailFactory(){}
	
	static {
		if (emailSender == null) {
			emailSender = new EmailSender();
		}
	}
	
	/**
	 * 设置服务器
	 * @param serverHost (邮件服务器,如smtp.gmail.com)
	 * @param serverPort (邮件服务器端口号)
	 */
	public static void setServer(String serverHost,String serverPort){
		emailSender.setServer(serverHost, serverPort);
	}
	
	/**
	 * 是否打开SSL验证,默认打开
	 * @param open
	 */
	public static void setOpenSSL(boolean open){
		emailSender.isOpenSSL(open);
	}
	
	/**
	 * 是否启用调试,默认启用
	 * @param debug
	 */
	public static void setDebug(boolean debug){
		emailSender.setDebug(debug);
	}
	
	/**
	 * 是否开启用户验证,默认打开
	 * @param open
	 */
	public void setOpenAuth(boolean open){
		emailSender.isOpenAuth(open);
	}

	/**
	 * 发送纯文本邮件
	 * 
	 * @param fromAddress
	 *            发件地址
	 * @param password
	 *            密码
	 * @param theme
	 * 		                  邮件主题
	 * @param content
	 *            邮件内容(可以为html内容)
	 * @param contentType 
	 *            邮件内容的字符集
	 * @param toAddress
	 *            接收地址
	 * @return
	 */
	public static boolean simpleSendEmail(String fromAddress, String password,
			String theme, String content,String contentType,String... toAddress) {
		Email mail = new Email();
		mail.setTheme(theme);
		mail.setContent(content);
		mail.setContentType(contentType);
		mail.setToAddress(toAddress);
		mail.setValidate(true);
		mail.setUserAuthenticator(new UserAuthenticator(fromAddress, password));
		mail.setFromAddress(fromAddress);
		return emailSender.sendMail(mail);
	}

	/**
	 * 发送带附件的邮件
	 * 
	 * @param fromAddress
	 *            发件地址
	 * @param password
	 *            密码
	 * @param theme
	 *            邮件主题
	 * @param content
	 *            邮件内容
	 * @param contentType 
	 *            邮件内容的字符集
	 * @param attachments
	 *            附件
	 * @param toAddress
	 *            接收地址
	 * @return
	 */
	public static boolean sendAttachmentEmail(String fromAddress,
			String password, String theme, String content,String contentType, List<File> attachments,String... toAddress) {
		Email mail = new Email();
		mail.setTheme(theme);
		mail.setContent(content);
		mail.setContentType(contentType);
		mail.setToAddress(toAddress);
		mail.setValidate(true);
		mail.setUserAuthenticator(new UserAuthenticator(fromAddress, password));
		mail.setFromAddress(fromAddress);
		if(attachments != null){
			mail.setAttachmentFiles(attachments);
		}
		return emailSender.sendMail(mail);
	}
	
	/**
	 * 将html请求结果作为邮件正文发送
	 * @param fromAddress 发件地址
	 * @param password 密码
	 * @param theme 邮件主题
	 * @param urlStr html的url请求路径
	 * @param toAddress 接收地址
	 * @return 
	 */
	public static boolean sendUrlEmail(String fromAddress,
			String password, String theme, String contentBefore, String urlStr,
			String contentAfter, String... toAddress){
		return sendComprehensiveURLEmail(fromAddress, password, theme, contentBefore, urlStr, contentAfter, null,null, toAddress);
	}
	

	/**
	 * 发送一封包含文本(可以为html文本),附件的邮件
	 * 
	 * @param fromAddress
	 *            发件地址
	 * @param password
	 *            密码
	 * @param theme
	 *            邮件主题
	 * @param content
	 *            可以使纯文本,也可以是html文本
	 * @param contentType 
	 *            邮件内容的字符集
	 * @param attachments
	 *            附件
	 * @param attachmentNames
	 *            附件名(为空则默认使用
	 *            attachments的文件名称,否则使用attachmentName与attachments位置一一对应的名称)
	 * @param toAddress
	 *            接收地址
	 * @return
	 */
	public static boolean sendComprehensiveEmail(String fromAddress,
			String password, String theme, String content,String contentType,List<File> attachments,List<String> attachmentNames,
			String... toAddress) {
		boolean flag = true;
		try {
			Email mail = new Email();
			mail.setTheme(theme);
			mail.setContent(content);
			mail.setContentType(contentType);
			mail.setToAddress(toAddress);
			mail.setValidate(true);
			mail.setUserAuthenticator(new UserAuthenticator(fromAddress,
					password));
			mail.setFromAddress(fromAddress);
			if(attachments != null){
				mail.setAttachmentFiles(attachments);
			}
			if(attachmentNames != null){
				mail.setAttachmentNames(attachmentNames);
			}
			flag = emailSender.sendMail(mail);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}

		return flag;
	}
	
	/**
	 * 发送一封包含文本,html,附件的邮件
	 * 注:某些邮箱无法接收带html的邮件
	 * 
	 * @param fromAddress
	 *            发件地址
	 * @param password
	 *            密码
	 * @param theme
	 *            邮件主题
	 * @param contentBefore
	 *            在html之前的文本
	 * @param urlStr
	 *            html的url路径
	 * @param contentAfter
	 *            在html之后的文本
	 * @param attachments
	 *            附件
	 * @param attachmentName
	 *            附件名(为空则默认使用
	 *            attachments的文件名称,否则使用attachmentName与attachments位置一一对应的名称)
	 * @param toAddress
	 *            接收地址
	 * @return
	 */
	public static boolean sendComprehensiveURLEmail(String fromAddress,
			String password, String theme, String contentBefore, String urlStr,
			String contentAfter, List<File> attachments,List<String> attachmentNames,
			String... toAddress) {
		boolean flag = false;
		try{
			String content = contentBefore + "<br/>" + new String(URLUtil.getUrl(urlStr), URLUtil.getHtmlEncode(urlStr)) + "<br/>"
					+ contentAfter;
			String contentType = URLUtil.getHtmlEncode(urlStr);
			flag =sendComprehensiveEmail(fromAddress, password, theme, content, contentType, attachments,attachmentNames, toAddress);
		}catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	
}
