package commonLibs.contracts;

/* @Author(
   Name = " Chetan Rakheja",
   Email = "rakhejachetan@gmail.com"
   Phone = "+919910454745"
   github= "github.com/rakhejachetan"
)*/

//TODO add javaDoc
public interface IAlerts {

    public void acceptAlert() throws Exception;

    public void rejectAlert() throws Exception;

    public String getMessageFromAlert() throws Exception;

    public boolean checkAlertPresent(int timeoutInseconds) throws Exception;

}
