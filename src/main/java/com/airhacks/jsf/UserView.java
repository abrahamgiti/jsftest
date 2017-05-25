package com.airhacks.jsf;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
//@ManagedBean
//@ViewScoped
public class UserView implements Serializable
{
	private static final long serialVersionUID = 2240551594761999535L;
	private User user;
	
	public UserView()
	{
		this.user = new User();
	}
	
	
	public void save()
	{
		System.out.println("Hihhhas");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fabuloso!"));
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
