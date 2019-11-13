package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student1 = new Student("Harry Potter", 20, 04/11/1999, 12345);
        Student student2 = new Student("Ronald Weasley", 19, 12/12/1999, 13467);
        Student student3 = new Student("Hermione Granger", 20, 01/04/1999, 17643);

        student1.getUsername();
        student2.getUsername();
        student3.getUsername();

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        ArrayList<Student> students2 = new ArrayList<>();
        students.add(student1);
        students.add(student3);

        Module module1 = new Module("Soft Eng 3", "CT4117", students);
        Module module2 = new Module("AI", "CT401", students2);

        ArrayList<Module> module = new ArrayList<>();
        module.add(module1);
        module.add(module2);

        ArrayList<Module> modules2 = new ArrayList<>();

        module.add(module2);


        DateTime start = new DateTime("2019-09-01");
        DateTime end = new DateTime("2019-11-29");

        Programme pg = new Programme("CS&IT", module, students, start, end);
    }

}
