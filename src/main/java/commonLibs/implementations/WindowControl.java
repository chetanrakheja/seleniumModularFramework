package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.IWindowControl;
import org.openqa.selenium.WebDriver;

import java.util.Set;

//TODO add javaDoc
public class WindowControl implements IWindowControl {

    WebDriver driver;

    public WindowControl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void switchToAnyWindow(String windowhandle) throws Exception {
        driver.switchTo().window(windowhandle);
    }

    @Override
    public void switchToAnyWindow(int childWindowIndex) throws Exception {
        String childWindow = driver.getWindowHandles().toArray()[childWindowIndex].toString();
        driver.switchTo().window(childWindow);
    }

    @Override
    public String getWindowHandle() throws Exception {
        return driver.getWindowHandle();
    }

    @Override
    public Set<String> getWindowHandles() throws Exception {
        return driver.getWindowHandles();
    }
}
