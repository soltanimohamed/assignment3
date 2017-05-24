/*
 * Den här klassen är skapad i syfte med att den ska ärvs av andra klasser.
 * Den har en static WebDriver variable som anropas av dem klasser som ärver den här klassen.
 * Den har också en static variable av typ JavascriptExecutor som ska användas när man behöver skrolla ner eller up.
 * init metoden för att starta upp firefox webläsaren
 * close metoden för att stänga ner firefox webläsaren.
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
 
