/*
 * Author: Donald Trowbridge
 * Date: 11/14/2020
 * Class: CST235-O500
 * Statement: This work is my own.
 */

package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean(name="formController")
@ViewScoped
public class FormController {

	public String onSubmit(User user) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getRequestMap().put("User", user);
		return "TestResponse.xhtml";
	}
	
	public String onFlash(User user) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getFlash().put("User", user);
		return "TestResponse2.xhtml?faces-redirect=true";
	}
}
