package main.java;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Ex1EqualsAndHascode {
    private int x;
    private String y;
    private boolean flag;
}


/*
@EqualsAndHashCode
public class Ex1EqualsAndHascode {
    private int x;
    private String y;
    @EqualsAndHashCode.Exclude private boolean flag;


}*/

/*@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ex1EqualsAndHascode {
    private int x;
    private String y;
    @EqualsAndHashCode.Include private boolean flag;


}*/
