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
public class Contact {
	// Member Variables
    private String emailAddress;
    private String mobileNumber;
 
    // Member Methods
   
 
 
    public String getMobileNumber() {
        return mobileNumber;
    }
 
    public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
    public String storeContactInfo() {
        boolean stored = true;
        FacesMessage message = null;
        String outcome = null;
        if (stored) {
            message = new FacesMessage("Information is sent Successfully.");
            outcome = "contactsuccess";
        } else {
            message = new FacesMessage("Information is NOT sent Successfully.");
            outcome = "employee";
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        return outcome;
    }
    }
