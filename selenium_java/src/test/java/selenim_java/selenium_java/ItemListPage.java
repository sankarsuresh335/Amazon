package selenim_java.selenium_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemListPage {
	
	 void clickItem(WebDriver driver) {
			
     	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a/span")).click();
     
	}
 
}


