package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.IMouseAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//TODO add javaDoc
public class MouseControl implements IMouseAction {

    private WebDriver driver;

    public MouseControl(WebDriver driver) {
        this.driver = driver;
    }

    private Actions getAction() {
        Actions action = new Actions(driver);
        return action;
    }

    @Override
    public void dragAndDrop(WebElement source, WebElement target) throws Exception {
        getAction().dragAndDrop(source, target).build().perform();
    }

    @Override
    public void moveToElement(WebElement element) throws Exception {
        getAction().moveToElement(element).build().perform();
    }

    @Override
    public void rightClick(WebElement element) throws Exception {
        getAction().contextClick(element).build().perform();
    }

    @Override
    public void doubleClick(WebElement element) throws Exception {
        getAction().doubleClick(element).build().perform();
    }

    @Override
    public void moveToElementAndClick(WebElement element) throws Exception {
        getAction().moveToElement(element).build().perform();
    }
}
