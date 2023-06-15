package com.registartion;

import java.util.Date;

public class Registration {


	 private String empName;
	    private String gender;
	    private Date dob;
	    private String address;
	    private String emailAddress;
	    private String mobileNumber;
	  
	    public Registration() {
		}

		public Registration(String empName, String gender, Date dob, String address,
				String emailAddress,String mobilenumber) {
			this.empName=empName;
			this.gender=gender;
			this.dob=dob;
			this.address=address;
			this.emailAddress=emailAddress;
			this.mobileNumber=mobileNumber;
		}
	    // Member Methods
	    public String getEmpName() {
	        return empName;
	    }
	 
	    public void setEmpName(String empName) {
	    	this.empName = empName;
	    }
	 
	    public String getGender() {
	        return gender;
	    }
	 
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	 
	    public Date getDob() {
	        return dob;
	    }
	 
	    public void setDob(Date dob) {
	        this.dob = dob;
	    }
	 
	    public String getAddress() {
	        return address;
	    }
	 
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public String getEmailAddress() {
	        return emailAddress;
	    }
	 
	    public void setEmailAddress(String emailAddress) {
	        this.emailAddress = emailAddress;
	    }
	 
	    public String getMobileNumber() {
	        return mobileNumber;
	    }
	 
	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

		
	 
	   

}
