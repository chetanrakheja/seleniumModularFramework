package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.IJavascript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptControl implements IJavascript {

    private JavascriptExecutor jsEngine;

    public JavascriptControl(WebDriver driver) {

        jsEngine = (JavascriptExecutor) driver;
    }

    @Override
    public void executeJavaScript(String scriptToExecute) throws Exception {
        jsEngine.executeScript(scriptToExecute);
    }

    @Override
    public void scrollDown(int x, int y) throws Exception {
        String jsCommand = String.format("window.scrollBy(%d, %d)", x, y);
        executeJavaScript(jsCommand);
    }

    @Override
    public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception {
        return jsEngine.executeScript(scriptToExecute).toString();
    }
}
