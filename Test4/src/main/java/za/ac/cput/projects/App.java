package za.ac.cput.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    public Boolean equalls() {

        Student stud1 = new Student(1, "Zinzi");
        Student stud2 = new Student(1, "Zinzi");
        System.out.println("Checking equality between Stud1 and stud2 = " + stud1.equals(stud2));
        boolean stud = stud1.equals(stud2);
        return stud;
    }
}
