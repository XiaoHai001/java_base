package com.shsxt.demo.am.bean;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, boolean gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }

}
