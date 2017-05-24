/*
 * Den h�r klassen �r skapad i syfte med att den ska �rvs av andra klasser.
 * Den har en static WebDriver variable som anropas av dem klasser som �rver den h�r klassen.
 * Den har ocks� en static variable av typ JavascriptExecutor som ska anv�ndas n�r man beh�ver skrolla ner eller up.
 * init metoden f�r att starta upp firefox webl�saren
 * close metoden f�r att st�nga ner firefox webl�saren.
 */

package assignment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ParentPage {
 protected static WebDriver driver;
 protected static JavascriptExecutor js;

 public static void init(){
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohamed\\Documents\\gecko\\geckodriver.exe");
     driver = new FirefoxDriver();
     
 }
 
 public static void close(){
	 driver.quit();
 }
 }
 
