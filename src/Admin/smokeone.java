package Admin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class smokeone {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\driver\\geckodriver.exe");

		

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://fasttow-admin-uat.vercel.app/login");
		    
        
        // Log in Flow////
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fasttow@mailinator.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Octal@123");
        Thread.sleep(15000);
        driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
        
        
        Thread.sleep(10000);
        
        
        driver.findElement(By.xpath("//div[contains(@class,'block bg-gradientTo w-[220px] xl:w-[280px] fixed h-full overflow-y-auto')]//span[2]//*[name()='svg']")).click();
        
        /*
        
      /////////Add Sub Admin//////
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//a[contains(.,'Subadmin Manager')]")).click();
        Thread.sleep(2000);
    
        driver.findElement(By.xpath("//button[@title='Add subadmin']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Terry");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("terry13@mailnator.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7014013");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("lsljsfjsdf ljfljf sf fls flf ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='all']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
     
        
        //Sub Admin Search//
        
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search by email, name and Mobile number']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search by email, name and Mobile number']")).sendKeys("terry11@mailnator.com");
        Thread.sleep(2000);
        
        
        //Take screen shot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to desired location
        FileUtils.copyFile(screenshot, new File("F:\\Harsh\\Harsh Projects and details\\Fasttow\\search1.png"));
        Thread.sleep(2000);
        System.out.println("Screenshot taken successfully.");
        
        
        driver.findElement(By.xpath("//button[@title=\"Reset\"]")).click();
        
       
        
        //Sub Admin filter by calendar
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='start_date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@aria-label='May 11, 2025']")).click();        
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'end_date')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[contains(@aria-label,'May 17, 2025')])[2]")).click();
        
        Thread.sleep(10000);
        
        //Take screen shot
        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to desired location
        FileUtils.copyFile(screenshot1, new File("F:\\Harsh\\Harsh Projects and details\\Fasttow\\filter1.png"));
        Thread.sleep(2000);
        System.out.println("Filter Screenshot taken successfully.");
        
        driver.findElement(By.xpath("//button[@title=\"Reset\"]")).click();
        
        Thread.sleep(5000);
      
        /////////user manager///////////
        driver.findElement(By.xpath("//button[contains(.,'User Manager')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Customer Manager']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Export CSV']")).click();
        Thread.sleep(2000);
   
        /////search
        driver.findElement(By.xpath("//input[@placeholder='Search by email, name and Mobile number']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search by email, name and Mobile number']")).sendKeys("manish.kumar.prajapati@octalsoftware.com");
        Thread.sleep(5000);
        
        //Take screen shot
        File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to desired location
        FileUtils.copyFile(screenshot2, new File("F:\\Harsh\\Harsh Projects and details\\Fasttow\\search2.png"));
        Thread.sleep(2000);
        System.out.println("Screenshot taken successfully.");
     
        
        driver.findElement(By.xpath("//button[@title=\"Reset\"]")).click();
        
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='start_date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@aria-label='May 11, 2025']")).click();        
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'end_date')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[contains(@aria-label,'May 17, 2025')])[2]")).click();
        
        Thread.sleep(10000);
        
        //Take screen shot
        File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save the screenshot to desired location
        FileUtils.copyFile(screenshot3, new File("F:\\Harsh\\Harsh Projects and details\\Fasttow\\filter2.png"));
        Thread.sleep(2000);
        System.out.println("Filter Screenshot taken successfully.");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@title='Reset']")).click();
        Thread.sleep(5000);
        
        
        //disable activity
        
        driver.findElement(By.xpath("//tbody/tr[1]/td[7]/label[1]/div[1]")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'OK')]")).click();
        
        Thread.sleep(5000);
        
        
        
        
        driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/ul[1]/li[1]//*[name()='svg']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='Records']")).click();
        Thread.sleep(5000);
  
        
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@title='Back']")).click();
        Thread.sleep(3000);
        
        
        /////driver manager///
        
        driver.findElement(By.xpath("//span[@class='mx-1'][contains(.,'Driver Manager')]")).click();
        Thread.sleep(2000);
        
        
        //search
        driver.findElement(By.xpath("//input[@placeholder='Search by email, name and Mobile number']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search by email, name and Mobile number']")).sendKeys("driver@mailinator.com");
        Thread.sleep(5000);
       
        ///**Filter///

        
        driver.findElement(By.xpath("//button[@title=\"Reset\"]")).click();
        
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='start_date']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@aria-label='May 11, 2025']")).click();        
       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'end_date')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[contains(@aria-label,'May 17, 2025')])[2]")).click();
        
        Thread.sleep(8000);
        
        ///reset///
        driver.findElement(By.xpath("//button[@title=\"Reset\"]")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/label[1]/div[1]")).click();
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'OK')]")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/ul[1]/li[2]//*[name()='svg']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title=\"Back\"]")).click();
        Thread.sleep(7000);
        
        ///export///
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Export CSV')]")).click();
        Thread.sleep(5000);
        
        */
       
        //////service provider/////////
        
        driver.findElement(By.xpath("//span[@class='mx-1'][contains(.,'Service Provider Manager')]")).click();
        Thread.sleep(2000);
        
      
      //search//
        driver.findElement(By.xpath("//input[contains(@type,'search')]")).sendKeys("tiger@mailinator.com");
        Thread.sleep(2000); 
        
        
        driver.findElement(By.xpath("//button[@type=\"button\"][@title=\"Reset\"]")).click();
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/ul[1]/li[3]/a[1]//*[name()='svg']")).click();
        
        Thread.sleep(5000);
        
        
        
        ///Filter///

        
    
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='start_date']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@aria-label='May 11, 2025']")).click();        
       
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@name,'end_date')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[contains(@aria-label,'May 17, 2025')])[2]")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@type=\"button\"][@title=\"Reset\"]")).click();
        Thread.sleep(5000);
        
        
        driver.findElement(By.xpath("//button[@type='button'][contains(.,'Export CSV')]")).click();
        Thread.sleep(3000);
        
        
        ////service provider view details////
        
        driver.findElement(By.xpath("//tbody/tr[1]/td[9]/div[1]/ul[1]/li[3]/a[1]//*[name()='svg']")).click();  
        Thread.sleep(3000);
        
        
      //  driver.findElement(By.xpath("//h2[contains(.,'Service Provider Details')]")).click();
        
        Thread.sleep(5000);
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 1000 pixels
        js.executeScript("window.scrollBy(0,1000)");
        
     
        
     
       
        
        
        
        }

}
