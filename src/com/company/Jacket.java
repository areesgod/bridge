package com.company;

public class Jacket extends Clothes{
    public Jacket(Brands brands)
    {super(brands);}

    @Override
    public void brand() {
        System.out.println("Jacket");
        brands.name();
    }
}
