public class Main {

    public static void main(String[] args) {
        int countKillTanksFirstGamer = 12;
        int countKillTanksSecondGamer = 8;
        int scoreFirstGamer = countKillTanksFirstGamer * 100; //1200
        int scoreSecondGamer = countKillTanksSecondGamer * 100; //800
        int getExtraPoint = scoreFirstGamer + 1000;
        if (countKillTanksFirstGamer > countKillTanksSecondGamer) {
            System.out.println("First Gamer: " + scoreFirstGamer);
            System.out.println("First Gamer get extra point: " + getExtraPoint);
            System.out.println("Second Gamer: " + scoreSecondGamer);

        }
    }
}
