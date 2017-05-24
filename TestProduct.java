/*
 * Den här klassen innehåller 5 testfall
 * findAddProductTest() och continueShopTest() är buggfria.
 * deleteFromCartTest(), checkAndPlaceOrderTest(), searchProduct() har defeketer.
 */

package assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class TestProduct{
	
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
	public void findAddProductTest(){
		MainStuff.implicitWait();
		MainStuff.goToTheHomePage();
		ProductStuff.goToProductPage("google");
		ProductStuff.addToCart();
		ProductStuff.verifyBookInCart();
	}
	
	//@Ignore
	@Test
	public void continueShopTest() throws InterruptedException{
		MainStuff.implicitWait();
		findAddProductTest();
		ProductStuff.checkout();
		ProductStuff.addAnotherBookInCart();
	}
	
	//@Ignore
	@Test
	public void deleteFromCartTest() throws InterruptedException{
		findAddProductTest();
		ProductStuff.remove();
	}
	
	//@Ignore
	@Test
	public void checkAndPlaceOrderTest() throws InterruptedException{
		findAddProductTest();
		ProductStuff.checkout();
		ProductStuff.placeOrder();
	}
	
	//@Ignore
	@Test
	public void searchProduct(){
		MainStuff.goToTheHomePage();
		ProductStuff.search();
	}
}
