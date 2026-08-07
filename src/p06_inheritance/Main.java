package p06_inheritance;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Peter", 42, "Tokyo IT School");
        Student student2 = new Student("Marina", 20, "Taiwan IT School");

        String line = "-------------------";

        System.out.println(line);
        System.out.println("  Name: " + student1.getName());
        System.out.println("   Age: " + student1.getAge());
        System.out.println("School: " + student1.getSchool());
        System.out.println();
        student1.introduce();
        System.out.println();
        System.out.println(line);
        System.out.println("  Name: " + student2.getName());
        System.out.println("   Age: " + student2.getAge());
        System.out.println("School: " + student2.getSchool());
        System.out.println();
        student2.introduce();
        System.out.println();
        System.out.println(line);

        System.out.println();
        System.out.println("↓ Extra Test ↓");

        Person person = new Student("John", 25, "Osaka IT School");
        person.introduce();
        // Student.introduce() is called because the actual object is a Student
        // and the method is overridden in the Student class.

        System.out.println(line);
        // Cannot be called because getSchool() is not defined in the Person class.
        // person.getSchool();

    }
}
