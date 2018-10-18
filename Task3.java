public class Task3 {

    public static void main(String[] args) {
        int HP = 54;
        if (HP < 25) {
            System.out.print("Red " + HP);
        } else if (HP < 50) {
            System.out.println("Orange " + HP);
        } else if (HP < 70){
            System.out.println("Yellow " + HP);
        } else if (HP < 100){
            System.out.println("Green " + HP);
        }

    }
}
