package p11_fundamentals_review;

public class Student {

    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public void introduce() {
        System.out.println("Hi, I am " + getName() + ". I am learning " + getCourse() + ".");
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

}
