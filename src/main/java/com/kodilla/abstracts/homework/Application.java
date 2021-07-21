package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String args[]){

        square square = new square();
        square.polePowierzchni();
        System.out.println("Pole square to: " +square.PoleKwadratu);

        square.obwód();
        System.out.println("Obwód square to: " +square.ObwódKwadratu);

        rectangle rectangle = new rectangle();
        rectangle.polePowierzchni();
        System.out.println("Pole rectangle to: " +rectangle.PoleProsotkata);

        rectangle.obwód();
        System.out.println("Obwód rectangle to: " +rectangle.ObwódProsotkata);

        triangle triangle = new triangle();
        triangle.polePowierzchni();
        System.out.println("Pole triangle to: " +triangle.PoleTrojkata);

        triangle.obwód();
        System.out.println("Obwód triangle to: " +triangle.ObwódTrojkata);






    }

}
