package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(String responsibilities, int salary) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
    public String responsibilities(){return responsibilities;}
    public int salary(){return salary;}
}





