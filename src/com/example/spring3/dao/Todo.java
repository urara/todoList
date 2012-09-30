package com.example.spring3.dao;

import java.sql.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Version;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class Todo {

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public String getContents() {
		return Contents;
	}

	public void setContents(String contents) {
		this.Contents = contents;
	}

	public Integer getEmergency() {
		return Emergency;
	}

	public void setEmergency(Integer emergency) {
		this.Emergency = emergency;
	}

	public Integer getVersion() {
		return Version;
	}

	public void setVersion(Integer version) {
		this.Version = version;
	}

	@Id
	public Integer Id;
	public Date Date;
	public String Contents;
	public Integer Emergency;
	@Version
	public Integer Version;

}
