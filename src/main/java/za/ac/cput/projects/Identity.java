package za.ac.cput.projects;

import java.util.ArrayList;
import java.util.List;

public class Identity {

    public Boolean identity() {

        Student zee = new Student(1, "Wati");
        Student zeee = new Student(1, "Leo");
        List<Student> studentsLst = new ArrayList<Student>();
        studentsLst.add(zee);

        System.out.println("Arraylist contains Zinzi = " + studentsLst.contains(new Student(1, "Zinzi")));

        boolean id = studentsLst.contains(new Student(1, "Zinzi"));

        return id;
    }
}
