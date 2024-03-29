package commonLibs.implementations;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import commonLibs.contracts.IDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//TODO add javaDoc
public class CommonDriver implements IDriver {

    private WebDriver driver;
    private int elementDetectionTimeout;
    private int pageloadTimeout;

    public CommonDriver(String browserType) throws Exception {
//TODO get elementDetectionTimeout , pageloadTimeout from property files
        elementDetectionTimeout = 10;
        pageloadTimeout = 20;

        String currentDirectory = System.getProperty("user.dir");
        browserType = browserType.trim();

        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", currentDirectory + "/driver/Chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("chrome-headless")) {
            System.setProperty("webdriver.chrome.driver", currentDirectory + "/driver/Chromedriver.exe");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--headless");
            driver = new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", currentDirectory + "/driver/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", currentDirectory + "/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            throw new Exception("Invalid Browser Type - " + browserType);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Override
    public void navigateToFirstUrl(String url) throws Exception {
        url = url.trim();
        driver.manage().timeouts().pageLoadTimeout(pageloadTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);

        driver.get(url);
    }

    @Override
    public String getTitle() throws Exception {
        return driver.getTitle();
    }

    @Override
    public String getCurrentUrl() throws Exception {
        return driver.getCurrentUrl();
    }

    @Override
    public String getPageSource() throws Exception {
        return driver.getPageSource();
    }

    @Override
    public void navigateToUrl(String url) throws Exception {
        driver.get(url);
    }

    @Override
    public void navigateForward() throws Exception {
        driver.navigate().forward();
    }

    @Override
    public void navigateBackward() throws Exception {
        driver.navigate().back();
    }

    @Override
    public void refresh() throws Exception {
        driver.navigate().refresh();
    }

    @Override
    public void closeBrowser() throws Exception {
        if (driver != null) {
            driver.close();
        }
    }

    @Override
    public void closeAllBrowsers() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}
