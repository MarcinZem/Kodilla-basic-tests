package com.kodilla.abstracts.homework;

public class rectangle extends Shape{
    public int PoleProsotkata = 10*5;
    public int ObwódProsotkata = 10*2+5*2;
    @Override
    public int polePowierzchni() {
        return (PoleProsotkata);
    }

    @Override
    public int obwód() {
        return (ObwódProsotkata);
    }
}
