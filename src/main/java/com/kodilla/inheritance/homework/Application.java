package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2015);
        operatingSystem.turnOnScreen();

        Windows windows = new Windows(2010);
        windows.turnOnScreen();
        System.out.println(windows.getPublicationDate());

        Linux linux = new Linux(2009);
        linux.turnOnScreen();
        System.out.println(linux.getPublicationDate());

    }
}
