package nuigalway.app;

import java.util.ArrayList;

public class Module {

    private String mName;
    private String modID;
    private ArrayList<Student> students;


    public Module(String mName, String modID, ArrayList students){
        this.mName = mName;
        this.modID = modID;
        this.students = students;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
