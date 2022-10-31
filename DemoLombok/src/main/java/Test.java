package main.java;


import java.util.logging.Logger;
public class Test {

    public static void main(String[] args){

        new ITest<Object>(){

            @Override
            public int hello(Object x, Object y) {
                return 0;
            }
        };

    }



}
