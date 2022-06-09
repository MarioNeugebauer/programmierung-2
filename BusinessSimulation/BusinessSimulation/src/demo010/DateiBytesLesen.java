package demo010;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DateiBytesLesen {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("c:/daten/temp/testtext.txt"));
			int input = fis.read();
			while(input!=-1) {
				System.out.print((char)input);
				input = fis.read();
			}
		} catch (IOException e) {
			// Fehlermeldung ausgeben
			e.printStackTrace();
		}
	}
}
