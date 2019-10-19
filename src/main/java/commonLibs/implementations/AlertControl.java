package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.IAlerts;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

//TODO add javaDoc
public class AlertControl implements IAlerts {

    WebDriver driver;

    public AlertControl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void acceptAlert() throws Exception {
        driver.switchTo().alert().accept();
    }

    @Override
    public void rejectAlert() throws Exception {
        driver.switchTo().alert().dismiss();
    }

    @Override
    public String getMessageFromAlert() throws Exception {
        return driver.switchTo().alert().getText();
    }

    @Override
    public boolean checkAlertPresent(int timeoutInseconds) throws Exception {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }
}
