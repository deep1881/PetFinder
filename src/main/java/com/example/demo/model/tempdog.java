package com.example.demo.model;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tempdog")
public class tempdog {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	 @Lob
	   @Column(columnDefinition="MEDIUMBLOB")
	   private String file;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	

	
	
	 
	
	
}
