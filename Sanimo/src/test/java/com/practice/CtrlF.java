package com.practice;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlF {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://64.227.142.191/sanimo/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("SHAILESH");
		driver.findElement(By.id("password")).sendKeys("SHAILESH@SANIMO");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//span[text()='Sanimo Polymers']")).click();
		driver.findElement(By.xpath("//span[text()='Sanimo Testing']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @viewBox=\"64 64 896 896\"]")).click();
		driver.findElement(By.xpath("//span[text()='Dyeing']")).click();
		driver.findElement(By.xpath("//span[text()='Dyeing Planning']")).click();

		boolean present = driver.getPageSource().contains("2SO/D/2526/001894");
		System.out.println(present);

		boolean found = false;

		while (true) {
			// Search element on current page

			List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'2SO/D/2526/002050')]"));

			Actions a = new Actions(driver);

			for (WebElement e : elements) {
				a.scrollToElement(e).perform();
			}

			if (elements.size() > 0) {
				WebElement element = elements.get(0);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].style.border='3px solid red'", element);

				System.out.println("Element Found & Highlighted");
				break;
			}

			// Try clicking NEXT button
			try {
				WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));

				a.scrollToElement(nextBtn).perform();

				if (nextBtn.isDisplayed() && nextBtn.isEnabled()) {
					nextBtn.click();
					Thread.sleep(2000); // wait page load
				} else {
					break;
				}
			} catch (NoSuchElementException e) {
				System.out.println("No more pages");
				break;
			}
		}

	}

}
