package cn.zj.email;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;

import cn.zj.email.model.Email;
import cn.zj.email.model.EmailServer;

public class EmailSender {
	
	private boolean debug = false;
	
	private EmailServer emailServer = new EmailServer();
	
	public EmailSender(){
	}
	
	/**
	 * 设置邮件服务器
	 * @param serverHost
	 * @param serverPort
	 */
	public void setServer(String serverHost,String serverPort){
		emailServer.setServerHost(serverHost);
		emailServer.setServerPort(serverPort);
	}

	/**
	 * 是否用户验证
	 * @param open
	 */
	public void isOpenAuth(boolean open){
		emailServer.setOpenAuth(open);
	}
	
	/**
	 * 是否打开SSL验证
	 * @param open
	 */
	public void isOpenSSL(boolean open){
		emailServer.setOpenSSL(open);
	}
	
	/**
	 * 发送邮件
	 * 
	 * @param email
	 * @return
	 */
	protected boolean sendMail(Email email) {
		try {
			Message msg = beforeSend(email);
			Multipart multipart = new MimeMultipart();
			mailContent(email, multipart);
			fileAttachment(email, multipart);
			byteFileAttachment(email, multipart);
			msg.setContent(multipart);
			Transport.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 处理邮件文件附件
	 * 
	 * @param mail
	 * @param msg
	 * @return
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	private Multipart fileAttachment(Email mail, Multipart multipart)
			throws MessagingException, UnsupportedEncodingException {
		List<File> attachmentFiles = mail.getAttachmentFiles();
		List<String> attachmentNames = mail.getAttachmentNames();
		if (attachmentFiles == null) {
			return multipart;
		}
		DataSource fds = null;
		BodyPart attachment = null;
		for (int i = 0; i < attachmentFiles.size(); i++) {
			fds = new FileDataSource(attachmentFiles.get(i));
			attachment = new MimeBodyPart();
			if(attachmentNames == null || attachmentNames.size()  < attachmentFiles.size()){
				attachment.setFileName(MimeUtility.encodeText(attachmentFiles.get(i).getName()));
			}else{
				attachment.setFileName(MimeUtility.encodeText(attachmentNames.get(i)));
			}
			attachment.setDataHandler(new DataHandler(fds));
			multipart.addBodyPart(attachment);
		}
		return multipart;
	}
	/**
	 * 处理邮件字节数据附件
	 * 
	 * @param mail
	 * @param msg
	 * @return
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	private Multipart byteFileAttachment(Email mail,Multipart multipart) 
			throws UnsupportedEncodingException, MessagingException{
		List<String> attachmentNames = mail.getAttachmentNames();
		List<byte[]> attachments = mail.getAttachments();
		List<String> attachmentTypes = mail.getAttachmentTypes();
		if (attachments == null||attachmentNames == null ||attachmentTypes == null) {
			return multipart;
		}
		int length = Math.min(Math.min(attachmentNames.size(), attachments.size()),attachmentTypes.size());
		DataSource fds = null;
		BodyPart attachment = null;
		for (int i = 0; i < length; i++) {
			fds = new ByteArrayDataSource(attachments.get(i),attachmentTypes.get(i));
			attachment = new MimeBodyPart();
			attachment.setFileName(MimeUtility.encodeText(attachmentNames.get(i)));
			attachment.setDataHandler(new DataHandler(fds));
			multipart.addBodyPart(attachment);
		}
		return multipart;
	}

	/**
	 * 处理邮件正文信息
	 * 
	 * @param mail
	 * @param msg
	 * @return
	 * @throws MessagingException
	 */
	private Multipart mailContent(Email mail, Multipart multipart)
			throws MessagingException {
		if (mail.getContent() == null) {
			return multipart;
		}
		BodyPart content = new MimeBodyPart();
		content.setContent(mail.getContent(),
				"text/html;charset=" + mail.getContentType());
		multipart.addBodyPart(content);
		return multipart;
	}

	/**
	 * 邮件发送前消息处理
	 * 
	 * @param mail
	 * @return
	 * @throws AddressException
	 * @throws MessagingException
	 */
	private Message beforeSend(Email mail) throws AddressException,
			MessagingException {
		Properties pro = emailServer.getProperties();
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session.getDefaultInstance(pro,
				authenticator(mail));
		sendMailSession.setDebug(debug);
		// 根据session创建一个邮件消息
		Message mailMessage = new MimeMessage(sendMailSession);
		// 设置邮件消息的发送者
		mailMessage.setFrom(new InternetAddress(mail.getFromAddress()));
		// 创建邮件的接收者地址，并设置到邮件消息中
		mailMessage = toAdressTransform(mail.getToAddress(), mailMessage);
		// 设置邮件消息的主题
		mailMessage.setSubject(mail.getTheme());
		// 设置邮件消息发送的时间
		mailMessage.setSentDate(new Date());
		return mailMessage;
	}

	/**
	 * 身份验证
	 * 
	 * @param mail
	 * @return
	 */
	private Authenticator authenticator(Email mail) {
		if (mail.isValidate()) {
			return mail.getUserAuthenticator();
		}
		return null;
	}

	/**
	 * 设置邮件接收者地址
	 * 
	 * @param toAddress
	 * @return
	 * @throws MessagingException
	 */
	private Message toAdressTransform(String[] toAddress, Message message)
			throws MessagingException {
		if(toAddress == null){
			return message;
		}
		Pattern pattern = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		for (int i = 0; i < toAddress.length; i++) {
			if(toAddress[i] == null){
				continue;
			}
			Matcher matcher = pattern.matcher(toAddress[i]);
			if(toAddress[i].equals("")|| !matcher.matches()){
				continue;
			}
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(toAddress[i]));
		}
		return message;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	
}
