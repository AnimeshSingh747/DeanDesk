package com.example.cutmdesk;

public class StudentReg {
    private String admissionnumber;
    private double rollno;
    private String firstname;
    private String middlename;
    private String lastname;
    private int uniqueid;
    private String classs;
    private String semester;
    private double contactno;

    public String getAdmissionnumber() {
        return admissionnumber;
    }

    public void setAdmissionnumber(String admissionnumber) {
        this.admissionnumber = admissionnumber;
    }

    public double getRollno() {
        return rollno;
    }

    public void setRollno(double rollno) {
        this.rollno = rollno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(int uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getContactno() {
        return contactno;
    }

    public void setContactno(double contactno) {
        this.contactno = contactno;
    }

    @Override
    public String toString() {
        return "StudentReg{" +
                "admissionnumber='" + admissionnumber + '\'' +
                ", rollno=" + rollno +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", uniqueid=" + uniqueid +
                ", classs='" + classs + '\'' +
                ", semester='" + semester + '\'' +
                ", contactno=" + contactno +
                '}';
    }
}
