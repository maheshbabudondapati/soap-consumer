package main.java;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/*@Getter
@Setter
public class Ex1GetterSetter {
    private int x;
    private String y;
    private boolean flag;

}*/

/*
public class Ex1GetterSetter {

    @Getter
    @Setter
    private int x;

    @Getter
    @Setter
    private String y;

}*/

/*@Getter
@Setter
public class Ex1GetterSetter {
    private String y;
    @Setter(AccessLevel.PROTECTED)
    private boolean flag;

}*/

/*
*
* @Setter(AccessLevel.PROTECTED) this is used to specify the access levels for the getter or setter methods by default the access level is public
*
* */


@Getter
@Setter
@Accessors(fluent = true, chain = true)
public class Ex1GetterSetter {

    private int x;
    private String y;
//we can make getters/setters fluent, so that getName becomes name.
//We can also make setters chainable so that setName returns the current instance instead of void.
}
