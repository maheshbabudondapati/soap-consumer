package main.java;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;


public class Ex1NonNull<T> {
    private T description;

    public Ex1NonNull(@NonNull T description) {

        this.description = description;
    }

}

//@NonNull annotation on a method, Lombok adds a null check to the beginning of the method.
/*
* notnull will make sure the param is passed and it is not null
* */

//        Ex1NonNull ex1NonNull= new Ex1NonNull(null);