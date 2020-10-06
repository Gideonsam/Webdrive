package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\JAVA New\\softwares\\chromedriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://google.com");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		driver.close();
	}

}
