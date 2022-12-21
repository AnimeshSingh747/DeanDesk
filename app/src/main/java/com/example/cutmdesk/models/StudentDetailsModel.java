package com.example.cutmdesk.models;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentDetailsModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("Class")
    @Expose
    private String _class;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("Roll No")
    @Expose
    private String rollNo;
    @SerializedName("Division")
    @Expose
    private String division;
    @SerializedName("Semester")
    @Expose
    private String semester;
    @SerializedName("Last name")
    @Expose
    private String lastName;
    @SerializedName("Contact No")
    @Expose
    private String contactNo;
    @SerializedName("First name")
    @Expose
    private String firstName;
    @SerializedName("Middle name")
    @Expose
    private String middleName;
    @SerializedName("Student Status")
    @Expose
    private String studentStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

}