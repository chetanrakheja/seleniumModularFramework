package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/


import commonLibs.contracts.IDropdown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//TODO add javaDoc
public class DropdownControl implements IDropdown {

    private Select getSelect(WebElement element) {
        Select select = new Select(element);

        return select;
    }


    @Override
    public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {
        getSelect(element).selectByVisibleText(visibleText);
    }

    @Override
    public void selectViaValue(WebElement element, String value) throws Exception {
        getSelect(element).selectByValue(value);
    }

    @Override
    public void selectViaIndex(WebElement element, int index) throws Exception {
        getSelect(element).selectByIndex(index);
    }

    @Override
    public boolean isMultiple(WebElement element) throws Exception {
        return getSelect(element).isMultiple();
    }

    @Override
    public List<WebElement> getAllOptions(WebElement element) throws Exception {
        return getSelect(element).getOptions();
    }

    @Override
    public List<WebElement> getAllSelectedOptions(WebElement element) throws Exception {
        return getSelect(element).getAllSelectedOptions();
    }

    @Override
    public WebElement getFirstSelectedOption(WebElement element) throws Exception {
        return getSelect(element).getFirstSelectedOption();
    }
}
