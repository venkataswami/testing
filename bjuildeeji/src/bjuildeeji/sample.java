package bjuildeeji;

import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[]args) {
		
		
		
		//System.setProperty("webdriver.gecko.driver","E:\\GekoDriver\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		 System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.buildeeji.com/");
		
		System.out.println("success fully install");
		
		
	}
	
	
	
	
}
