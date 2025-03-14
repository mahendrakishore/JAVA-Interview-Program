package JavaProgram;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Chrome {
    public static <Interger> void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String serach = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input";
        driver.findElement(By.xpath(serach)).click();
        driver.findElement(By.xpath(serach)).clear();
        driver.findElement(By.xpath(serach)).sendKeys("mobile");
        driver.findElement(By.xpath(serach)).sendKeys(Keys.ENTER);
        int tableSize = driver.findElements(By.xpath("//div[@class='KzDlHZ']")).size();

        System.out.println(tableSize);
         for(WebElement we : driver.findElements(By.xpath("//div[@class='KzDlHZ']"))){
             String originalWindow = driver.getWindowHandle();
          String name = we.getText();
          we.click();
             try {
                    // Store the ID of all windows currently opened
                 Set<String> allWindows = driver.getWindowHandles();

                 for (String windowHandle : allWindows) {
                     if (!windowHandle.equals(originalWindow)) {
                         driver.switchTo().window(windowHandle);
                         System.out.println("Switched to new tab successfully");
                         driver.close();
                     }
                 }
             } catch (Exception e) {
                 System.out.println("Error switching tabs:");}
             System.out.println(name);
             driver.switchTo().window(originalWindow);
         }
        for(WebElement we : driver.findElements(By.xpath("//div[@class='UkUFwK']/span"))){
            String[] name = we.getText().split("%");
            System.out.println(name[0]);
        }
        //driver.switchTo().newWindow(WindowType.WINDOW);
        driver.close();
        driver.quit();
     }
}
