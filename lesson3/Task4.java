public class Task4 {

    public static void main(String[] args) {
        int encoderDegrees = 245;
        int tireRadius = 13;
        double tireLength = 3.14 * tireRadius;
        double distance = tireLength * encoderDegrees / 360;

        System.out.print("Distance: " + distance);
    }
}
