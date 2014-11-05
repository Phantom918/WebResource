package cn.zj.email.model;

import java.util.Properties;

/**
 * 邮件服务器
 * 
 * @author Criss
 * 
 */
public class EmailServer {

	/**
	 * 服务器地址
	 */
	private String serverHost;

	/**
	 * 服务器路径
	 */
	private String serverPort;
	
	/**
	 * 是否使用SSL加密
	 */
	private boolean openSSL = true;
	
	/**
	 * 是否启用用户验证
	 */
	private boolean openAuth = true;
	
	/**
	 * 超时时间
	 */
	//private long timeout = 1;

	public EmailServer() {

	}

	public EmailServer(String serverHost, String serverPort) {
		this.serverHost = serverHost;
		this.serverPort = serverPort;
	}

	/**
	 * 获取邮件服务器配置信息
	 * 
	 * @return
	 */
	public Properties getProperties() {
		Properties props = new Properties();
		props.put("mail.smtp.host", serverHost);
		props.put("mail.smtp.port", serverPort);
		props.put("mail.smtp.auth", openAuth);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.EnableSSL.enable", openSSL);
		//props.put("mail.smtp.timeout", timeout);
		return props;
	}

	public String getServerHost() {
		return serverHost;
	}

	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public boolean isOpenSSL() {
		return openSSL;
	}

	public void setOpenSSL(boolean openSSL) {
		this.openSSL = openSSL;
	}

	public boolean isOpenAuth() {
		return openAuth;
	}

	public void setOpenAuth(boolean openAuth) {
		this.openAuth = openAuth;
	}

}
