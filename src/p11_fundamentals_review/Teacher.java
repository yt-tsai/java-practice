package p11_fundamentals_review;

public class Teacher extends Person implements Workable {

    private String subject;

    // constructor
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() + ". I teach " + getSubject() + ".");
    }

    @Override
    public void work() {
        System.out.println("The teacher " + getName() + " is teaching " + getSubject() + ".");
    }

    public String getSubject() {
        return subject;
    }

}