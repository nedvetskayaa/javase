public class Task1 {

    public static void main(String[] args) {
        int number=245;
        int Hundreds = number / 100;
        int Dozens = number % 100 /10;
        int Units = number % 10;

        System.out.print("Hundreds: " + Hundreds + ". Dozens: " + Dozens + ". Units: " + Units);
    }
}
