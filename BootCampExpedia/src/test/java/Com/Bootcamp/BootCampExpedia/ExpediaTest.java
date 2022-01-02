package Com.Bootcamp.BootCampExpedia;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ExpediaTest {
 public static WebDriver driver;
  @BeforeTest
 
  public void beforeTest() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\atdid\\eclipse-workspace\\BootCampProjects\\drivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("https://www.expedia.com/"); 
  Thread.sleep(3000); 
  }	
  
  

  @Test(priority=1)
  public void Test1() throws InterruptedException {
	  WebElement flight = driver.findElement(By.xpath("//*[@class='uitk-tab']"));
	  flight.click();
	  Thread.sleep(3000);  
	
  }
  @Test (priority=2)
   public void Test2() throws InterruptedException {
	WebElement LeavingFrom = driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[1]"));
	Thread.sleep(5000);
    LeavingFrom.sendKeys("Austin (AUS - Austin-Bergstrom Intl.)");
    Actions ob=new Actions(driver); 
    ob.sendKeys(LeavingFrom,Keys.ENTER).perform();
	Thread.sleep(3000);
			   
		  }

  @Test (priority=3)
  public void Test3() throws InterruptedException {
  WebElement GoingTo = driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[2]"));
  Thread.sleep(3000);
  GoingTo.sendKeys("New York (JFK - John F. Kennedy Intl.)");
  Actions ob=new Actions(driver); 
  ob.sendKeys(GoingTo,Keys.ENTER).perform();
  Thread.sleep(3000);
			   
		  }
  
  @Test (priority=4)
  public void Test4() throws InterruptedException {
	  WebElement Cal = driver.findElement(By.xpath("//*[@id='d1-btn']"));
	 Cal.click();	
	 Thread.sleep(3000);   
  WebElement Depart = driver.findElement(By.xpath("(//*[@data-day='1'])[2]"));
  Depart.click();	
  Thread.sleep(3000);
  WebElement done = driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
  done.click(); 
  Thread.sleep(3000);	   
		  }
  
  @Test (priority=5)
  public void Test5() throws InterruptedException {
	  WebElement Cal2 = driver.findElement(By.xpath("//*[@id='d2-btn']"));
	 Cal2.click();	
	 Thread.sleep(3000);   
  WebElement Return = driver.findElement(By.xpath("(//*[@data-day='28'])[1]"));
  Return.click();	
  Thread.sleep(3000);
  WebElement done = driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
  done.click(); 
  Thread.sleep(3000);	   
		  }
  
  @Test (priority=6)
  public void Test6() throws InterruptedException {
	  WebElement searchbutton = driver.findElement(By.xpath("//*[@data-testid='submit-button']"));
	  searchbutton.click();	
	  Thread.sleep(3000);
  
  }
  
  @Test (priority=7)
  public void Test7() throws InterruptedException {
	  WebDriverWait obj=new WebDriverWait(driver,50);  // added ExplicitWait to be able to manually solve the captcha
	  obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@data-test-id='select-link'])[1]")));
	  WebElement flight1 = driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[1]"));
	  flight1.click();
	  Thread.sleep(3000);
  } 
    @Test (priority=8)
    public void Test8() throws InterruptedException {
	  WebElement selectbutton1 = driver.findElement(By.xpath("(//*[@data-test-id='select-button'])[1]"));
	  selectbutton1.click();	
	  Thread.sleep(10000);
  
  }
     @Test (priority=9)
     public void Test9() throws InterruptedException {
	  WebElement flight2 = driver.findElement(By.xpath("(//*[@data-test-id='select-link'])[1]"));
	  flight2.click();	
	  Thread.sleep(3000);
        }
 
      @Test (priority=10)
      public void Test10() throws InterruptedException {
	  WebElement selectbutton2 = driver.findElement(By.xpath("(//*[@data-test-id='select-button'])[1]"));
	  selectbutton2.click();	
	  Thread.sleep(10000);  
	  
}
      

      @Test (priority=11)
          public void Test11() throws InterruptedException {
    	  Set<String> WinSession=driver.getWindowHandles();
	       Iterator<String>itr = WinSession.iterator();
	       String window1=itr.next();
	       String window2=itr.next();
	      Thread.sleep(5000);
	      driver.switchTo().window(window2);
	      WebElement CheckOut = driver.findElement(By.xpath(" (//*[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'])[1]"));
	      CheckOut.click();
    } 
      

      @Test (priority=12)
      public void Test12() throws InterruptedException {
	  WebElement First = driver.findElement(By.id("firstname[0]"));
	  First.sendKeys("miss");	
	  Thread.sleep(3000);   
      
      }   
      @Test (priority=13)
      public void Test13() throws InterruptedException {
	  WebElement Last = driver.findElement(By.id("lastname[0]"));
	 Last.sendKeys("Smith");	
	  Thread.sleep(3000);   
      
      }    
      @Test (priority=14)
      public void Test14() throws InterruptedException {
	  WebElement Phone = driver.findElement(By.id("phone-number[0]"));
	  Phone.sendKeys("2010002222");	
	  Thread.sleep(3000);   
      
      }  
      @Test (priority=15)
      public void Test15() throws InterruptedException {
	  WebElement Gender = driver.findElement(By.id("gender_female[0]"));
	  Gender.click();	
	  Thread.sleep(3000);   
      
      } 
      @Test (priority=16)
      public void Test16() throws InterruptedException {
      WebElement Month=driver.findElement(By.id("date_of_birth_month0"));
      Select ob= new Select(Month);
      ob.selectByValue("07");
	  Thread.sleep(3000);   
      
      } 
      @Test (priority=17)
      public void Test17() throws InterruptedException {
      WebElement Day=driver.findElement(By.id("date_of_birth_day[0]"));
      Select ob= new Select(Day);
      ob.selectByValue("21");
	  Thread.sleep(3000);   
      
      }
      @Test (priority=18)
      public void Test18() throws InterruptedException {
      WebElement Year=driver.findElement(By.id("date_of_birth_year[0]"));
      Select ob= new Select(Year);
      ob.selectByValue("2019");
	  Thread.sleep(3000);   
      
      }
      @Test (priority=19)
      public void Test19() throws InterruptedException {
      WebElement Card=driver.findElement(By.id("creditCardInput"));
      Card.sendKeys("1112454899996323");
	  Thread.sleep(3000);   
      
      }
      @Test (priority=20)
      public void Test20() throws InterruptedException {
      WebElement CardMonth=driver.findElement(By.name("creditCards[0].expiration_month"));
      Select ob= new Select( CardMonth);
      ob.selectByValue("4");
	  Thread.sleep(3000);   
      
      }
      @Test (priority=21)
      public void Test21() throws InterruptedException {
      WebElement CardYear=driver.findElement(By.name("creditCards[0].expiration_year"));
      Select ob= new Select( CardYear);
      ob.selectByValue("2026");
	  Thread.sleep(3000);   
      
      }
      @Test (priority=22)
      public void Test22() throws InterruptedException {
      WebElement BillingAddress=driver.findElement(By.name("creditCards[0].street"));
      BillingAddress.sendKeys("923 main street");
	  Thread.sleep(3000); 
      }
      @Test (priority=23)
      public void Test23() throws InterruptedException {
      WebElement City=driver.findElement(By.name("creditCards[0].city"));
      City.sendKeys("Belle Ville");
      }
      
      @Test (priority=24)
      public void Test24() throws InterruptedException {
      WebElement State=driver.findElement(By.name("creditCards[0].state"));
      Select ob= new Select(State);
      ob.selectByValue("TX");
      }
      @Test (priority=25)
      public void Test25() throws InterruptedException {
      WebElement Zip=driver.findElement(By.name("creditCards[0].zipcode"));
      Zip.sendKeys("78259");
      }
      @Test (priority=26)
      public void Test26() throws InterruptedException {
      WebElement Email=driver.findElement(By.xpath("//*[@data-validation-message='Please enter a valid email address.']"));
      Thread.sleep(3000);
      Email.sendKeys("expediatest@yahoo.com");
      }
      @Test (priority=27)
      public void Test27() throws InterruptedException {
      WebElement Completebooking=driver.findElement(By.id("complete-booking"));
      Completebooking.click();
      Thread.sleep(5000);
      }
      @AfterTest
      public void AfterTest(){
      driver.close();
    	  
      }
      
      
}