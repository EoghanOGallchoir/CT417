package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void studentTests()
    {
        Student student1 = new Student("Harry Potter", 20, 04/11/1999, 12345);

        assertEquals("Name incorrect", "Harry Potter", student1.getName());
        assertEquals("Age is incorrect", 20, student1.getAge());
        assertEquals("Username is incorrect", "Harry Potter20", student1.getUsername());
        assertEquals("Date of Birth", 04/11/1999, student1.getDOB());
        assertEquals("student ID no. is incorrect", 12345, student1.getsID());
    }

    @Test
    public void ModuleTests()
    {
        Student student1 = new Student("Harry Potter", 20, 04/11/1999, 12345);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        Module module1 = new Module("Soft Eng 3", "CT4117", students);
        assertEquals("Name incorrect", "Soft Eng 3", module1.getmName());
        assertEquals("Course Code is incorrect", "CT4117", module1.getModID());
        assertNotNull("Students are missing", module1.getStudents());

    }

    @Test
    public void ProgrammeTests()
    {
        Student student1 = new Student("Harry Potter", 20, 04/11/1999, 12345);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        Module module1 = new Module("Soft Eng 3", "CT4117", students);
        ArrayList<Module> module = new ArrayList<>();
        module.add(module1);

        DateTime start = new DateTime("2019-09-01");
        DateTime end = new DateTime("2019-11-29");

        Programme pg = new Programme("CS&IT", module, students, start, end);
        assertEquals("Course name is incorrect", "CS&IT", pg.getcName());
        assertNotNull("Module missing!", pg.getModules());
        assertNotNull("Students are missing!", pg.getStudents());
        assertNotNull("Start time is missing", pg.getcStart());
        assertNotNull("End time is missing", pg.getcEnd());
        
    }
}
