package Interview1;

public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public void updateName(Person p){
        p.setName("xyz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Interview1.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
