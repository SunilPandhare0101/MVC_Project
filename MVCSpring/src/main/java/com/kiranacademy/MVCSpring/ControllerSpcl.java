package com.kiranacademy.MVCSpring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerSpcl {

	@Autowired 
	SessionFactory sf;
	
	ModelAndView md = new ModelAndView();
	
	@RequestMapping ("/")
	public String HomePage() {
		return "home";
		
	}
	@RequestMapping("/login-page")
	public String loginpage() {
		return "login";
	}
	@RequestMapping ("/register")
	public String register() {
		return "home";
	}
	
//	CheckValidation validation = new CheckValidation();
//	
	@PostMapping ("/SaveData")
	public ModelAndView SaveData( Variables var)  {
		
	Session session =	sf.openSession();
	
	Transaction tr =	session.beginTransaction();
	//validation.validation(var);
		session.save(var);
		tr.commit();
		
		md.addObject("message","Registration Sucess");
		md.setViewName("home");
		return md;
	}
	
	// data-from-user = data-from-database// login success
	@RequestMapping ("loginpage")
	public ModelAndView Methodlogin(Variables userfromBrowser) {
		
		Session session=sf.openSession();
		Variables userfromDatabases = session.get(Variables.class, userfromBrowser.getUsername());		
		 if(userfromDatabases!=null)		 
	{
		 if(userfromBrowser.getPassword().equals(userfromDatabases.getPassword()))
		{
			md.setViewName("register");	
		}
		else
		{
			md.addObject("message","wrong password");
			md.setViewName("login");
		}
	}
		 else
		 {
			 md.addObject("message","wrong username");
			 md.setViewName("login");
		 }
			
		return md;
	}
	
} 
