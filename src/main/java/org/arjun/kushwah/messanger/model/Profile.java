package org.arjun.kushwah.messanger.model;

import java.io.FileFilter;
import java.util.Date;

public class Profile {
	private long id;
	private String profileName;
	private String fistName;
	private String lastName;
	private Date created;
	public Profile() {}
	public Profile(long id,String profileName,String fistName,String lastName) {
		this.id=id;
		this.profileName=profileName;
		this.fistName=fistName;
		this.lastName=lastName;
		created=new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
