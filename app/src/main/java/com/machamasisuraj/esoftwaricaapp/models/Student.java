package com.machamasisuraj.esoftwaricaapp.models;

public class Student {
    private String fullName,address,gender;
    private int age,imageid;

    public Student(String fullName, String address, String gender, int age,int imageid) {
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.imageid=imageid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
