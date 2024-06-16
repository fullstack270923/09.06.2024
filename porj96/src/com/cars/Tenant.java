package com.cars;

abstract public class Tenant implements IRent {

    abstract void payTaxes();
    //abstract void payRent();

    @Override
    public void payRent() {

    }

}
