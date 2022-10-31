package main.java;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/*@Builder
public class Ex4Builder {
    int x;
}*/


/*@Builder(toBuilder = true)
public class Ex4Builder {
    int x;
}
Ex4Builder ex4Builder = new Ex4Builder(1).toBuilder().build();
If we want to create copies or near-copies of objects, we can add the property toBuilder = true to the @Builder annotation:
*/

/*@Builder
public class Ex4Builder {
    int x;
    @Singular List<String> sams;
}*/

/*@Builder
public class Ex4Builder {
    @Builder.Default
    private int age = 1;
// default value for age to be 1;
}*/

/*
public class Ex4Builder {
    private int age;
    private int anin;

    @Builder
    public Ex4Builder(int age){
        this.age=age;
    }
    // here if you add builder on constructor the builder will only have the parameters passed in the constructor
}
*/

/*
public class Ex4Builder extends AllParent{
    private int age;
    private int anin;

    @Builder
    public Ex4Builder(int id, int age, int anin){
        super(id);
        this.age=age;
        this.anin=anin;
    }

}
*/

@Data
@SuperBuilder
public class Ex4Builder extends ASuperParent{
    private int age;
    private int anin;
}