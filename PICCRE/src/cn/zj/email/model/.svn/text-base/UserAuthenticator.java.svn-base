package cn.zj.email.model;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 邮箱账户验证
 * 
 * @author Criss
 * 
 */
public class UserAuthenticator extends Authenticator {
	String userName;
	String password;

	public UserAuthenticator() {
	}

	public UserAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
