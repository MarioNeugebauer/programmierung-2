package demo010;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DateiZeilenweiseLesen {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("c:/daten/temp/testtext.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int counter=0;
			String eineZeile = br.readLine();
			while(eineZeile!=null) {
				System.out.println("Zeile "+counter+"\t"+eineZeile);
				eineZeile=br.readLine();
				counter++;
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
