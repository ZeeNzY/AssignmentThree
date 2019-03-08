package za.ac.cput.projects;

public class Equality {

    public Boolean equalls() {

        Student stud1 = new Student(1, "Zinzi");
        Student stud2 = new Student(1, "Zinzi");
        System.out.println("Checking equality between alex1 and alex2 = " + stud1.equals(stud2));
        boolean stud = stud1.equals(stud2);
        return stud;
    }

}
