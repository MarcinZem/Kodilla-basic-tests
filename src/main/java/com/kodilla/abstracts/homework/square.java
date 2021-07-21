package com.kodilla.abstracts.homework;

public class square extends Shape {

    public int PoleKwadratu = 10*10;
    public int ObwódKwadratu = 10*4;


    public int polePowierzchni() {
        return (PoleKwadratu);
    }


    public int obwód() {
        return (ObwódKwadratu);
    }
}
