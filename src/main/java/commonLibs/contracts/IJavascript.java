package commonLibs.contracts;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

//TODO add javaDoc
public interface IJavascript {

    public void executeJavaScript(String scriptToExecute) throws Exception;

    public void scrollDown(int x, int y) throws Exception;

    public String executeJavaScriptWithReturnValue(String scriptToExecute) throws Exception;


}
