package commonLibs.contracts;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

import java.util.Set;

//TODO add javaDoc
public interface IWindowControl {


    public void switchToAnyWindow(String windowhandle) throws Exception;

    public void switchToAnyWindow(int childWindowIndex) throws Exception;

    public String getWindowHandle() throws Exception;

    public Set<String> getWindowHandles() throws Exception;


}
