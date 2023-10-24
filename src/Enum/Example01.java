package Enum;

public class Example01 {
	public enum Seasons {
		WINTER, SUMMER, RANY, FALL
	}

	public static void main(String[] args) {
		for (Seasons s : Seasons.values()) {
			System.out.println(s);
		}
	}
}
