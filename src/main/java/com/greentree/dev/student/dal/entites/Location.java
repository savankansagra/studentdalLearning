package com.greentree.dev.student.dal.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	
	
	public Location() {
		super();
	}

	public Location(Integer id, String code, String name, String type) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Location [Id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}

}
