package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;

import static utilities.DriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.List;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void clickOnelement(By locator) {
		getElement(locator).click();
	}
	
	public String getElemntText(By locator) {
	    return getElement(locator).getText();
	}
	
	public void writeTextOnElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES) ));
	}
	
	public List<WebElement> getVisibleElements(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
