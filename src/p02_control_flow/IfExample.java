package p02_control_flow;

public class IfExample {

    public static void main(String[] args) {

        int score = 87;

        if (score >= 85) {
            System.out.println("Incredible");
        } else if (score >= 60) {
            System.out.println("Not Bad");
        } else {
            System.out.println("You need to study harder!!");
        }
    }

}
