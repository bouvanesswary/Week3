package week3.Assignment;

import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListImplementation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");//Launch the URL https://www.ajio.com 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search=driver.findElementByName("searchVal");//2. In the search box, type as "bags"
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);//and press enter
		//To the left of the screen under " Gender" click the "Men"
		driver.findElementByXPath("//label[@for='Men']").click();
		
		driver.findElementByXPath("//label[@for='Men - Fashion Bags']").click();//Under "Category" click "Fashion Bags"
		// Print the count of the items found
		WebElement count=driver.findElementByXPath("//div[@class='length']");
		Thread.sleep(5000);
		System.out.println("Total Count after choosing Fashion Bags "+count.getText());
		
		//Get the list of brand of the products displayed in the page and
		//List<WebElement> brands=driver.findElementsByClassName("//div[@class='brand']");
		List<WebElement> BrandList = driver.findElements(By.className("brand"));
		//print the list.
		System.out.println("Total list of brands available "+BrandList.size());
		//Get the list of names of the bags and print it
		for(WebElement element:BrandList)
		{
			String Text=element.getText();
			System.out.println(Text);
		
		}
	
		
		
		
			}
		
		
		
		
		
		
	}


