package Shopify.test;

import org.testng.annotations.Test;

import Shopify.pages.login;

public class loginTest {

	@Test
	public void test() throws Exception {
		login l1 =new login();
		Thread.sleep(2000);
		l1.EnterEmail();
		Thread.sleep(2000);
		l1.submit();
		Thread.sleep(2000);
		l1.EnterPass();
		Thread.sleep(2000);
		l1.submit();
		Thread.sleep(2000);
		l1.Apps();
	}
}
