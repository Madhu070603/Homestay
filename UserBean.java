package com.registartion;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;
 
@ManagedBean
@SessionScoped
public class UserBean {
	// Member Variables
    private String empName;
    private String gender;
    private Date dob;
    private String address;
    private String emailAddress;
    private String mobileNumber;
  
 
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
 
   
 
    // Validate Email
    public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
        String emailStr = (String) value;
        if (-1 == emailStr.indexOf("@")) {
            FacesMessage message = new FacesMessage("Email Address is Valid");
            throw new ValidatorException(message);
        }
    }
 
    // Action Methods
    public String storeEmployeeInfo() {
        boolean stored = true;
        FacesMessage message = null;
        String outcome = null;
        if (stored) {
            message = new FacesMessage("Employee Information is stored Successfully.");
            outcome = "success";
        } else {
            message = new FacesMessage("Employee Information is NOT stored Successfully.");
            outcome = "employee";
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        return outcome;
    }
    }
