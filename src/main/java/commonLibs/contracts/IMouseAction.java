package commonLibs.contracts;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import org.openqa.selenium.WebElement;

//TODO add javaDoc
public interface IMouseAction {


    public void dragAndDrop(WebElement source, WebElement target) throws Exception;

    public void moveToElement(WebElement element) throws Exception;

    public void rightClick(WebElement element) throws Exception;

    public void doubleClick(WebElement element) throws Exception;

    public void moveToElementAndClick(WebElement element) throws Exception;

}
