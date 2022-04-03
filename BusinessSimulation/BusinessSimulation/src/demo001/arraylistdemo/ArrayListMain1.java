package demo001.arraylistdemo;

import java.util.ArrayList;

public class ArrayListMain1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerListe = new ArrayList<Integer>();
		
		for(int i=0; i<4; i++) {
			Integer zufallszahl = (int)Math.round(Math.random()*100);
			integerListe.add(zufallszahl);
		}
		for(int i=0; i<4; i++) {
			System.out.println("Pos. "+i+": "+integerListe.get(i));
		}
	}
}
