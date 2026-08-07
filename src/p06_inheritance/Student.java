package p06_inheritance;

public class Student extends Person {

    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + getName() + ".");
        System.out.println("I study at " + getSchool() + ".");
    }

}