package demo002.simgame.misc;

import demo002.simgame.model.Warenart;

public class Util {

	public static String convertWarenartToString(Warenart warenart) {
		return switch (warenart) {
		case BIER -> { 
			yield "Bier";
		}
		case WEIN -> {
			yield "Wein";
		}
		case KORN -> {
			yield "Korn";
		}
		case GLAS -> {
			yield "Glas";
		}
		case TUCH -> {
			yield "Tuch";
		}
		case GOLD -> {
			yield "Gold";
		}
	};
	}
	
}
