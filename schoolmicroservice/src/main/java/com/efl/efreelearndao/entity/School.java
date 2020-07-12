package com.efl.efreelearndao.entity;

import javax.persistence.*;

@Entity
@Table (name="school_info")
public class 	School {
	@Id
	@Column (name="pk_Schoolid", nullable=false)
	long pk_SchoolId;
	@Column (name="user_name", nullable=false)
	String user_name;
	@Column (name="password", nullable=false)
	String password;
	@Column (name="schoolname", nullable=false)
	String SchoolName;
	@Column (name="Principalname", nullable=false)
	String PrincipalName;
	@Column (name="Schooladdress", nullable=false)
	String SchoolAddress;
	@Column (name="City", nullable=false)
	String City;
	@Column (name="State", nullable=false)
	String State;
	@Column (name="Country", nullable=false)
	String Country;
	@Column (name="Pincode", nullable=false)
	String Pincode;
	@Column (name="Email", nullable=false)
	String Email;
	@Column (name="Website", nullable=false)
	String website;
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public 	Long getContactno() {
		return Contactno;
	}

	public void setContactno(	Long contactno) {
		this.Contactno = contactno;
	}	
	@Column (name="contactno", nullable=false)
 Long Contactno;
	@Column (name="createdby", nullable=false)
	String createdby;
	@Column (name="lastupdatedby", nullable=false)
	String lastupdatedby;
	@Column (name="lastupdateed", nullable=false)
	String lastupdateed;
	@Column (name="status", nullable=false)
	String status;
	public School()
	{
		
	}
	
	//
	public School(	int pk_SchoolId,	String user_name,	String password,	String SchoolName,		String PrincipalName,		String SchoolAddress,		String City,	String State,		String Country,		String Pincode,	String Email,	String WebSite,		Long ContactNo,	String createdby,		String lastupdatedby,		String lastupdateed,	String status)
	{

		this.pk_SchoolId=pk_SchoolId;

		 this.user_name=user_name;

		  this.SchoolName=SchoolName;

	 this.PrincipalName=PrincipalName;

		  this.SchoolAddress=SchoolAddress;

		  this.City=City;

		  this.State=State;

		  this.Country=Country;

		  this.Pincode=Pincode;

		  this.Email=Email;

  this.website=WebSite;

		  this.Contactno=ContactNo;

  this.createdby=createdby;

  this.lastupdatedby=lastupdatedby;

  this.lastupdateed=lastupdateed;

		 this.status=status;
	}
	
	public long getPk_SchoolId() {
		return pk_SchoolId;
	}
	public void setPk_SchoolId(long pk_SchoolId) {
		this.pk_SchoolId = pk_SchoolId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getPrincipalName() {
		return PrincipalName;
	}
	public void setPrincipalName(String principalName) {
		PrincipalName = principalName;
	}
	public String getSchoolAddress() {
		return SchoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		SchoolAddress = schoolAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	public 	Long getContactNo() {
		return Contactno;
	}
	public void setContactNo(	Long contactNo) {
		Contactno = contactNo;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getLastupdatedby() {
		return lastupdatedby;
	}
	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	public String getLastupdateed() {
		return lastupdateed;
	}
	public void setLastupdateed(String lastupdateed) {
		this.lastupdateed = lastupdateed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
