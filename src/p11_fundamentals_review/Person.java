package p11_fundamentals_review;

public class Person {

    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + ".");
    }

}