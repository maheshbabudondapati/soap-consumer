package main.java;

import lombok.*;


@Data
public class Ex1Data {
    private int x;
    private int y;
}

//@Data is a convenient shortcut annotation
//@ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor
/*
 *getters for all fields, setters for all non-final fields,
 toString, equals and hashCode implementations that involve the fields of the class,
  a constructor that initializes all final fields,
  as well as all non-final fields with no initializer that have been marked with @NonNull, in order to ensure the field is never null.
*@Data is like having implicit @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
annotations on the class (except that no constructor will be generated if any explicitly written constructors already exist).
*   */


/*@Data
public class Ex1Data {
    private int x;
    private final int y;
    @NonNull private int z;
}*/

/*@Data
public class Ex1Data {
    private int x;
    private final int y;
    @NonNull private int z;
    public Ex1Data(int y){
        this.y = y;
    }
}*/

/*@Data
public class Ex1Data {
    private int x;
    private final int y;
    @NonNull private int z;
    public Ex1Data(int y, int z){
        this.y = y;
        this.z =z;
    }

    //except that no constructor will be generated if any explicitly written constructors already exist
}*/

/*@Data
public class Ex1Data {
    private int x;
    @Setter private final int y;
    @NonNull private int z;

    //adding setter method on final field will not generate the set method
}*/

/*@Data
public class Ex1Data {
    private int x;
    @Setter(AccessLevel.PACKAGE)  private int y;

    // generates an set method which is available only for package that is default set method

}*/

/*public class Ex1Data {
    private int x;

    @Data
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }

    //this generates all the getter, equals, hashcode and all args constructor but not setter method
}*/

/*public class Ex1Data {
    private int x;

    @Data(staticConstructor = "of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }

    //this generates the of method which will return a new instance and it will take the values as input arguments
}*/

/*@Data
public class Ex1Data {
    private int x;

    @Data(staticConstructor = "of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }

    //this generates the of method which will return a new instance and it will take the values as input arguments
}*/

/*@Data
public class Ex1Data {
    private int x;


    public static class Exercise<T> {
        private final String name;
        private final T value;
    }

    //if you remove @Data on the inner static class you will get compilation erros
    // since we dont have an constructor that initialize the variable

}*/

/*
@Data
public class Ex1Data {
    private int x;

    public static class Exercise<T> {
        private  String name;
        private  T value;
    }
}
*/

/*@Data
public class Ex1Data {
    private int x;

    @Data(staticConstructor = "of")
    public static class Exercise<T> {
        private  String name;
        private  T value;
    }
}*/

/*
@Data
public class Ex1Data {
    private int x;

    @Data(staticConstructor = "of")
    public static class Exercise<T> {
         @NonNull private  String name;
        private  T value;
    }
}
*/



