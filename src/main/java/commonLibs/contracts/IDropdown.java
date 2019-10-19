package commonLibs.contracts;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import org.openqa.selenium.WebElement;

import java.util.List;

//TODO add javaDoc
public interface IDropdown {

    public void selectViaVisibleText(WebElement element, String visibleText) throws Exception;

    public void selectViaValue(WebElement element, String value) throws Exception;

    public void selectViaIndex(WebElement element, int index) throws Exception;

    public boolean isMultiple(WebElement element) throws Exception;

    public List<WebElement> getAllOptions(WebElement element) throws Exception;

    public List<WebElement> getAllSelectedOptions(WebElement element) throws Exception;

    public WebElement getFirstSelectedOption(WebElement element) throws Exception;


}
