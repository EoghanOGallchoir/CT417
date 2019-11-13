package nuigalway.app;

import org.joda.time.DateTime;

public class Student {

    private String Name;
    private int age;
    private int DOB;
    private int sID;


    public Student(String name, int age, int DOB, int sID){
        this.Name = name;
        this.age = age;
        this.DOB = DOB;
        this.sID = sID;

    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getDOB() {
        return DOB;
    }

    public int getsID() {
        return sID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }


    public String getUsername(){

        return getName() + getAge();
    }

}
