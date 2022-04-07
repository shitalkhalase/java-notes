package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		Thread.sleep(500);
		 driver.findElement(By.linkText("Skip Sign In")).click();
	//	driver.findElement(By.xpath("/html/body")).sendKeys("abc@gmail.com"); 
	//	driver.findElement(By.cssSelector("input[@id='enterimg']")).click();
		 driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.cssSelector("a['href=/Register.html']")).click();
		//Thread.sleep(500);
		 
	 WebElement firstname = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
	 firstname.sendKeys("ABC");
				 
		 WebElement lastname = driver.findElement(By.xpath(" /html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
	     lastname.sendKeys("Def");
		 
		 WebElement Address  = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea "));
		 Address.sendKeys("Pune");
		
		 WebElement Emailaddress =driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input "));
		 Emailaddress.sendKeys("abc@gmail.com");
		 WebElement Phone=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
		 Phone.sendKeys("9090909090");
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/label")).click();
		 driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		 
		 
		 
		 
		 
		 /*driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("ABC");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Def");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Pune");
		driver.findElement(By.xpath("")).sendKeys("a"); 
		driver.findElement(By.xpath("")).sendKeys("");
		
	
		*/
		Select drpSkill=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select")));
		drpSkill.selectByVisibleText("Software");
		
		Select drpCountry=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select ")));
		drpCountry.selectByVisibleText("India");
		
		//Select drpSelectCountry=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")));
		//drpSelectCountry.selectByVisibleText("India");
		
		Select drpyear=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select")));
		drpyear.selectByVisibleText("2015");
		
		Select drpMonth=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
		drpMonth.selectByVisibleText("April");
		
		Select drpDay=new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select")));
		drpDay.selectByVisibleText("16");
		
		
		/*
	
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")).click();
	//	driver.findElement(By.cssSelector("input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("/html/body")).isSelected();  
      // driver.findElement(By.xpath("//input[@id*='google_esf']")).click();  
      //  driver.findElement(By.xpath("//input[@id*='google_esf']")).isSelected(); 
		
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]")).click();
		driver.findElement(By.xpath("/html/body")).click();
	//	driver.findElement(By.cssSelector("input[@id='Skills']")).click();
		//driver.findElement(By.xpath(" /html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]")).click();

		//driver.findElement(By.cssSelector("input[id='basicBootstrapForm']")).click();
		//driver.findElement(By.cssSelector("input[@id='yearbox']")).click();
		//driver.findElement(By.cssSelector("input[@id='daybox']")).click();
		
		 driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("admin123");
			driver.findElement(By.id("submitbtn")).click();
			//driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
		
		//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//	driver.navigate().
			
			*/
	}
}	

//    
//  /html/body/section/div/div/div[2]/form/div[3]/label