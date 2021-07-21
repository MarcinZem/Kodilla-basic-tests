package com.kodilla.inheritance.homework;

public class Linux extends Windows {

    public Linux(int publicationDate) {
        super(publicationDate);
    }
    public void turnOnScreen() {
        System.out.println("Screen was turned on");
    }
}
