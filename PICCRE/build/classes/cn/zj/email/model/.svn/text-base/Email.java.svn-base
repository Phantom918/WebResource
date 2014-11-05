package cn.zj.email.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Email {
	
	/**
	 * 发件用户验证
	 */
	private UserAuthenticator userAuthenticator;
	
	/**
	 * 发件者
	 */
	private String fromAddress;
	
	/**
	 * 邮件接收者
	 */
	private String[] toAddress;
	
	/**
	 * 邮件主题
	 */
	private String theme;
	
	/**
	 * 邮件内容
	 */
	private String content;
	
	/**
	 * 是否验证用户身份
	 */
	private boolean validate;

	/**
	 * 附件名称
	 */
	private List<String> attachmentNames;
	
	/**
	 * 附件文件数据
	 */
	private List<byte[]> attachments;
	
	/**
	 *  附件文件(与attachments有一个就行),这个属性存在的情况下,不需要attachmentNames 和attachmentTypes
	 */
	private List<File> attachmentFiles;
	
	/**
	 * 附件MIME编码
	 */
	private List<String> attachmentTypes;

	/**
	 * 邮件内容编码格式
	 */
	private String contentType;

	public UserAuthenticator getUserAuthenticator() {
		return userAuthenticator;
	}

	public void setUserAuthenticator(UserAuthenticator userAuthenticator) {
		this.userAuthenticator = userAuthenticator;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String[] getToAddress() {
		return toAddress;
	}

	public void setToAddress(String[] toAddress) {
		this.toAddress = toAddress;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	/**
	 * 如果没有设置,默认返回utf-8
	 * @return
	 */
	public String getContentType() {
		return contentType==null?"utf-8":contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	/**
	 * 向邮件中添加附件
	 * @param attachment 附件内容
	 * @param name 附件名称
	 * @param type 附件编码类型
	 */
	public void addAttachment(byte[] attachment,String name,String type){
		if(attachments == null){
			attachments = new ArrayList<byte[]>();
		}
		if(attachmentNames == null){
			attachmentNames = new ArrayList<String>();
		}
		if(attachmentTypes == null){
			attachmentNames = new ArrayList<String>();
		}
		
		attachments.add(attachment);
		attachmentNames.add(name);
		attachmentTypes.add(type);
	}

	public List<String> getAttachmentNames() {
		return attachmentNames;
	}
	/**
	 * 确保attachmentNames,attachments,attachmentTypes三者一一对应,否者使用addAttachment方法
	 * @param attachmentNames
	 */
	public void setAttachmentNames(List<String> attachmentNames) {
		this.attachmentNames = attachmentNames;
	}

	public List<byte[]> getAttachments() {
		return attachments;
	}
	/**
	 *  与attachmentFiles有其中一个就行,确保attachmentNames,attachments,attachmentTypes三者一一对应,否者使用addAttachment方法
	 * @param attachmentNames
	 */
	public void setAttachments(List<byte[]> attachments) {
		this.attachments = attachments;
	}

	public List<String> getAttachmentTypes() {
		return attachmentTypes;
	}
	/**
	 * 确保attachmentNames,attachments,attachmentTypes三者一一对应,否者使用addAttachment方法
	 * @param attachmentNames
	 */
	public void setAttachmentTypes(List<String> attachmentTypes) {
		this.attachmentTypes = attachmentTypes;
	}

	public List<File> getAttachmentFiles() {
		return attachmentFiles;
	}
	/**
	 * 与attachments有其中一个就行,这个属性存在的情况下,不需要attachmentNames 和attachmentTypes
	 */
	public void setAttachmentFiles(List<File> attachmentFiles) {
		this.attachmentFiles = attachmentFiles;
	}

}
