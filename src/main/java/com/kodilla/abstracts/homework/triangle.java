package com.kodilla.abstracts.homework;

public class triangle extends Shape{
    public int PoleTrojkata = (10*8)/2;
    public int ObwódTrojkata = 10+8+4;
    @Override
    public int polePowierzchni() {
        return (PoleTrojkata);
    }

    @Override
    public int obwód() {
        return (ObwódTrojkata);
    }
}
