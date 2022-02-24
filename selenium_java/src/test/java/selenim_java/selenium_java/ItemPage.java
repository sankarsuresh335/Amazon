package selenim_java.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ItemPage {
	
	 void addToWishlist(WebDriver driver){
			
     	driver.findElement(By.id("add-to-wishlist-button-submit")).click();
     	driver.findElement(By.xpath("//*[@id=\"WLHUC_viewlist\"]/span/span")).click();
             	
     }

	
	
}
