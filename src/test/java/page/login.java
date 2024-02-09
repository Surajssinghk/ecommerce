package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainclass.main;

public class login extends main {

	public void enter_valide_username_and_password(String user, String pass) {

		WebElement users = driver.findElement(By.xpath("//input[@id='user-name']"));
		users.sendKeys(user);

		WebElement passs = driver.findElement(By.cssSelector("input#password"));
		passs.sendKeys(pass);

	}

	public void validate_click_functionality() {
		WebElement btn = driver.findElement(By.xpath("//input[@id='login-button']"));
		clickOnelement(btn);
	}

}
