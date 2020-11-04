package com.company;

public interface IBaseRate {

    default double setBaserate(){
        return 2.5;
    }
}
