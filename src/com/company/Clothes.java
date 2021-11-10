package com.company;

public abstract class Clothes {
    protected Brands brands;

    protected Clothes(Brands brands) {
    this.brands = brands;
    }

    abstract public void brand();
}
