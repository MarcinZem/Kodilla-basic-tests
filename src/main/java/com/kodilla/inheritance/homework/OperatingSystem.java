package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationDate;

    public OperatingSystem(int publicationDate) {
        this.publicationDate = publicationDate;
    }


    public void turnOnScreen() {
        System.out.println("Screen was turned on");
    }

    public void turnOffScreen() {
        System.out.println("Screen was turned off");
    }

    public void OpenBrowser () {
        System.out.println("Opening 3 Browsers");
    }

    public int getPublicationDate() {
        return publicationDate;
    }
}

