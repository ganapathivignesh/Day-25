package com.src;

public class Datasource {
	private String driverclass;
	private String url;
	private String password;
	private String username;
	
	
	public Datasource(String driverclass, String url, String password,
			String username) {
		super();
		this.driverclass = driverclass;
		this.url = url;
		this.password = password;
		this.username = username;
	}
	/**
	 * @return the driverclass
	 */
	public String getDriverclass() {
		return driverclass;
	}
	/**
	 * @param driverclass the driverclass to set
	 */
	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
}
