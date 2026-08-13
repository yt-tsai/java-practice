package p11_fundamentals_review;

public class Student extends Person implements Workable {

    private String course;

    // constructor
    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() + ". I am learning " + getCourse() + ".");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is studying " + getCourse() + ".");
    }

    public String getCourse() {
        return course;
    }

}
