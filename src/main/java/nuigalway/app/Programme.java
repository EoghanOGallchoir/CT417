package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Programme {

    private String cName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime cStart;
    private DateTime cEnd;


    public Programme(String cName, ArrayList modules, ArrayList students, DateTime cStart, DateTime cEnd){
        this.cName = cName;
        this.modules = modules;
        this.students = students;
        this.cStart = cStart;
        this.cEnd = cEnd;

    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getcStart() {
        return cStart;
    }

    public void setcStart(DateTime cStart) {
        this.cStart = cStart;
    }

    public DateTime getcEnd() {
        return cEnd;
    }

    public void setcEnd(DateTime cEnd) {
        this.cEnd = cEnd;
    }




}
