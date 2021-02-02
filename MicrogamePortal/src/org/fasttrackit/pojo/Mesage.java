package org.fasttrackit.pojo;

public class Mesage {
	private int id;
	private String expeditor;
	private String destinatar;
	private String date;
	private String title;
	private String content;
	
	
	public Mesage() {
		super();
	}


	public Mesage(int id, String expeditor, String destinatar, String date, String title, String content) {
		super();
		this.id = id;
		this.expeditor = expeditor;
		this.destinatar = destinatar;
		this.date = date;
		this.title = title;
		this.content = content;
	}


	public Mesage(String expeditor, String destinatar, String date, String title, String content) {
		super();
		this.expeditor = expeditor;
		this.destinatar = destinatar;
		this.date = date;
		this.title = title;
		this.content = content;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getExpeditor() {
		return expeditor;
	}


	public void setExpeditor(String expeditor) {
		this.expeditor = expeditor;
	}


	public String getDestinatar() {
		return destinatar;
	}


	public void setDestinatar(String destinatar) {
		this.destinatar = destinatar;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
