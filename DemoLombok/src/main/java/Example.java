package main.java;


import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

//@Data // getter setter required args constructor tostring equalhashcode


@ToString
public class Example<T>{

     int xint;
     String y;
     @ToString.Exclude String z;
    @ToString.Exclude T someField;


}
