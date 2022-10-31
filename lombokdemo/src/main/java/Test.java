package main.java;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

import java.io.IOException;

public class Test {

    // test non null which throws exception if null is passed
    public static void main(String[] args){

        Ex4Builder ex4Builder = Ex4Builder.builder().id(1).age(2).anin(3).build();
        System.out.println(ex4Builder.getId());
        System.out.println(ex4Builder.getAnin());

    }

    @SneakyThrows
    public void sneakyThrowsCheckedAndSkips() {
        throw new IOException("Checked exception");
    }
   // Although we throw an IOException here, we aren't declaring or handling.
    // @SneakyThrows fakes out the compiler.
    // In other words, Lombok doesn't wrap or replace the thrown checked exception
    // but makes the compiler think that it is an unchecked exception.

  //@SneakyThrows

/*
    @Log4j
    public class Log4jClient {
        public static void main(String[] args) {
            log.error("Error occurred", new RuntimeException("Planned"));
        }
    }
*/
}
