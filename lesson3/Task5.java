public class Task5 {

	public static void main(String[] args) {
		int HH = 0, MM = 0, SS = 0;
		int playingTimeInSeconds = 58520;

		HH = playingTimeInSeconds / 3600;
		MM = playingTimeInSeconds / 60 - HH * 60 ;
		SS = playingTimeInSeconds - HH * 3600 - MM * 60;

		System.out.print(HH + ":" + MM + ":" + SS);

	}
}
