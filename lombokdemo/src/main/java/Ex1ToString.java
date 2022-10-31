package main.java;

import lombok.Getter;
import lombok.ToString;

// By default, Lombok uses all non-static fields in the implementation of toString.

/*@ToString
public class Ex1ToString {
    private int x;
    private String y;
    private boolean flag;
}*/

/*
@ToString(exclude = {"x", "y"})
public class Ex1ToString {
    private int x;
    private String y;
    private boolean flag;
}
*/

/*
@ToString
public class Ex1ToString {
    private int x;
    private String y;

    @ToString.Exclude private boolean flag;  // exclude this parameter from tostring method
}
*/

/*
@ToString(includeFieldNames=false)
public class Ex1ToString {
    private int x;
    private String y;
    private boolean flag;
}
*/

/*
@ToString(onlyExplicitlyIncluded=true)
public class Ex1ToString {
    @ToString.Include
    private int x;
    @ToString.Include
    private String y;
    private boolean flag;
}
*/

/*
@ToString(callSuper=true)
public class Ex1ToString extends AllParent{
    private int x;
    private String y;
    private boolean flag;
}
*/
