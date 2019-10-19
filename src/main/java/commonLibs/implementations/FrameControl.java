package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.IFrameControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//TODO add javaDoc
public class FrameControl implements IFrameControl {

    WebDriver driver;

    public FrameControl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void switchToFrame(WebElement element) throws Exception {
        driver.switchTo().frame(element);
    }

    @Override
    public void switchToFrame(int index) throws Exception {
        driver.switchTo().frame(index);
    }

    @Override
    public void switchToFrame(String id) throws Exception {
        driver.switchTo().frame(id);
    }

    @Override
    public void switchToParentpage() throws Exception {
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }
}
