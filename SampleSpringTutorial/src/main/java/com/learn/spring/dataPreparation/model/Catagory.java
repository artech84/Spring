package com.learn.spring.dataPreparation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catagory" , catalog="obrs_db")
public class Catagory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4194468135729836651L;
	private String catagory;
	
	@Id
	@Column(name="CATAGORY_ID",unique=true)
	private long catagoryId;
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public long getCatagoryId() {
		return catagoryId;
	}
	public void setCatagoryId(long catagoryId) {
		this.catagoryId = catagoryId;
	}

}
