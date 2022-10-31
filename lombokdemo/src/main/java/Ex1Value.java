package main.java;

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Value;
import lombok.With;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

/*
generate immutable class
*
* make class final
* make variable private and final
no setters methods
@ToString @EqualsAndHashCode @AllArgsConstructor @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE) @Getter
default constructor to initialize all the value while creating a class*/

/*In practice, @Value is shorthand for: final @ToString @EqualsAndHashCode
@AllArgsConstructor @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE) @Getter,
 except that explicitly including an implementation of any of the relevant methods
 simply means that part won't be generated and no warning will be emitted.*/

/*@Value
public class Ex1Value {
    int inv;
    int age;
    int test;

    //this wont generate a no arg constructor
}*/


/*@Value
public class Ex1Value {
    int inv;
    @NonFinal int age;
}*/

/*@Value
public class Ex1Value {
    int inv;
    @Setter
    @NonFinal int age;

    //to generate the setter method for the non final field we need to @Setter annotation
}*/

/*@Value
public class Ex1Value {
    int inv;
    @With(AccessLevel.PACKAGE)  int test;
}*/

/*@Value
public class Ex1Value {
    int inv;
    public Ex1Value(){
        this.inv =0;
    }
}*/

/*@Value
public class Ex1Value {
    int inv;
    public Ex1Value(int inv){
        this.inv =inv;
    }
}*/

/*
@Value
public class Ex1Value {
    int inv;
    @NonFinal @PackagePrivate int xv;
}
*/



