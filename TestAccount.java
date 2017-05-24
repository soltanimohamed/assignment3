/*
 * TestAccount-klassen testar att logga in med giltiga värden, ogiltiga värden, logga ut, check account.
 * validLogInTest(), logoutTest(), invalidLogInTest() är buggfria
 * checkAccountTest() har defekter.
 */

package assignment;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestAccount {
	
	@Before
	public void setup(){
		ParentPage.init();
	}
	
	@After
	public void exit(){
		ParentPage.close();
	}
    
	//@Ignore
	@Test
	public void validLogInTest(){
		AccountStuff.validLogIn("mohamed", "123456");
	}
	
	//@Ignore
	@Test
	public void checkAccountTest(){
		AccountStuff.validLogIn("mohamed", "123456");
        AccountStuff.checkAccount();
	}
	
	//@Ignore
	@Test
	public void logoutTest() throws InterruptedException{
		validLogInTest();
		AccountStuff.logout();
	}
	
	//@Ignore
	@Test
	public void invalidLogInTest(){
		AccountStuff.invalidLogIn("bla", "blabla");
	}

}
