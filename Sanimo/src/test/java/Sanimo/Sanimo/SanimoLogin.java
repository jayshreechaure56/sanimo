package Sanimo.Sanimo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SanimoLogin {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://64.227.142.191/sanimo/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("SHAILESH");
		driver.findElement(By.id("password")).sendKeys("SHAILESH@SANIMO");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//span[text()='Sanimo Polymers']")).click();
		driver.findElement(By.xpath("//span[text()='Sanimo Testing']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @viewBox=\"64 64 896 896\"]")).click();
		driver.findElement(By.xpath("//span[text()='Raw Material v2']")).click();
		driver.findElement(By.xpath("//span[text()='GRN']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();

		
		driver.findElement(By.xpath("//div[@class='border border-secondary css-7b1t0c-control']")).click();
		driver.findElement(By.xpath("//input[@id=\"react-select-3-input\"]")).click();
	
		driver.findElement(By.xpath("//div[text()='Transport1']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-4-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='test']")).click();
		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-5-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='Non-Returnable']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-6-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='LOT001']")).click();
		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-7-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='Sanimo']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-8-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='Dyeing']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-10-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='Kgs']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-11-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='Carton']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-12-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='1st']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-13-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='Yarn Qlty']")).click();

		driver.findElement(By.xpath("//div[@class=\" css-19bb58m\"]/input[@id=\"react-select-14-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='1.400 KG - STD']")).click();

		driver.findElement(By.xpath("//input[@placeholder=\"Rate\"]")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@name='total_cartons']")).sendKeys("600");
		driver.findElement(By.xpath("//input[@name=\"total_cheese\"]")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@name='total_net_weight']")).sendKeys("10");
		driver.findElement(By.xpath("//button[text()='Add Shade Entry']")).click();

		driver.findElement(By.xpath("//input[@name=\"shade_entry[0].no_of_cartons\"]")).sendKeys("600");
		driver.findElement(By.xpath("//input[@name=\"shade_entry[0].no_of_cheese\"]")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@name=\"shade_entry[0].gross_weight\"]")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name=\"shade_entry[0].tare_weight\"]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name=\"shade_entry[0].net_weight\"]")).sendKeys("10");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Actions act = new Actions(driver);
		act.scrollToElement(submit).perform();
		submit.click();
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	}

}
