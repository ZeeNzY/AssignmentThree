package za.ac.cput.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    private String message;


    public App(String message) {
        this.message = message;
    }


    public String printMessage() {
        return message;
    }


    public String sayHi() {
        message = "Heyie!" + message;
        return message;
    }


    public String zinziMessage() {
        return "ZeeGee";
    }

}
