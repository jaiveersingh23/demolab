package com.example.demo.model;

public class Department {
    private int dno;
    private String dname;
    private String hod;
    private int year;

    // Constructors
    public Department() {}

    public Department(int dno, String dname, String hod, int year) {
        this.dno = dno;
        this.dname = dname;
        this.hod = hod;
        this.year = year;
    }

    // Getters and Setters
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}