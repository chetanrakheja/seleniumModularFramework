package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.ICommonElements;
import org.openqa.selenium.WebElement;

//TODO add javaDoc
public class ElementControl implements ICommonElements {


    @Override
    public String getText(WebElement element) throws Exception {
        return element.getText();
    }

    @Override
    public void clickElement(WebElement element) throws Exception {
        element.click();
    }

    @Override
    public String getAttribute(WebElement element, String attribute) throws Exception {
        return element.getAttribute(attribute);
    }

    @Override
    public String getCssValue(WebElement element, String csspropertyName) throws Exception {
        return element.getCssValue(csspropertyName);
    }

    @Override
    public boolean isElementEnabled(WebElement element) throws Exception {
        return element.isEnabled();
    }

    @Override
    public boolean isElementVisible(WebElement element) throws Exception {
        return element.isDisplayed();
    }

    @Override
    public boolean isElementSelected(WebElement element) throws Exception {
        return element.isSelected();
    }

    @Override
    public void setText(WebElement element, String textToWrite) throws Exception {
        element.sendKeys(textToWrite);
    }

    @Override
    public void clearText(WebElement element) throws Exception {
        element.clear();
    }

    @Override
    public void changeCheckboxStatus(WebElement element, boolean expectedstate) throws Exception {
        boolean currentState = element.isSelected();
        if (currentState != expectedstate) {
            element.click();
        }

    }
}
