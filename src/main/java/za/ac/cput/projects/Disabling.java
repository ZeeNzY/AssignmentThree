package za.ac.cput.projects;

public class Disabling {

    private String message;


    public Disabling(String message) {
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
