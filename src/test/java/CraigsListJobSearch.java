import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CraigsListJobSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://seattle.craigslist.org/d/jobs/search/jjj");
		Thread.sleep(1000);
		String miles="5";
		driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[2]/div/div[3]/input[1]")).sendKeys(miles);
		Thread.sleep(1000);
		String zip="98005";
		driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[2]/div/div[3]/input[2]")).sendKeys(zip);
		Thread.sleep(1000);
		String keyword="SDET";
		driver.findElement(By.id("query")).clear();
		driver.findElement(By.id("query")).sendKeys(keyword);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[1]/button/span[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[1]/p/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/section/section/section/div[2]/p[4]/a")).click();
		Thread.sleep(1000);
		String email="mivekulmedova@gmail.com";
		driver.findElement(By.id("S")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("D")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/section/blockquote/form/p[3]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/section/blockquote/p[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/section/header/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sortable-results\"]/ul/li[2]/p/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/section/section/div[2]/p[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("S")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("D")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/section/blockquote/form/p[3]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/section/blockquote/p[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/section/header/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		
		driver.close();
				
		
	}

}
