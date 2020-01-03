// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class TestselTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void testsel() {
    driver.get("https://www.amazon.in/");
    driver.manage().window().setSize(new Dimension(550, 694));
    driver.findElement(By.linkText("Today\'s Deals")).click();
    {
      WebElement element = driver.findElement(By.linkText("Today\'s Deals"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    js.executeScript("window.scrollTo(0,510)");
    js.executeScript("window.scrollTo(0,164)");
    js.executeScript("window.scrollTo(0,0)");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector("#\31 02_dealView_0 #dealImage .a-row:nth-child(2)")).click();
    vars.put("win9854", waitForWindow(2000));
    driver.switchTo().window(vars.get("win9854").toString());
    js.executeScript("window.scrollTo(0,612)");
    js.executeScript("window.scrollTo(0,612)");
    js.executeScript("window.scrollTo(0,1374)");
  }
}
