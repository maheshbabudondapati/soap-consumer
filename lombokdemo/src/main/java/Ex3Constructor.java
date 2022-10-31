package main.java;

import lombok.*;

/*
@NoArgsConstructor
public class Ex3Constructor {
    private String field;
}
*/

/*
@AllArgsConstructor
public class Ex3Constructor {
    private int x, y;

}
*/

/*
@AllArgsConstructor(staticName = "of")
public class Ex3Constructor {
    private int x, y;

}
*/

/*
@RequiredArgsConstructor
public class Ex3Constructor {
    private int x;
    private final int y;
}
*/

/*
@RequiredArgsConstructor(staticName = "of")
public class Ex3Constructor {
    private int x;
    private final int y;
}
*/

/*
@RequiredArgsConstructor
public class Ex3Constructor<T> {
    private int x;
    private final int y;
    @NonNull private T description;

    private Ex3Constructor(int y) {
        this.y = y;
    }
}
*/


/*
@AllArgsConstructor
@NoArgsConstructor
public class Ex3Constructor extends AllParent{
    private int x, y;

    //we cant call the super constructor
}*/


/*

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Ex3Constructor<T> {
    private int x, y;
    @NonNull private T description;

    //if you declare a constructor that lombok will be generating you will get an error
    private Ex3Constructor(@NonNull T description) {
        this.description = description;
    }

}

*/
