package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainclass.main;

public class cart extends main {

	 public void click_cart_btn() {
		 
		 WebElement el = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		 clickOnelement(el);
	 }
	
}
