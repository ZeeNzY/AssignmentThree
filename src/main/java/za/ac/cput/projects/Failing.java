package za.ac.cput.projects;

public class Failing {

    void method(int i) throws IllegalArgumentException {

        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

}
