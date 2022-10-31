package main.java;

import java.util.Comparator;

@FunctionalInterface
public interface ITest<U> {

    int hello(U x, U y);

}
