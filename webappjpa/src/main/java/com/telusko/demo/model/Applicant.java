package com.telusko.demo.model;

import java.util.ArrayList;
import java.util.List;


public class Applicant {
	
	private String name;
	private List<String> booklist;
	private String cauldronSize;
	
	public Applicant(String name, List<String> booklist, String cauldronSize) {
		super();
		this.name = name;
		this.booklist = booklist;
		this.cauldronSize = cauldronSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<String> booklist) {
		this.booklist = booklist;
	}

	public String getCauldronSize() {
		return cauldronSize;
	}

	public void setCauldronSize(String cauldronSize) {
		this.cauldronSize = cauldronSize;
	}

	@Override
	public String toString() {
		return "Applicant [name=" + name + ", booklist=" + booklist + ", cauldronSize=" + cauldronSize + "]";
	}
	
	
	

}
