package support.web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Restaurant extends ClasseBasePageObject {

	public Restaurant(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public List<WebElement> menu() {
		return driver.findElements(By.xpath("//div[@class='menu-item-info-box-content']"));
	}
}
