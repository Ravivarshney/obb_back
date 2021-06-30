package com.obb.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="obb")
public class Obb {


	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="userid")
	private String userid;
	
	@Column(name="userpassword")
	private String userpassword;
	
	
	@Column(name="username")
	private String username;
	
	@Column(name="b_donor")
	private String b_donor;
	
	@Column(name="b_group")
	private String b_group;
	
	@Column(name="date")
	private String date;
	
	@Column(name="canDonate")
	private String canDonate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getB_donor() {
		return b_donor;
	}

	public void setB_donor(String b_donor) {
		this.b_donor = b_donor;
	}

	public String getB_group() {
		return b_group;
	}

	public void setB_group(String b_group) {
		this.b_group = b_group;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCanDonate() {
		return canDonate;
	}

	public void setCanDonate(String canDonate) {
		this.canDonate = canDonate;
	}

	public Obb(int id, String userid, String userpassword, String username, String b_donor, String b_group,
			String date, String canDonate) {
		super();
		this.id = id;
		this.userid = userid;
		this.userpassword = userpassword;
		this.username = username;
		this.b_donor = b_donor;
		this.b_group = b_group;
		this.date = date;
		this.canDonate = canDonate;
	}

	public Obb() {
		super();
		// TODO Auto-generated constructor stub
	}

			
			
		
}
