package vrsecAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyPages {

	public static void main(String[] args) throws InterruptedException {
		
		
		int agejknfskjdnf = 78; //2,147,483,648 from +2,147,483,647 $       //4 bytes
		double sal = 3.45; //8 bytes
		
		
		VerifyPages ver = new VerifyPages();
		ver.add(23,56);
		
		double divReturnValue = ver.div(25,  5);
		
		System.out.println();
		
		
		ver.mul(divReturnValue, 7);
		

		/*
		 * int age= 45; double weigt = 67.3;
		 * 
		 * String str = "koteswarao.tekkem@gmail.com"; char c = 'v';
		 * 
		 * boolean isAmountDisplayed=false;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(str); System.out.println(str);
		 * 
		 * System.out.println(str);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\ktekkem\\Desktop\\sele_soft\\chromedriver_win32\\chromedriver.exe"
		 * ); // Initialize browser WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize(); driver.get(
		 * "https://igbc.in/igbc/showAccountRegistrationForm.htm?emailId=User+Email+Id&password=Password"
		 * );
		 * 
		 * driver.findElement(By.id("salutation1")).click(); WebElement countryElement =
		 * driver.findElement(By.id("country_id"));
		 * 
		 * Select countrykdfnkndf = new Select(countryElement);
		 * countrykdfnkndf.selectByIndex(1);
		 * 
		 * WebElement stateElement = driver.findElement(By.name("state_id")); Select
		 * stateSelections = new Select(stateElement);
		 * stateSelections.selectByVisibleText("Himachal Pradesh");
		 * 
		 * 
		 * 
		 * //driver.quit();
		 * 
		 * 
		 * //driver.get("http://www.google.com");
		 */

	}
//addition(3.4, 89);

	public void calculator() {

	}

	public String add(int a, int b) {

		System.out.println(a + b);
		return "hello Arjun";
	}

	public double mul(double a, int b) {
		System.out.println(a * b);
		return a*b;

	}

	public double div(int a, int b) {
		System.out.println(a/b); 
		//syso ctr+space
		int g;
		
		return a/b;
		

	}
	
	public boolean isVinodCheatedINExam() {
		
		return false;
		
	}
	
	

}
