package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int publicationDate) {
        super(publicationDate);
    }

    private static int getDate(int publicationDate) {
        return publicationDate;
    }

    public void turnOnScreen() {
        System.out.println("Screen was turned on");
    }

    public void openFile() {
        System.out.println("Opening file...");
    }

    public void closeFile() {
        System.out.println("Closing file...");
    }

    public void OpenBrowser () {
        System.out.println("Opening 2 Browsers");
    }

    }






