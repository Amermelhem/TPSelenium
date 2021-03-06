/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LibraryTest {

	WebDriver driver;
	
	@Before
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void ChromeTest() {
		
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement barDeRecherche = driver.findElement(By.id("searchInput"));
        // Action can be performed on Input Text element
        barDeRecherche.sendKeys("World Cup");
        //List <WebElement> buttons = driver.findElements(By.className("lsb"));
        WebElement buttons = driver.findElement(By.id("searchButton"));
        buttons.click();
        WebElement link = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/p[1]/a"));
                link.click();
              
        WebElement title= driver.findElement(By.id("firstHeading"));
        
        Assert.assertEquals("FIFA World Cup", title.getText());
        //Assert.assertTrue(title.isDisplayed());
		
	}
	@Test
	public void testfail() {
		
		Assert.fail();
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);// endormir l'executeur pour afficher la page 
		driver.quit();// ferme la fenetre et le process
	}
	
	
}
