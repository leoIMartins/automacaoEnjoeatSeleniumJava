package support.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantList extends ClasseBasePageObject {

	public RestaurantList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void load() {
		System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
		driver.get("http://localhost:3000/restaurants");
		driver.manage().window().maximize();
	}
	
	public void go(String restaurant) {
		driver.findElement(By.xpath("//span[text()='" + restaurant + "']")).click();
	}
}
