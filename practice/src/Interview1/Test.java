package Interview1;

import Interview1.Person;

public class Test {

    public static void main(String[] args) {
        Person p = new Person("ABC");
        System.out.println(p);

        updateName(p);

        System.out.println(p);

        p.setName("DEF");

        System.out.println(p);

    }


    public static  void updateName(Person p){
       // p = new Person("were");
        p.setName("xyz");
    }
}
