package com.efl.efreelearndao.dto;


public class 	SchoolInfoDTO {
	
	int pk_SchoolId;
	
	String user_name;
	
	String password;
	
	String SchoolName;
	
	String PrincipalName;

	String SchoolAddress;
 
	String City;
	
	String State;

	String Country;

	String Pincode;

	String Email;
 
	String WebSite;
 
	String ContactNo;
	
	String createdby;

	String lastupdatedby;
	
	String lastupdateed;
 
	String status;
	public SchoolInfoDTO()
	{
	}
	
	//
	public SchoolInfoDTO(	int pk_SchoolId,	String user_name,	String password,	String SchoolName,		String PrincipalName,		String SchoolAddress,		String City,	String State,		String Country,		String Pincode,	String Email,	String WebSite,	String ContactNo,	String createdby,		String lastupdatedby,		String lastupdateed,	String status)
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

  this.WebSite=WebSite;

		  this.ContactNo=ContactNo;

  this.createdby=createdby;

  this.lastupdatedby=lastupdatedby;

  this.lastupdateed=lastupdateed;

		 this.status=status;
	}
	
	public int getPk_SchoolId() {
		return pk_SchoolId;
	}
	public void setPk_SchoolId(int pk_SchoolId) {
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
	public String getWebSite() {
		return WebSite;
	}
	public void setWebSite(String webSite) {
		WebSite = webSite;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
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
