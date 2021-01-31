package org.fasttrackit.pojo;

public class BlackList {
	private int id;
	private String userName;
	private String fullName;
	private String adress;
	private String phoneNumber;
	private String comment;
	private String statute;
	
	
	
	
	public BlackList() {
		super();
	}
	public BlackList(String userName, String fullName, String adress, String phoneNumber, String comment,
			String statute) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.comment = comment;
		this.statute = statute;
	}
	public BlackList(int id, String userName, String fullName, String adress, String phoneNumber, String comment,
			String statute) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.comment = comment;
		this.statute = statute;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatute() {
		return statute;
	}
	public void setStatute(String statute) {
		this.statute = statute;
	}
	


}
