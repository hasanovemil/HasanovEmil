package day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends WebDriver {

    public void get(String url){
        System.out.println("Opening the "+url+" in chrome browser");
    }
    public void close(){
        System.out.println("closing the chrome browser");
    }


}
