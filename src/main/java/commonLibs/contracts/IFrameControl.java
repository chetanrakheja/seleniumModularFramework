package commonLibs.contracts;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import org.openqa.selenium.WebElement;

//TODO add javaDoc
public interface IFrameControl {

    public void switchToFrame(WebElement element) throws Exception;

    public void switchToFrame(int index) throws Exception;

    public void switchToFrame(String id) throws Exception;

    public void switchToParentpage() throws Exception;

}
