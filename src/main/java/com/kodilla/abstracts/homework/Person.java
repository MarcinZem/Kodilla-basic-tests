package com.kodilla.abstracts.homework;

public class Person {
    private int age;
    private String name;
    private Job job;

    public Person(int age, String name, Job job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }
    public void displayResponsibilities() {
        System.out.println("Obowiązki "+this.name+" "+job.responsibilities());
    }

    public static void main(String args[]){

        Brukarz brukarz = new Brukarz("Terminowość, Umiejętność układania kostek brukowych", 3500);
        Person person = new Person(26,"Brukarz", brukarz);
        person.displayResponsibilities();

        Piekarz piekarz = new Piekarz("Umiejętność pieczenia chleba, Dyspozycyjność", 3500);
        Person person1 = new Person(33,"Piekarz", piekarz);
        person1.displayResponsibilities();



    }
}
