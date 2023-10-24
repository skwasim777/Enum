package Enum;

enum Seasons {
	WINTER, SUMMER, RAINY
}

public class Example02 {
	public static void main(String[] args) {
		Seasons s = Seasons.RAINY;
		Seasons s1 = Seasons.WINTER;
		Seasons s2 = Seasons.RAINY;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}
