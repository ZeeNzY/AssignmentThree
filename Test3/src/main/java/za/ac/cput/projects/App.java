package za.ac.cput.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    void method(int i) throws IllegalArgumentException {

        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }
}
