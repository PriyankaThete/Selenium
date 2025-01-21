package Shopify.pages;

import Shopify.generic.CommonMethod;

public class login extends CommonMethod{

	public login() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void EnterEmail() {
		EnterEmail("email","data1");
	}
	
	public void submit() {
		SubmitButton("submit");
		
	}
	public void EnterPass() {
		EnterEmail("pass","data2");
	}
	
	public void Apps() {
		SubmitButton("apps");
	}
	
}
